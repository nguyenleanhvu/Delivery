package Pages;
import org.openqa.selenium.By;

import static support.Helpers.driver;
import static support.Helpers.find_element;
/**
 * Created by vunguyen on 25/06/2015.
 */
public class SearchResultPage {
    By searchKeywordSort = By.xpath("//*[@id=\"directorypage\"]/div/div/div/div/div[2]/div[1]/ul");
    By searchPageRef = By.xpath("//*[@id=\"searchFormTop\"]/div/a/span");
    By productPageRef = By.xpath("//*[@id=\"directorypage\"]/div/div/div/div/div[2]/div[4]/div[1]/div[2]/div[1]/div[2]/h2/a");
    By searchtextbox = By.xpath("//*[@id=\"pkeywords\"]");

    public Boolean searchPageLoaded() {
        return find_element(searchKeywordSort).isDisplayed();}

    //public void gotoSearchPage() {find_element(searchPageRef).click();}

    public void gotoProductDetailPage() {find_element(productPageRef).click();}

    public void searchToSearchPage(String keyword) {
        find_element(searchtextbox).sendKeys(keyword);
        find_element(searchPageRef).click();
    }
}



