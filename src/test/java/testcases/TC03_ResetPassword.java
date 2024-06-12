package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P01_HomePage;
import pages.P04_PasswordRecovery;

import java.util.concurrent.TimeUnit;

import static testcases.TC01_Registration.email;

public class TC03_ResetPassword extends TestBase {


    @Test(priority = 1,description = "Reset Password")
    public void resetPassword() throws InterruptedException {
        new P01_HomePage(driver).clickLoginTap().clickForgetPassword();
        new P04_PasswordRecovery(driver).enterEmail4Reset(email).clickForgetPasswordBtn();

        SoftAssert soft = new SoftAssert();
        soft.assertTrue(new P04_PasswordRecovery(driver).verifyMessageAppearSuccessfully(),"Email with instructions has been sent to you.");
        soft.assertAll();

//        new P04_PasswordRecovery(driver).checkRecoverPasswordMsgSuccessfully();
//        System.out.println(driver.findElement(By.xpath("//p[@class='content']")).getText());
//        String msgColor = driver.findElement(By.cssSelector("[class=result]")).getCssValue("color");
//        System.out.println("Color is :" + msgColor);
}
}
