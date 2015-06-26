package Pages;

import org.openqa.selenium.By;

import static support.Helpers.driver;
import static support.Helpers.find_element;

/**
 * Created by vunguyen on 24/06/2015.
 */
public class LoginPage {

    By loginPageTitle = By.xpath("//*[@id=\"loginPopup\"]/div[1]/div");
    By username = By.id("Email");
    By password = By.id("Password");
    By loginBtn = By.xpath("//*[@id=\"bt-login\"]");
    By forgotPageRef = By.xpath("//*[@id=\"popupLoginForm\"]/div/div[3]/table/tbody/tr[1]/td[1]/div[2]/a");
    By registerPageRef = By.xpath("//*[@id=\"bt-register\"]");


    public Boolean loginPageLoaded() {
        return find_element(loginPageTitle).getText().equals("Login");
    }

    public void loginToLoginPage(String user, String pass) {
        find_element(username).sendKeys(user);
        find_element(password).sendKeys(pass);
        find_element(loginBtn).click();
        driver.navigate().back();
    }
    public void gotoForgotPage() {find_element(forgotPageRef).click();}
    public void gotoRegisterPage() {find_element(registerPageRef).click();}

}

