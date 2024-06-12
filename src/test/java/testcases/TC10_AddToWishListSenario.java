package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P05_Products;

public class TC10_AddToWishListSenario extends TestBase {





        @Test(priority = 1, description = "User can Add Product to WishList")
        public void userAddToWishList() throws InterruptedException {

            new P05_Products(driver).clickElectronicsCategory().getElectronicsCameraSubCategory();

            new P05_Products(driver).clickOnLeicaTMirrorless();

            new P05_Products(driver).clickOnAddToWishListBtn2();

            SoftAssert softAssert = new SoftAssert();
            softAssert.assertTrue(new P05_Products(driver).ifsucessmsgdisplayed());
            softAssert.assertAll();

        }

}
