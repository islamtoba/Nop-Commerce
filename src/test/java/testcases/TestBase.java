package testcases;

import common.MyScreenRecorder;
import drivers.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class TestBase {


    static protected WebDriver driver;

    @Parameters("browser")
    @BeforeTest
    public void setupDriver(@Optional("chrome")String browser) throws Exception {
//        //Start Recording
//        MyScreenRecorder.startRecording("Sprint1");

        driver = DriverFactory.getNewInstance(browser);
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
    }

    @AfterTest
    public void tearDown() throws Exception {
        if (driver != null) {
            driver.quit();
        }
//        // stop recording
//        MyScreenRecorder.stopRecording();
    }
}
