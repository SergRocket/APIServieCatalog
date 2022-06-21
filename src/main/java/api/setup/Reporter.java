package api.setup;

import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.IInvokedMethodListener;
import org.testng.ITestListener;

public class Reporter implements Filter, IInvokedMethodListener, ITestListener {
    private static final Logger LOGGER = LogManager.getLogger(Reporter.class.getName());

    public static void log(String string){printMessage(string);}

    private static void printMessage(String message){
        BaseSevice.getTest().get().info(message);
        LOGGER.info(message);
    }

    public static void logOnFail(String string){
        LOGGER.error(string);
    }

    @Override
    public Response filter(FilterableRequestSpecification requestSpec, FilterableResponseSpecification responseSpec,
                           FilterContext ctx) {
        Response response = ctx.next(requestSpec, responseSpec);
        if (response.statusCode() >= 400) {
        logOnFail("Test has failed and status code is 400 or higher");
        }
        return response;
    }
}
