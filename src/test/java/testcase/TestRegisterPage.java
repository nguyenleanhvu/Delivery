package testcase;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegisterPage;

import support.SetupTest;

/**
 * Created by vunguyen on 25/06/2015.
 */
public class TestRegisterPage extends SetupTest {
    @DataProvider
    Object[][] getCredentials() {
        return new Object[][]{
                {"Vinh", "Nguyen", "humin.vu39@gmail.com", "123456", "123456"},};
    }


    @Test(dataProvider =  "getCredentials")
    public void testRigisterPage(String firstname, String lastname, String email, String pass, String confirmpass){

        HomePage homepage = new HomePage();
        Assert.assertEquals(homepage.homePageLoaded(), Boolean.TRUE);
        homepage.gotoLoginPage();

        LoginPage loginpage = new LoginPage();
        Assert.assertEquals(loginpage.loginPageLoaded(), Boolean.TRUE);
        loginpage.gotoRegisterPage();

        RegisterPage registerpage = new RegisterPage();
        Assert.assertEquals(registerpage.registerPageLoaded(), Boolean.TRUE);
        registerpage.registerToRegisterPage(firstname, lastname, email, pass, confirmpass);

    }
}

