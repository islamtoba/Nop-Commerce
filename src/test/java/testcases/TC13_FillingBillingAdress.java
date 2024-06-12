package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;

public class TC13_FillingBillingAdress extends TestBase {

    String city = "Cicero";
    String address1 = "2736 S 59";
    String zipCode = "60804";
    String phoneNumber = "44643423";
    String orderNumber = "0000";

    @Test(priority = 1, description = "Filling Adress and Information and confirm")
    public void fillAdressAndInformation() throws InterruptedException {


        new P08_Checkout(driver).enterCityName(city).
                selectCountyUSAFromDDL().
                enterAdressForBill(address1).
                enterZipCode(zipCode).
                enterPhoneNumber(phoneNumber).
                clickContinueBtnAdress().
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

