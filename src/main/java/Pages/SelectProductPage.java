package Pages;

import org.openqa.selenium.By;

import static support.Helpers.find_element;

/**
 * Created by vunguyen on 09/07/2015.
 */
public class SelectProductPage {
    By selectProduct1 = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[1]/div/div[1]/div[3]/div[1]/div[2]/a/span");
    By selectProduct2 = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[1]/div/div[1]/div[3]/div[2]/div[2]/a/span");

    By clearitems = By.xpath("//*[@id=\"quick-booking-div\"]/div[1]/div[2]/a");
    By resetitem1 = By.xpath("//*[@id=\"cart-qty\"]");
    By resetitem2 = By.xpath("//*[@id=\"cart-qty\"]/a");

    public Boolean selectproductPageLoaded() {
        Boolean Select = false;
        if (find_element(selectProduct1).isDisplayed() && find_element(selectProduct2).isDisplayed()) {
            Select = true;
        }

    return  Select;}




    public void clearallitems() {find_element(clearitems).click();}


}



