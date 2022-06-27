package tests.config;

import api.setup.pojo.objects.BlueprintOption;
import api.setup.pojo.objects.ColorData;
import api.setup.pojo.objects.OptionsBlue;
import api.setup.pojo.objects.OptionsMap;
import api.setup.pojo.objects.ResourceMap;
import api.endpoints.EndPointsCatalogRegression;
import api.setup.Reporter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import rest.spec.RestSpecRegression;

import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;

import static tests.config.ValidationParameters.COLOR_HEXNAME;


public class CatalogData extends RestSpecRegression {

    public CatalogData() throws Exception {
        super();
    }

    public BlueprintOption getOptionsMap() {
       BlueprintOption optionsMapData = RestAssured.given().spec(requestSpecification).
       filter(new Reporter()).get(EndPointsCatalogRegression.GET_PRODUCT).then().
       statusCode(200).extract().body().as(BlueprintOption.class);
       Reporter.log("Getting response body and performing deserialization");
    return optionsMapData;
  }

    public BlueprintOption getOptionsHashMap() {
        BlueprintOption optionsMapData = RestAssured.given().spec(requestSpecification).
        filter(new Reporter()).get(EndPointsCatalogRegression.GET_PRODUCT_WITH_HASH).then().
        statusCode(200).extract().body().as(BlueprintOption.class);
        Reporter.log("Getting response body and performing deserialization");
        return optionsMapData;
    }

    public List<String> getHashValues() {
        BlueprintOption optionsMapData = RestAssured.given().spec(requestSpecification).
        filter(new Reporter()).get(EndPointsCatalogRegression.GET_PRODUCT_WITH_HASH).then().
        statusCode(200).extract().body().as(BlueprintOption.class);
        List<String> hashValues = optionsMapData.getOptionResourceMap().stream().map(ResourceMap::getOptionsResourceUID)
                .collect(Collectors.toList());
        Reporter.log("Getting response body and performing deserialization + getting hash values from JSON");
        return hashValues;
    }

    public List<String> getHashValuesFromOptionsMapStrings() throws JsonProcessingException, NoSuchAlgorithmException {
        ArrayList<Map<String,String>> optionsMapData = RestAssured.given().spec(requestSpecification).
        filter(new Reporter()).get(EndPointsCatalogRegression.GET_PRODUCT_WITH_HASH).then().
        statusCode(200).extract().body().jsonPath().get("optionResourceMap.optionsMap");
        Reporter.log("Getting response body and performing deserialization + getting the map of productOptions");
        List<String> keyListAfterHasing = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();
        List<String> keyListForHasing = new ArrayList<>();
        for(Map<String, String> as : optionsMapData){
            keyListForHasing.add(objectMapper.writeValueAsString(as));
        }
        Reporter.log("Adding to each option value in the map brackets to perform valid hashing");
        for(String s : keyListForHasing){
            keyListAfterHasing.add(DatatypeConverter.printHexBinary(
        MessageDigest.getInstance("MD5").digest(s.getBytes(StandardCharsets.UTF_8))).toLowerCase());
        }
        Reporter.log("Performing hashing in MD5 format for all values from the map");
        return keyListAfterHasing;
    }

    public String getColorValue() {
        List<String> colorValue = getOptionsMap().getBlueprintOptions().stream().filter((entry) -> entry.getSkuCode()
                .contains("143")).map(OptionsBlue::getOptionsMap).toList().get(1).stream().map(OptionsMap::getColor).filter(color -> color.equals("#2C1E16")).toList();
        Reporter.log("Getting color value from the JSON");
        StringBuilder stringBuilder =new StringBuilder();
        String value = stringBuilder.append(colorValue.get(0)).toString().replaceAll("#", "");
        Reporter.log("Removing # value to perform valid color hex test");
        return value;
    }

    public boolean checkHexCodeOfColor(String colorValue) {
        final RequestSpecification REQUEST_SPECIFICATION = new RequestSpecBuilder()
                .setBaseUri("https://api.color.pizza")
                .setBasePath("/v1/")
                .setContentType(ContentType.JSON)
                .build();
        ColorData response =  given()
                .spec(REQUEST_SPECIFICATION)
                .when().filter(new Reporter()).get(colorValue)
                .then().statusCode(200).extract().body().as(ColorData.class);
        Reporter.log("Getting response body and performing deserialization");
       boolean matcher = response.getPaletteTitle().equals(COLOR_HEXNAME);
        Reporter.log("Validating given hex color value matches the value received from third side API");
       return matcher;
    }

}
