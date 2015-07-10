package Pages;

import org.openqa.selenium.By;

import static support.Helpers.driver;
import static support.Helpers.find_element;


/**
 * Created by vunguyen on 09/07/2015.
 */
public class ProductDetailPage {
    By ProductDetailtext1 = By.xpath("/html/body/section/div/div/div[1]/div[3]/div/div/div[2]/h1");
    By clickproduct1 = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[1]/div/div[1]/div[3]/div[1]/div[2]/a/span");
    By clickproduct2 = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[1]/div/div[1]/div[3]/div[2]/div[2]/a");


    public Boolean productPageLoaded() {
        return find_element(ProductDetailtext1).isDisplayed();

    }


    public void gotoSelectProduct() {
        find_element(clickproduct1).click();
        find_element(clickproduct2).click();}

}

