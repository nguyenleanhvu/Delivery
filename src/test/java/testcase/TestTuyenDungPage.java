package testcase;

import Pages.DanhChoDTPage;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import support.SetupTest;
import Pages.TuyenDungPage;

/**
 * Created by vunguyen on 08/07/2015.
 */
public class TestTuyenDungPage extends SetupTest {
    @DataProvider
    Object[][] getCredentials() {
        return new Object[][]{
                {"vu.anh.nguyen@infonam.com", "123456"},};
    }

    @Test(dataProvider =  "getCredentials")
    public void testTuyenDungPage(String user, String pass){
        HomePage homepage = new HomePage();
        Assert.assertEquals(homepage.homePageLoaded(), Boolean.TRUE);
        homepage.gotoTuyenDungPage();


        TuyenDungPage tuyendungpage = new TuyenDungPage();
        Assert.assertEquals(tuyendungpage.tuyendung(), Boolean.TRUE);


    }}