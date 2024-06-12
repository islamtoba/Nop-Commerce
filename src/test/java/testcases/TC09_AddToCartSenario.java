package testcases;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P01_HomePage;
import pages.P03_LoginPage;
import pages.P05_Products;


import static testcases.TC01_Registration.email;
import static testcases.TC01_Registration.password;

public class TC09_AddToCartSenario extends TestBase {



    @Test(priority = 1, description = "User can Add Product to Cart")
    public void userAddToCart() throws InterruptedException {

        new P05_Products(driver).clickOnFirstDesktops();

        new P05_Products(driver).clickOnRamList();

        new P05_Products(driver).selectAttributeRamList();

        new P05_Products(driver).clickOn400GB();

        new P05_Products(driver).clickOnAddToCartBtn();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(new P05_Products(driver).ifsucessmsgdisplayed());
        softAssert.assertAll();
    }
}