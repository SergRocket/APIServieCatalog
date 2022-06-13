package TestsConfig;

import APIEndpoints.EndPointsCatalogRegress;
import APISetup.ImageURL;
import APISetup.OptionsMap;
import RestSpecs.RestSpecRegression;

import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;

public class CatalogData extends RestSpecRegression {

    public List<OptionsMap> getOptionsMap(){
    List<OptionsMap> optionsMapData = given().spec(REQUEST_SPECIFICATION).
    get(EndPointsCatalogRegress.GET_PRODUCT).then().
    statusCode(200).extract().body().jsonPath().getList("optionResourceMap.optionsMap", OptionsMap.class);
    return optionsMapData;
  }

    public List<String> getOptionsValue(){
        List<String> pipOptdataPaperFinish = given().spec(REQUEST_SPECIFICATION).
                get(EndPointsCatalogRegress.GET_PRODUCT).then().
                statusCode(200).extract().body().jsonPath().getList("blueprintOptions.options[0].values[0]" +
                        ".childOptions[0].values[0].findAll{it.value == 'Matte'}.value");
        return pipOptdataPaperFinish;
    }

    public List<ImageURL> getProductVerifyImageLink() {
        List<ImageURL> productOptdata = given().spec(REQUEST_SPECIFICATION).
                get(EndPointsCatalogRegress.GET_PRODUCT).then().
                statusCode(200).extract().body().jsonPath().getList("optionResourceMap.imageUrls[26]", ImageURL.class);

        return productOptdata;
    }


}
