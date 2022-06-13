package APITests;

import APISetup.BaseSevice;
import TestsConfig.CatalogData;
import TestsConfig.PricingCatalogData;
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
    public void VerifyColNamesCSProductsInGoogleFeed(){
        catalogData.getOptionsMap();
        Assert.assertTrue(catalogData.getOptionsMap().stream().allMatch(x->x.getColor().equals("#2C1E16")));
        Assert.assertTrue(catalogData.getOptionsMap().stream().anyMatch(x->x.getcARD_SIZE_ID().equals("23")));
        Assert.assertTrue(catalogData.getOptionsMap().stream().anyMatch(x->x.getgREETING().equals("CHRISTMAS")));
        Assert.assertTrue(catalogData.getOptionsMap().stream().anyMatch(x->x.getpAPER_TYPE().contains("Regular")));
        Assert.assertTrue(catalogData.getOptionsMap().stream().anyMatch(x->x.gettRIM().equals("Regular")));
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
