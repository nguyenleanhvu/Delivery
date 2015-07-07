package testcase;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.LoginSucceedPage;
import support.SetupTest;
import Pages.ListViewLoginPage;

/**
 * Created by vunguyen on 02/07/2015.
 */
public class TestSignOutPage extends SetupTest {
    @DataProvider
    Object[][] getCredentials() {
        return new Object[][]{
                {"vu.anh.nguyen@infonam.com", "123456"},

        };
    }

    @Test(dataProvider =  "getCredentials")
    public void testSignOutPage(String user, String pass){
        HomePage homepage = new HomePage();
        Assert.assertEquals(homepage.homePageLoaded(), Boolean.TRUE);
        homepage.gotoLoginPage();

        LoginSucceedPage loginpage1 = new LoginSucceedPage();
        Assert.assertEquals(loginpage1.loginPageLoaded1(), Boolean.TRUE);
        loginpage1.loginToLoginPage1(user, pass);
        loginpage1.gotoListViewLogin();


        ListViewLoginPage listview1 = new ListViewLoginPage();
        Assert.assertEquals(listview1.listViewLoginLoaded(), Boolean.TRUE);
        listview1.ReturnToHomePage();


        HomePage homepage1 = new HomePage();
        Assert.assertEquals(homepage1.homePageLoaded(), Boolean.TRUE);

//


    }
}

