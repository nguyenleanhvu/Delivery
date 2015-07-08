package testcase;

import Pages.DanhChoDTPage;
import Pages.HomePage;
import Pages.MenuHomePage;
import Pages.DanhChoDTPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import support.SetupTest;


/**
 * Created by vunguyen on 08/07/2015.
 */
public class TestDanhChoDoiTacPage extends SetupTest {
    @DataProvider
    Object[][] getCredentials() {
        return new Object[][]{
                {"vu.anh.nguyen@infonam.com", "123456"},};
    }

    @Test(dataProvider =  "getCredentials")
    public void testDanhChoDoiTacPage(String user, String pass){
        HomePage homepage = new HomePage();
        Assert.assertEquals(homepage.homePageLoaded(), Boolean.TRUE);
        homepage.gotoDanhChoDoiTac();


        DanhChoDTPage danhchodt = new DanhChoDTPage();
        Assert.assertEquals(danhchodt.danhchodtLoaded(), Boolean.TRUE);


    }}

