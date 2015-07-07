package testcase;

import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Pages.MenuHomePage;
import support.SetupTest;

/**
 * Created by vunguyen on 07/07/2015.
 */
public class TestMenuHomePage extends SetupTest {
    @DataProvider
    Object[][] getCredentials() {
        return new Object[][]{
                {"vu.anh.nguyen@infonam.com", "123456"},

        };
    }

    @Test(dataProvider =  "getCredentials")
    public void testMenuHomePage(String user, String pass){
        HomePage homepage = new HomePage();
        Assert.assertEquals(homepage.homePageLoaded(), Boolean.TRUE);
        homepage.gotoMenuHomepage();

        MenuHomePage menuhomepage = new MenuHomePage();
        Assert.assertEquals(menuhomepage.menuHomePageLoaded(), Boolean.TRUE);

    }}



