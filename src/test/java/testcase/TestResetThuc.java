package testcase;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProductDetailPage;
import Pages.SelectProductPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import support.SetupTest;

/**
 * Created by vunguyen on 10/07/2015.
 */
public class TestResetThuc extends SetupTest {
    @DataProvider
    Object[][] getCredentials() {
        return new Object[][]{
                {"vu.anh.nguyen@infonam.com", "123456"},
        };
    }

    @Test(dataProvider =  "getCredentials")
    public void t(String user, String pass){
        HomePage homepage = new HomePage();
        Assert.assertEquals(homepage.homePageLoaded(), Boolean.TRUE);
        homepage.gotoLoginPage();

        LoginPage loginpage = new LoginPage();
        Assert.assertEquals(loginpage.loginPageLoaded(), Boolean.TRUE);
        loginpage.loginToLoginPage(user, pass);

        homepage.gotoProductDetailPage();

        ProductDetailPage productdetailpage = new ProductDetailPage();
        Assert.assertEquals(productdetailpage.productPageLoaded(), Boolean.TRUE);
        productdetailpage.gotoSelectProduct();

        SelectProductPage selectproductpage = new SelectProductPage();
        Assert.assertEquals(selectproductpage.selectproductPageLoaded(), Boolean.TRUE);

        selectproductpage.clearallitems();


    }
}



