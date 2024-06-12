package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P09_Completed;

public class TC15_ConfirmOrder extends TestBase {


        @Test(priority = 1, description = "User can Add Product to Compare List")
        public void createSuccessfulOrder() throws InterruptedException {

            SoftAssert soft = new SoftAssert();
            soft.assertTrue(new P09_Completed(driver).orderConfirmedSuccessfully(), "Your order has been successfully processed!");
            soft.assertAll();

            System.out.println(driver.findElement
                    (By.xpath("//div[@class='details']//div[@class='order-number']")).getText());

            new P09_Completed(driver).clickContinueBtn();

        }

    }





