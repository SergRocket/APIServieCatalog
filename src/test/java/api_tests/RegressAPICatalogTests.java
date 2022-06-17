package api_tests;

import api_setup.BaseSevice;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonProcessingException;
import tests_config.CatalogData;
import tests_config.PricingCatalogData;
import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;

public class RegressAPICatalogTests extends BaseSevice {
    CatalogData catalogData = new CatalogData();
    PricingCatalogData pricingCatalogData = new PricingCatalogData();
    @BeforeTest
    private void beforeClass() {
        ResponseSpecBuilder responseSpecBuilder = new ResponseSpecBuilder().expectStatusCode(200)
                .log(LogDetail.ALL);
        RestAssured.responseSpecification = responseSpecBuilder.build();
    }

    @Test(description = "Verify the column values for metadata and productCode")
    public void VerifyColmetadataAndProductCode() {
        Assert.assertTrue(catalogData.getOptionsMap().getProductCode().equals("1431302"));
        Assert.assertTrue(catalogData.getOptionsMap().getMetadata().getBrand().equals("SFLY"));
        Assert.assertTrue(catalogData.getOptionsMap().getMetadata().getTitle().contains("Wreathed in Joy"));
        Assert.assertTrue(catalogData.getOptionsMap().getMetadata().getCategoryCode().equals("93491"));
    }


    @Test(description = "Verify the column values for productOptions")
    public void VerifyProductOptions(){
        Assert.assertTrue(catalogData.getOptionsMap().getProductOptions().stream().
        anyMatch(x->x.getDisplayName().equals("DESIGN COLOR")));
        Assert.assertTrue(catalogData.getOptionsMap().getProductOptions().stream().
        anyMatch(x->x.getValues().stream().anyMatch(y->y.getUniqueKey().equals("#2C1E16-Brown"))));
        Assert.assertTrue(catalogData.getOptionsMap().getProductOptions().stream().
        anyMatch(x->x.getValues().stream().anyMatch(i->i.getValue().equals("#2C1E16"))));
    }

    @Test(description = "Verify the column values for bluePrintOptions")
    public void VerifyColBluePrintOptions() {
        Assert.assertTrue(catalogData.getOptionsMap().getBlueprintOptions().stream().
        anyMatch(y->y.getSkuCode().equals("1431303")));
        Assert.assertTrue(catalogData.getOptionsMap().getBlueprintOptions().stream().
        anyMatch(y->y.getStyleId().equals("22505")));
        Assert.assertTrue(catalogData.getOptionsMap().getBlueprintOptions().stream().
        anyMatch(y->y.getOptions().stream().anyMatch(i->i.getDefaultValue().equals("Regular"))));
        Assert.assertTrue(catalogData.getOptionsMap().getBlueprintOptions().stream().
        anyMatch(y->y.getOptions().stream().anyMatch(i->i.getKey().equals("PAPER_TYPE"))));
    }

    @Test(description = "Verify the column values for hashedMD5 values")
    public void VerifyHashedOptions() throws JsonProcessingException, UnsupportedEncodingException,
        NoSuchAlgorithmException {
        Assert.assertTrue(catalogData.getHashValues().size() == catalogData.getHashValuesFromOptionsMapStrings()
        .size());
        Assert.assertTrue(catalogData.getHashValuesFromOptionsMapStrings().stream().anyMatch(value->catalogData.getHashValues().
        equals(value)));

    }

    @Test(description = "Verify the values for color")
    public void VerifyHashValues() {
        Assert.assertTrue(catalogData.checkHexCodeOfColor(catalogData.getColorValue()));
    }

    @Test(description = "Verify the columns with bluePrintOptions")
    public void VerifySalePricingForDiffrntProducts(){
        HashMap<String, Object> mainParam = new HashMap<>();
        mainParam.put("productCode", "2037481");
        mainParam.put("skuCode","1084038");
        String[] skus = {"PLATE01","SQUARE8X870"};
        mainParam.put("sku", Arrays.asList(skus));
        pricingCatalogData.getPricingSummaryValidation(mainParam);
    }

    @Test(description = "Verify the column name of the Cards & Stationery")
    public void VerifyColNamesChildsInGoogleFeed(){
        Assert.assertTrue(catalogData.getOptionsValue().stream().anyMatch(x->x.contains("Matte")));
    }

}
