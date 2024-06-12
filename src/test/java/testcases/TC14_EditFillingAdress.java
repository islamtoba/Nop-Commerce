package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;

public class TC14_EditFillingAdress extends TestBase {


    @Test(priority = 1, description = "Filling Adress and Information and confirm")
    public void Edit_BillingAdress() throws InterruptedException {
        new P08_Checkout(driver).clickOnEdit_BillingAdress();
        new P08_Checkout(driver).clickContinueBtnAdress().
                clickContinueBtnShippingMethod().
                clickContinueBtnPaymentMethod().
                clickContinueBtnPaymentInfo().
                clickConfirmBtnConfirmOrder();

        SoftAssert soft = new SoftAssert();
        soft.assertTrue(new P09_Completed(driver).orderConfirmedSuccessfully(), "Your order has been successfully processed!");
        soft.assertAll();

        System.out.println(driver.findElement
                (By.xpath("//div[@class='details']//div[@class='order-number']")).getText());

    }
}
