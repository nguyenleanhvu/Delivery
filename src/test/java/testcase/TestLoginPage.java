package testcase;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.LoginPage;
import support.SetupTest;

/**
 * Created by vunguyen on 24/06/2015.
 */
public class TestLoginPage extends SetupTest {
    @DataProvider
    Object[][] getCredentials() {
        return new Object[][]{
                {"vu.anh.nguyen@infonam.com", "123456"},
                {"a12345@infonam.com", "123456"},
                {"vu.anh.nguyen@infonam.com", "654321"}

        };
    }

    @Test(dataProvider =  "getCredentials")
    public void testLoginPage(String user, String pass){
        HomePage homepage = new HomePage();
        Assert.assertEquals(homepage.homePageLoaded(), Boolean.TRUE);
        homepage.gotoLoginPage();

        LoginPage loginpage = new LoginPage();
        Assert.assertEquals(loginpage.loginPageLoaded(), Boolean.TRUE);
        loginpage.loginToLoginPage(user, pass);
    }
}

