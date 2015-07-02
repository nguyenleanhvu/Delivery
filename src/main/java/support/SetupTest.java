package support;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import static support.Helpers.driver;

/**
 * Created by vunguyen on 24/06/2015.
 */
public class SetupTest {
    @BeforeMethod
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("http://www.deliverynow.vn/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Helpers.init(driver);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
