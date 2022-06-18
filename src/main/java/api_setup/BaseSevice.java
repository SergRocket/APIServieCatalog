package api_setup;

import java.io.IOException;

public class BaseSevice extends PropertiesReading{

    public String env = getEnv();
    public String BaseUrl = getValue(env+".shutterfly.com", "baseUrl");
    public String BasePath = getValue(env+".shutterfly.com", "basePathRegression");

    public BaseSevice() throws Exception {
        super();
    }

}
