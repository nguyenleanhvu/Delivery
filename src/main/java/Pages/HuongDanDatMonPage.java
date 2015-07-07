package Pages;

import org.openqa.selenium.By;

import static support.Helpers.find_element;

/**
 * Created by vunguyen on 07/07/2015.
 */
public class HuongDanDatMonPage {

    By huongdandatmonText = By.xpath("/html/body/section/div/section/div/div/div/h1");


    public Boolean huongdandatmonLoaded() {
        return find_element(huongdandatmonText).getText().equals("Hướng dẫn đặt món trên DeliveryNow");
    }


}


