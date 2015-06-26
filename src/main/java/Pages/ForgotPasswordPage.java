package Pages;

import org.openqa.selenium.By;

import static support.Helpers.driver;
import static support.Helpers.find_element;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by vunguyen on 24/06/2015.
 */
public class ForgotPasswordPage{

    //By forgotPageTitle = By.xpath("//div[7]/div/div/form/h1");
    By email = By.id("Email");
    By sendEmail = By.xpath("//*[@id=\"send-email\"]");

    public Boolean forgotPageLoaded() {
        return find_element(sendEmail).isDisplayed();
    }

    public void loginToForgotPage(String Email) {
        find_element(email).sendKeys(Email);
        find_element(sendEmail).click();
        driver.navigate().back();
    }
}
