package testcases;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P01_HomePage;
import pages.P03_LoginPage;
import pages.P05_Products;


import java.util.concurrent.TimeUnit;

import static testcases.TC01_Registration.email;
import static testcases.TC01_Registration.password;

public class TC07_UserSelectDiffCatg extends TestBase {


    @Test(priority = 1, description = "User Select specific Category")
    public void userSelectDiffCatg() throws InterruptedException {

        new P05_Products(driver).clickOnApparelCategory();
        new P05_Products(driver).clickOnapparelShoesSubCategory();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(new P05_Products(driver).checkifcategoriesdisplayes());
        softAssert.assertAll();

    }

}
