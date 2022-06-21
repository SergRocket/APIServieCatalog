package rest_spec;

import api.setup.BaseSevice;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public abstract class RestSpecRegression extends BaseSevice {
    //protected abstract String getBasePath();
    public RequestSpecification requestSpecification;
    public RestSpecRegression() throws Exception {
        super();
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri(baseUrl)
                .setBasePath(basePath)
                .addHeader("Accept", "application/json")
                .build();
    }
}
