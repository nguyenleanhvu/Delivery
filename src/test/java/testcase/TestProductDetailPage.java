package testcase;

import Pages.HomePage;
import Pages.ProductDetailPage;
import Pages.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import support.SetupTest;

/**
 * Created by vunguyen on 09/07/2015.
 */
public class TestProductDetailPage extends SetupTest {
    @DataProvider
    Object[][] getCredentials() {
        return new Object[][]{
                {"cafe"},
        };
    }

    @Test(dataProvider =  "getCredentials")
    public void testProductDetailPage(String keyword){
        HomePage homepage = new HomePage();
        Assert.assertEquals(homepage.homePageLoaded(), Boolean.TRUE);
        homepage.gotoProductDetailPage();

        ProductDetailPage productdetailpage = new ProductDetailPage();
        Assert.assertEquals(productdetailpage.productPageLoaded(), Boolean.TRUE);

    }


}
