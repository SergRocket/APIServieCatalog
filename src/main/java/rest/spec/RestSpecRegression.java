package rest.spec;

import api.setup.BaseSevice;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public abstract class RestSpecRegression extends BaseSevice {
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
