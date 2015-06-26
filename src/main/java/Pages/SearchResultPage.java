package Pages;
import org.openqa.selenium.By;

import static support.Helpers.driver;
import static support.Helpers.find_element;
/**
 * Created by vunguyen on 25/06/2015.
 */
public class SearchResultPage {

    By searchKeywordTitle = By.xpath("/html/body/section/div/div/div/div/div[2]/div[1]/div[1]");
    By searchPageRef = By.xpath("//*[@id=\"searchFormTop\"]/div/a/span");


    public Boolean searchPageLoaded() {
        return find_element(searchKeywordTitle).getText().equals("key: banh trang");
    }


}


