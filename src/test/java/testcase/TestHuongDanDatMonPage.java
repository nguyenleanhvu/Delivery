package testcase;

import Pages.HomePage;
import Pages.MenuHomePage;
import Pages.HuongDanDatMonPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import support.SetupTest;

/**
 * Created by vunguyen on 07/07/2015.
 */
public class TestHuongDanDatMonPage extends SetupTest {
    @DataProvider
    Object[][] getCredentials() {
        return new Object[][]{
                {"vu.anh.nguyen@infonam.com", "123456"},};
    }

    @Test(dataProvider =  "getCredentials")
    public void testHuongDanDatMonPage(String user, String pass){
        HomePage homepage = new HomePage();
        Assert.assertEquals(homepage.homePageLoaded(), Boolean.TRUE);
        homepage.gotoMenuHomepage();

        MenuHomePage menuhomepage = new MenuHomePage();
        Assert.assertEquals(menuhomepage.menuHomePageLoaded(), Boolean.TRUE);
        menuhomepage.gotoHuongDanDatMonPage();

        HuongDanDatMonPage huongdandatmonpage = new HuongDanDatMonPage();
        Assert.assertEquals(huongdandatmonpage.huongdandatmonLoaded(), Boolean.TRUE);


    }}
