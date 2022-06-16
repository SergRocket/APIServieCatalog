package api_tests;

import api_setup.BaseSevice;
import com.fasterxml.jackson.core.JsonProcessingException;
import tests_config.CatalogData;
import tests_config.PricingCatalogData;
import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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

    @Test(description = "Verify the column names of the Cards & Stationery " +
            "products permutations in the Google feed")
    public void VerifyColNamesCSProductsInGoogleFeed() throws JsonProcessingException {
        Assert.assertTrue(catalogData.getOptionsMap().getProductCode().equals("1431302"));
        Assert.assertTrue(catalogData.getOptionsMap().getMetadata().getBrand().equals("SFLY"));
        Assert.assertTrue(catalogData.getOptionsMap().getMetadata().getTitle().contains("Wreathed in Joy"));
        Assert.assertTrue(catalogData.getOptionsMap().getMetadata().getCategoryCode().equals("93491"));
    }

    @Test(description = "Verify the column name of the Cards & Stationery")
    public void VerifyColNamesChildsInGoogleFeed(){
        Assert.assertTrue(catalogData.getOptionsValue().stream().anyMatch(x->x.contains("Matte")));
    }

    @Test(description = "Verify image Links in Catalog")
    public void VerifyImageLink(){
        Assert.assertTrue(catalogData.getProductVerifyImageLink()
                .stream().anyMatch(x->x.getLabel().equals("FRONT")));
        Assert.assertTrue(catalogData.getProductVerifyImageLink()
                .stream().anyMatch(x->x.getImageUrl().equals("https://c2-beta.staticsfly.com/" +
                        "asset/fetch/cs/STATIONERYCARD_6x8-89017-22504-MERCHLARGE_FRONT-REGULAR/thumbnail.preview/v7")));
    }

    @Test(description = "Verify sale price of different products from the catalog")
    public void VerifySalePricingForDiffrntProducts(){
        HashMap<String, Object> mainParam = new HashMap<>();
        mainParam.put("productCode", "2037481");
        mainParam.put("skuCode","1084038");
        String[] skus = {"PLATE01","SQUARE8X870"};
        mainParam.put("sku", Arrays.asList(skus));
        pricingCatalogData.getPricingSummaryValidation(mainParam);
    }



}
