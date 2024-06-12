package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P01_HomePage {

    WebDriver driver;
    public Actions actions;

    public P01_HomePage(WebDriver driver) {
        this.driver = driver;
        Actions actions = new Actions(driver);
    }

    private final By LoginTap = By.xpath("//a[@href='/login?returnUrl=%2F']");
    // findby == driver.findelmeent(by.xpath(""))
    public P01_HomePage clickLoginTap() throws InterruptedException {
        driver.findElement(LoginTap).click();
        Thread.sleep(1500);
        return this;
    }

    private final By logOutTap = By.xpath("//a[@href='/logout']");
    public P01_HomePage clickRegisterTap() throws InterruptedException {
        driver.findElement(registerTap).click();
        Thread.sleep(1500);
        return this;
    }

    private final By registerTap = By.xpath("//a[@href='/register?returnUrl=%2F']");
    public P01_HomePage clickLogOutTap() throws InterruptedException {
        driver.findElement(logOutTap).click();
        Thread.sleep(1500);
        return this;
    }

    private final By forgetPassword = By.xpath("//a[@href='/passwordrecovery']");
    public P01_HomePage clickForgetPassword() throws InterruptedException {
        driver.findElement(forgetPassword).click();
        Thread.sleep(1500);
        return this;
    }

    private final By currencyChangedSuccessfully = By.xpath("//select[@id='customerCurrency']");

    public boolean currencyChanged(){
        return driver.findElement(currencyChangedSuccessfully).getText().contains("Euro");

    }

}
