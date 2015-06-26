package testcase;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.ForgotPasswordPage;
import support.SetupTest;

/**
 * Created by vunguyen on 24/06/2015.
 */

public class TestForgotPage extends SetupTest {
    @DataProvider
    Object[][] getCredentials() {
        return new Object[][]{
                {"humin.vu1@gmail.com"}};
    }

    @Test(dataProvider =  "getCredentials")
    public void testForgotPage(String Email){

        HomePage homepage = new HomePage();
        Assert.assertEquals(homepage.homePageLoaded(), Boolean.TRUE);
        homepage.gotoLoginPage();

        LoginPage loginpage = new LoginPage();
        Assert.assertEquals(loginpage.loginPageLoaded(), Boolean.TRUE);
        loginpage.gotoForgotPage();

        ForgotPasswordPage forgotpasswordpage = new ForgotPasswordPage();
        Assert.assertEquals(forgotpasswordpage.forgotPageLoaded(), Boolean.TRUE);
        forgotpasswordpage.loginToForgotPage(Email);

    }
}
