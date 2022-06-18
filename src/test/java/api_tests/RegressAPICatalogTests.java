package api_tests;

import api_setup.BaseSevice;
import com.fasterxml.jackson.core.JsonProcessingException;
import tests_config.CatalogData;
import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;

import static tests_config.ValidationParameters.*;

public class RegressAPICatalogTests extends BaseSevice {
    CatalogData catalogData = new CatalogData();

    public RegressAPICatalogTests() throws Exception {
        super();
    }

    @BeforeTest
    private void beforeClass() {
        ResponseSpecBuilder responseSpecBuilder = new ResponseSpecBuilder().expectStatusCode(200)
                .log(LogDetail.ALL);
        RestAssured.responseSpecification = responseSpecBuilder.build();
    }

    @Test(description = "Verify the column values for metadata and productCode")
    public void VerifyColmetadataAndProductCode() {
        Assert.assertTrue(catalogData.getOptionsMap().getProductCode().equals(PRODUCT_CODE));
        Assert.assertTrue(catalogData.getOptionsMap().getMetadata().getBrand().equals(BRAND));
        Assert.assertTrue(catalogData.getOptionsMap().getMetadata().getTitle().contains(TILTE));
        Assert.assertTrue(catalogData.getOptionsMap().getMetadata().getCategoryCode().equals(CATEGORY_CODE));
    }


    @Test(description = "Verify the column values for productOptions")
    public void VerifyProductOptions() {
        Assert.assertTrue(catalogData.getOptionsMap().getProductOptions().stream().
        anyMatch(x->x.getDisplayName().equals(DYSPLAY_NAME)));
        Assert.assertTrue(catalogData.getOptionsMap().getProductOptions().stream().
        anyMatch(x->x.getValues().stream().anyMatch(y->y.getUniqueKey().equals(UNIQUE_KEY))));
        Assert.assertTrue(catalogData.getOptionsMap().getProductOptions().stream().
        anyMatch(x->x.getValues().stream().anyMatch(i->i.getValue().equals(COLOR_VALUE))));
    }

    @Test(description = "Verify the column values for bluePrintOptions")
    public void VerifyColBluePrintOptions() {
        Assert.assertTrue(catalogData.getOptionsMap().getBlueprintOptions().stream().
        anyMatch(y-> y.getSkuCode().equals(SKU_CODE)));
        Assert.assertTrue(catalogData.getOptionsMap().getBlueprintOptions().stream().
        anyMatch(y->y.getStyleId().equals(STYLE_ID)));
        Assert.assertTrue(catalogData.getOptionsMap().getBlueprintOptions().stream().
        anyMatch(y->y.getOptions().stream().anyMatch(i->i.getDefaultValue().equals(DEFAULT_VALUE))));
        Assert.assertTrue(catalogData.getOptionsMap().getBlueprintOptions().stream().
        anyMatch(y->y.getOptions().stream().anyMatch(i->i.getKey().equals(KEY_VALUE))));
    }

    @Test(description = "Verify the column values for hashedMD5 values")
    public void VerifyHashedOptions() throws JsonProcessingException, UnsupportedEncodingException,
        NoSuchAlgorithmException {
        Assert.assertTrue(catalogData.getHashValues().size() == catalogData.getHashValuesFromOptionsMapStrings().
                size());
        Assert.assertTrue(catalogData.getHashValuesFromOptionsMapStrings().stream().anyMatch(value->catalogData.
                getHashValues().equals(value)));

    }

    @Test(description = "Verify the values for color")
    public void VerifyHashValues() {
        Assert.assertTrue(catalogData.checkHexCodeOfColor(catalogData.getColorValue()));
    }

}
