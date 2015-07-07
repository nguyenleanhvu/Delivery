package Pages;

import org.openqa.selenium.By;

import static support.Helpers.driver;
import static support.Helpers.find_element;

/**
 * Created by vunguyen on 07/07/2015.
 */
public class MenuHomePage {

    By huongdandatmonButton = By.xpath("//*[@id=\"container-s\"]/div[1]/div/div[1]/div[2]/ul/li/ul/li[1]/a");

    public Boolean menuHomePageLoaded() {
        return find_element(huongdandatmonButton).getText().equals("Hướng dẫn đặt món");
    }


    public void gotoHuongDanDatMonPage() {find_element(huongdandatmonButton).click();}


}


