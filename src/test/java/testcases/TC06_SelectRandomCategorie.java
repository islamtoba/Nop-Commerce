package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P01_HomePage;
import pages.P03_LoginPage;
import pages.P05_Products;
import pages.P06_Category;

import static testcases.TC01_Registration.email;
import static testcases.TC01_Registration.password;

public class TC06_SelectRandomCategorie extends TestBase {


    @Test(priority = 1, description = "Choose randomly Category")
    public void chooseRandomCategory() throws InterruptedException {

        new P06_Category(driver).hoverRandomCategory();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(new P05_Products(driver).checkifcategoriesdisplayes());
        softAssert.assertAll();
    }
}






