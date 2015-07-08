package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static support.Helpers.driver;
import static support.Helpers.find_element;
/**
 * Created by vunguyen on 08/07/2015.
 */
public class DanhChoDTPage {

    By danhchodtText = By.xpath("/html/body/section/div/section/div/div/div/h1");


    public Boolean danhchodtLoaded() {
        return find_element(danhchodtText).getText().equals("Dành cho Đối tác");
    }


}

