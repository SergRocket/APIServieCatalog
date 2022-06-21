package api.setup;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReading {
    public String getEnv() throws IOException {
        String filePath = "src/main/resources/config.properties";
        Properties properties = new Properties();
        FileInputStream inputStream = new FileInputStream(filePath);
        properties.load(inputStream);
        return properties.getProperty("env", "beta");
    }

    public String getValue(String envAndDomain, String value) throws Exception {
        String filePath = "src/main/resources/config.properties";
        Properties properties = new Properties();
        FileInputStream inputStream = new FileInputStream(filePath);
        properties.load(inputStream);
        return properties.getProperty(value);
    }

}
