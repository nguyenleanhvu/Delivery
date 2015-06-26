package Pages;

import org.openqa.selenium.By;

import static support.Helpers.driver;
import static support.Helpers.find_element;

/**
 * Created by vunguyen on 25/06/2015.
 */
public class RegisterPage {

    //By loginPageTitle = By.xpath("//*[@id=\"loginPopup\"]/div[1]/div");
    By registerPageTitle = By.xpath("//*[@id=\"popup-register-div\"]/div/div[1]");
    By FirstName = By.xpath("//*[@id=\"Reg_FirstName\"]");
    By LastName = By.xpath("//*[@id=\"Reg_LastName\"]");
    By Email = By.xpath("//*[@id=\"Reg_Email\"]");
    By Password = By.xpath("//*[@id=\"Reg_Password\"]");
    By ConfirmPassword = By.xpath("//*[@id=\"Reg_ConfirmPassword\"]");
    By registerBtn = By.xpath("//*[@id=\"popup-register-div\"]/div/table/tbody/tr[7]/td[1]/input[1]");

    By registerPageRef = By.xpath("//*[@id=\"bt-register\"]");

    public void gotoRegisterPage() {find_element(registerPageRef).click();}


    public Boolean registerPageLoaded() {
        return find_element(registerPageTitle).getText().equals("Đăng ký tài khoản");}

    public void registerToRegisterPage(String firstname, String lastname, String email, String pass, String confirmpass) {
        find_element(FirstName).sendKeys(firstname);
        find_element(LastName).sendKeys(lastname);
        find_element(Email).sendKeys(email);
        find_element(Password).sendKeys(pass);
        find_element(ConfirmPassword).sendKeys(confirmpass);
        find_element(registerBtn).click();
        driver.navigate().back();
    }
}
