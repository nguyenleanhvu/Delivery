package Pages;

import org.openqa.selenium.By;

import static support.Helpers.driver;
import static support.Helpers.find_element;

/**
 * Created by vunguyen on 02/07/2015.
 */
public class ListViewLoginPage {

    By SignUpButton = By.xpath("//*[@id=\"account_menu\"]/div[4]/a");
    By ListViewText1 = By.xpath("//*[@id=\"account_menu\"]/div[2]/a");

    public Boolean listViewLoginLoaded() {
        return find_element(SignUpButton).isDisplayed();
    }

    public void ReturnToHomePage() {find_element(SignUpButton).click();}

}

