package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static support.Helpers.driver;
import static support.Helpers.find_element;

/**
 * Created by vunguyen on 24/06/2015.
 */
public class HomePage {
    By homePageBody1 = By.xpath("/html/body/section/div/div/div[4]/div/div/h2");
    String homePageTxt1 = "Các món đang được đặt nhiều";

    By homePageBody2 = By.xpath("/html/body/section/div/div/div[5]/div[1]/div/h2");
    String homePageTxt2 = "Các địa điểm phổ biến";

    By homePageBody3 = By.xpath("/html/body/section/div/div/div[6]/div/div[1]/h2");
    String homePageTxt3 = "Gợi ý danh sách đặt món";

    By loginPageRef = By.xpath("//*[@id=\"loginForm\"]/a[1]");
    By searchPageRef = By.xpath("//*[@id=\"searchFormTop\"]/div/a/span");

    By menuRef = By.xpath("//*[@id=\"container-s\"]/div[1]/div/div[1]/div[2]/ul/li/span");

   // ObjectMap objectMap = new ObjectMap();

    public Boolean homePageLoaded() {
        return find_element(homePageBody1).getText().equals(homePageTxt1);
    }


    public void gotoLoginPage() {find_element(loginPageRef).click();}
    public void gotoSearchPage() {find_element(searchPageRef).click();}
    public void gotoMenuHomepage() {find_element(menuRef).click();}
    public void hoverToMenuI() {
        Actions action = new Actions(driver);
        action.moveToElement(find_element(menuRef)).build().perform();

    }


}
