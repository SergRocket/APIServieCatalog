package rest_spec;

import api_setup.BaseSevice;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import java.io.IOException;

public abstract class RestSpecRegression extends BaseSevice {
    //protected abstract String getBasePath();
    public RequestSpecification REQUEST_SPECIFICATION;
    public RestSpecRegression() throws Exception {
        super();
        REQUEST_SPECIFICATION = new RequestSpecBuilder()
                .setBaseUri(BaseUrl)
                .setBasePath(BasePath)
                .addHeader("Accept", "application/json")
                .build();
    }
}
