package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P04_PasswordRecovery {

    public P04_PasswordRecovery clickLoginTap;
    WebDriver driver;

    // TODO: Step1: Constructor
    public P04_PasswordRecovery(WebDriver driver) {
        this.driver = driver;

    }

    private final By resetByEmailTextbox = By.xpath("//input[@id='Email']");

    private final By clickForgetPasswordBtn = By.xpath("//button[@name='send-email']");
    private final By recoverPasswordSuccessfullyMessage = By.xpath("//p[@class='content']");


    public P04_PasswordRecovery clickForgetPasswordBtn() throws InterruptedException {
        driver.findElement(clickForgetPasswordBtn).click();
        Thread.sleep(5000);
        return this;
    }

    public P04_PasswordRecovery enterEmail4Reset(String email) {
        driver.findElement(resetByEmailTextbox).sendKeys(email);
        return this;
    }

//    public P04_PasswordRecovery checkRecoverPasswordMsgSuccessfully() {
//        driver.findElement(recoverPasswordSuccessfully).getText().contains("");
//        return this;
//    }

    public boolean verifyMessageAppearSuccessfully(){return driver.findElement(recoverPasswordSuccessfullyMessage).getText().contains("Email with instructions has been sent to you.");}
}
