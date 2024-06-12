package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P03_LoginPage {

    public P03_LoginPage clickLoginTap;
    WebDriver driver;

    // TODO: Step1: Constructor
    public P03_LoginPage(WebDriver driver){
        this.driver = driver;
    }

    // TODO step2: define locators
   private final By Email_Text = By.xpath( "//input[@id='Email']");

    private final By Password = By.xpath ( "//input[@id='Password']");

    private final By LoginButton = By.xpath ("//button[@class='button-1 login-button']");

    // TODO: step3 define action methods
    public P03_LoginPage inputEmail(String email) throws InterruptedException {
        driver.findElement(this.Email_Text).sendKeys(email);
        Thread.sleep(1500);
        return this;
    }
    public P03_LoginPage inputPassword(String password) throws InterruptedException {
        driver.findElement(this.Password).sendKeys(password);
        Thread.sleep(1500);
        return this;
    }

    public P03_LoginPage clickLoginButton() throws InterruptedException {
        driver.findElement(this.LoginButton).click();
        Thread.sleep(1500);
        return this;
    }

}
