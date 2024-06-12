package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P09_Completed {
    public P09_Completed clickLoginTap;
    WebDriver driver;

    // TODO: Step1: Constructor
    public P09_Completed(WebDriver driver) {
        this.driver = driver;

    }
    private final By ContinueBtn= By.xpath("//button[@class='button-1 order-completed-continue-button']");

    public P09_Completed clickContinueBtn() {
        driver.findElement(ContinueBtn).click();
        return this;
    }

    private final By OrderConfirmed = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");

    public boolean orderConfirmedSuccessfully(){return
            driver.findElement(OrderConfirmed).getText().contains("Your order has been successfully processed!");}

}
