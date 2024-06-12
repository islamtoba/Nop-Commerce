package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P01_HomePage;
import pages.P03_LoginPage;
import pages.P05_Products;
import pages.P07_ShoppingCart;

public class TC11_AddToCompareListSenario extends TestBase {



    @Test(priority = 1, description = "User can Add Product to Compare List")
    public void userAddToCompareList() throws InterruptedException {
//        new P01_HomePage(driver).clickLoginTap();
//        new P03_LoginPage(driver).inputEmail("segjmsveff@gmail.com").inputPassword("P@ssw0rd123").clickLoginButton();
//        Thread.sleep(1000);
        new P05_Products(driver).clickElectronicsCategory();

        new P05_Products(driver).getElectronicsCellPhonesSubCategory();

        new P05_Products(driver).scrollDown().clickOnHTCOne4G();

        new P05_Products(driver).clickOnAddToCompareListBtn();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(new P05_Products(driver).ifsucessmsgdisplayed());
        softAssert.assertAll();
    }
}
