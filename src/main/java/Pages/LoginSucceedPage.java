package Pages;

import org.openqa.selenium.By;

import static support.Helpers.driver;
import static support.Helpers.find_element;

/**
 * Created by vunguyen on 02/07/2015.
 */
public class LoginSucceedPage  {

    By loginPageTitle = By.xpath("//*[@id=\"loginPopup\"]/div[1]/div");
    By username = By.id("Email");
    By password = By.id("Password");
    By loginBtn = By.xpath("//*[@id=\"bt-login\"]");
    //By forgotPageRef = By.xpath("//*[@id=\"popupLoginForm\"]/div/div[3]/table/tbody/tr[1]/td[1]/div[2]/a");
    //By registerPageRef = By.xpath("//*[@id=\"bt-register\"]");
    By loginNameSucceedRef = By.xpath("//*[@id=\"account\"]/div[1]/div/a/span/span");

    public Boolean loginPageLoaded1() {
        return find_element(loginPageTitle).getText().equals("Login");
    }


    public void loginToLoginPage1(String user, String pass) {
        find_element(username).sendKeys(user);
        find_element(password).sendKeys(pass);
        find_element(loginBtn).click();
        driver.navigate().back();

    }
    public void gotoListViewLogin() {find_element(loginNameSucceedRef).click();}

}


