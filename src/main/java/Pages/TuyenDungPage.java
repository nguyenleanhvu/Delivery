package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.Set;

import static support.Helpers.driver;
import static support.Helpers.find_element;


/**
 * Created by vunguyen on 08/07/2015.
 */
public class TuyenDungPage {

    By tuyendungText = By.xpath("/html/body/section/div/div/div/div[2]/h1");


    //public Boolean tuyendungLoaded() {
     //   return find_element(tuyendungText).getText().equals("Cơ hội nghề nghiệp");
   // }
    public Boolean tuyendung() {
        Boolean result = false;
        String parentWindow = driver.getWindowHandle();

        Set<String> allwindows = driver.getWindowHandles();
        for (String handler: allwindows){
            driver.switchTo().window(handler);
            if (!handler.equals(parentWindow)){
                String URL = driver.getCurrentUrl();
                if(URL.equals("http://www.foody.vn/viec-lam")){
                    result = true;
                }

            }
        }
        driver.switchTo().window(parentWindow);
        return  result;
    }


}
