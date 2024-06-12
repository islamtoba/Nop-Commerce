package testcases;

import org.testng.annotations.Test;
import pages.*;

public class TC12_CheckoutIteams extends TestBase {
    @Test(priority = 1, description = "Filling Adress and Information and confirm")
    public void checkoutIteams() throws InterruptedException {
        new P05_Products(driver).clickOnAddToCartBtn();

        new P05_Products(driver).clickOnShoppingCart();

        new P05_Products(driver).scrollDown();

        new P07_ShoppingCart(driver).selectAcceptingTermsCheckbox().clickOnCheckoutButton();
        Thread.sleep(1500);
    }
}
