package testcase;

import Pages.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.LoginPage;
import support.SetupTest;
/**
 * Created by vunguyen on 25/06/2015.
 */
public class TestSearch extends SetupTest {
    @DataProvider
    Object[][] getCredentials() {
        return new Object[][]{
                {"banh trang"},
        };
    }

    @Test(dataProvider =  "getCredentials")
    public void testLoginPage(String keyword){
        HomePage homepage = new HomePage();
        Assert.assertEquals(homepage.homePageLoaded(), Boolean.TRUE);
        homepage.gotoSearchPage();

        SearchResultPage searchresultpage = new SearchResultPage();
        Assert.assertEquals(searchresultpage.searchPageLoaded(), Boolean.TRUE);


    }
}
