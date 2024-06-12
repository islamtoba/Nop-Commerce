package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;

public class P08_Checkout {
    public P08_Checkout clickLoginTap;
    public WebElement clickOnEdit_BillingAdress;
    WebDriver driver;

    // TODO: Step1: Constructor
    public P08_Checkout(WebDriver driver) {
        this.driver = driver;
    }
    private final By Edit_BillingAdress = By.xpath("//button[@id='edit-billing-address-button']");

    public P08_Checkout clickOnEdit_BillingAdress() throws InterruptedException {
        Thread.sleep(1500);
        driver.findElement(Edit_BillingAdress).click();
        return this;
    }

    private final By Selecting_CountryUSA = By.xpath("//select[@id='BillingNewAddress_CountryId']/option[text()='Germany']");

    public P08_Checkout selectCountyUSAFromDDL() throws InterruptedException {
        Thread.sleep(1500);
        driver.findElement(Selecting_CountryUSA).click();
        Thread.sleep(1500);

        return this;
    }

    private final By StateIl = By.xpath("//select[@id='BillingNewAddress_StateProvinceId']//option[@value='58']");

    public P08_Checkout clickOnStateIl() throws InterruptedException {
        driver.findElement(StateIl).click();
        Thread.sleep(1500);
        return this;
    }

    private final By CityName = By.xpath("//input[@id='BillingNewAddress_City']");

    public P08_Checkout enterCityName(String city) throws InterruptedException {
        driver.findElement(this.CityName).sendKeys(city);
        Thread.sleep(1500);
        return this;
    }

    private final By AdressForBill = By.xpath("//input[@id='BillingNewAddress_Address1']");

    public P08_Checkout enterAdressForBill(String address1) throws InterruptedException {
        driver.findElement(this.AdressForBill).sendKeys(address1);
        Thread.sleep(1500);
        return this;
    }

    private final By ZipCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");

    public P08_Checkout enterZipCode(String zipCode) throws InterruptedException {
        driver.findElement(this.ZipCode).sendKeys(zipCode);
        Thread.sleep(1500);
        return this;
    }

    private final By PhoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");

    public P08_Checkout enterPhoneNumber(String phoneNumber) throws InterruptedException {
        driver.findElement(this.PhoneNumber).sendKeys(phoneNumber);
        Thread.sleep(1500);
        return this;
    }

    private final By ContinueBtnbBillingAdress = By.xpath("//button[@onclick='if (!window.__cfRLUnblockHandlers) return false; Billing.save()']");

    public P08_Checkout clickContinueBtnAdress() throws InterruptedException {
        driver.findElement(ContinueBtnbBillingAdress).click();
        Thread.sleep(4500);
        return this;
    }

    private final By ContinueBtnShippingMethod = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");

    public P08_Checkout clickContinueBtnShippingMethod() throws InterruptedException {
        driver.findElement(ContinueBtnShippingMethod).click();
        Thread.sleep(4500);
        return this;
    }
    private final By ContinueBtnPaymentMethod = By.xpath("//button[@class='button-1 payment-method-next-step-button']");

    public P08_Checkout clickContinueBtnPaymentMethod() throws InterruptedException {
        driver.findElement(ContinueBtnPaymentMethod).click();
        Thread.sleep(1500);
        return this;
    }

    private final By ContinueBtnPaymentInfo = By.xpath("//button[@class='button-1 payment-info-next-step-button']");

    public P08_Checkout clickContinueBtnPaymentInfo() throws InterruptedException {
        driver.findElement(ContinueBtnPaymentInfo).click();
        Thread.sleep(1500);
        return this;
    }
    private final By ConfirmBtnConfirmOrder = By.xpath("//button[@class='button-1 confirm-order-next-step-button']");

    public P08_Checkout clickConfirmBtnConfirmOrder() throws InterruptedException {
        driver.findElement(ConfirmBtnConfirmOrder).click();
        Thread.sleep(1500);
        return this;
    }
}

