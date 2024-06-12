package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P07_ShoppingCart {

        public pages.P06_Category clickLoginTap;
        WebDriver driver;

        // TODO: Step1: Constructor
        public P07_ShoppingCart(WebDriver driver) {
            this.driver = driver;

        }

        private final By AcceptingTermsCheckbox = By.xpath("//input[@id='termsofservice']");

        public P07_ShoppingCart selectAcceptingTermsCheckbox() throws InterruptedException {
            driver.findElement(AcceptingTermsCheckbox).click();
            Thread.sleep(2000);
            return this;
        }

        private final By CheckoutButton = By.xpath("//button[@id=\"checkout\"]");

        public P07_ShoppingCart clickOnCheckoutButton() throws InterruptedException {
            driver.findElement(CheckoutButton).click();
            Thread.sleep(3500);
            return this;
        }
    }

