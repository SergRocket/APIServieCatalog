package api_setup;

import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.MediaEntityBuilder;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;

@Listeners({Reporter.class})
public class BaseSevice extends PropertiesReading{
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
    private static ThreadLocal<ExtentTest> parentTest = new ThreadLocal<>();
    private String suiteName;
    public String testName;
    public String env = getEnv();
    public String BaseUrl = getValue(env+".shutterfly.com", "baseUrl");
    public String BasePath = getValue(env+".shutterfly.com", "basePathRegression");

    @BeforeClass
    public synchronized void beforeClass(ITestContext testContext){
        suiteName = testContext.getCurrentXmlTest().getSuite().getName();
        ExtentTest extentTest = ExtentReportManager.getiInstanceOfExtentReports(suiteName).
        createTest(getClass().getName());
        parentTest.set(extentTest);
    }

    @BeforeMethod
    public void beforeMethosSetup(Method method, ITestContext context){
        ExtentTest extentTest = parentTest.get().createNode(method.getName());
        test.set(extentTest);
        testName = method.getName();
        Reporter.log("Method - "+testName+" - has started");
    }

    @AfterMethod
    public void afterMethodSetup(ITestResult result) throws IOException {
        if(result.getStatus() == ITestResult.FAILURE){
            test.get().fail(result.getThrowable());
            String exeptionMessage = Arrays.toString(result.getThrowable().getStackTrace());
            test.get().fail("<details><summry><b><font color = red>Exeption Occured, click to see details: "
            + "</font></b></summary>" + exeptionMessage.replaceAll(",", "<br>") + "</details> \n");
            Reporter.logOnFail("Test has failed");
        } else if(result.getStatus() == ITestResult.SKIP)
            test.get().skip(result.getThrowable());
        else
            test.get().pass("Test has passed");
        ExtentReportManager.getiInstanceOfExtentReports(suiteName).flush();
        Reporter.log("Begin stopping tests");
    }

    public BaseSevice() throws Exception {super();}

    public static ThreadLocal<ExtentTest> getTest(){
        return test;
    }

}
