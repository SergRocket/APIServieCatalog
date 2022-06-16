package tests_config;

import api_endpoints.EndPointsCatalogRegress;
import api_setup.ImageURL;
import api_setup.pojo_objects.BlueprintOption;
import io.restassured.RestAssured;
import rest_spec.RestSpecRegression;

import java.util.List;

import static io.restassured.RestAssured.given;

public class CatalogData extends RestSpecRegression {

    public BlueprintOption getOptionsMap(){
        BlueprintOption optionsMapData = RestAssured.given().spec(REQUEST_SPECIFICATION).
    get(EndPointsCatalogRegress.GET_PRODUCT).then().
    statusCode(200).extract().body().as(BlueprintOption.class);
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
