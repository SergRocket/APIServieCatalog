package TestsConfig;

import APIEndpoints.EndPointsCatalogRegress;
import APISetup.PricingMap;
import RestSpecs.RestSpecRegressionPricing;
import org.testng.Assert;

import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;

public class PricingCatalogData extends RestSpecRegressionPricing {

    public void getPricingSummaryValidation(HashMap<String,Object> mainParam){
        List<PricingMap> pricingItemData = given().spec(REQUEST_SPECIFICATION).
                params(mainParam).get(EndPointsCatalogRegress.GET_PRICING_SALE_AND_REGURAL).then().
                statusCode(200).extract().body().jsonPath().
                getList("pricingItem", PricingMap.class);

        Assert.assertTrue(pricingItemData.stream()
                .anyMatch(x->x.getOrigTotalPrice().equals(19.99)));
        Assert.assertTrue(pricingItemData.stream()
                .anyMatch(x->x.getOrigUnitPrice().equals(19.99)));
        Assert.assertTrue(pricingItemData.stream()
                .anyMatch(x->x.getSaleUnitPrice().equals(19.99)));
        Assert.assertTrue(pricingItemData.stream()
                .anyMatch(x->x.getSaleTotalPrice().equals(19.99)));
        Assert.assertTrue(pricingItemData.stream()
                .anyMatch(x->x.getSku().equals("PLATE01")));
        Assert.assertTrue(pricingItemData.stream()
                .anyMatch(x->x.getOrigTotalPrice().equals(3.49)));
        Assert.assertTrue(pricingItemData.stream()
                .anyMatch(x->x.getOrigUnitPrice().equals(3.49)));
        Assert.assertTrue(pricingItemData.stream()
                .anyMatch(x->x.getSaleUnitPrice().equals(3.49)));
        Assert.assertTrue(pricingItemData.stream()
                .anyMatch(x->x.getSaleTotalPrice().equals(3.49)));
        Assert.assertTrue(pricingItemData.stream()
                .anyMatch(x->x.getSku().equals("SQUARE8X870")));
    }
}
