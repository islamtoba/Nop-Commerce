package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

import static pages.PageBase.hoverRandomElement;
import static util.Utility.*;

public class P06_Category {

    public P06_Category clickLoginTap;
    WebDriver driver;

    // TODO: Step1: Constructor
    public P06_Category(WebDriver driver) {
        this.driver = driver;

    }

    private final By allcategories = By.xpath("/html[1]/body[1]/div[6]/div[2]/ul[1]/li/a");


    public P06_Category hoverRandomCategory() throws InterruptedException {


        List<WebElement> allcategories = driver.findElements(this.allcategories);

        Random random = new Random();
        int randomcategory = random.nextInt(allcategories.size());
        WebElement randomLink = allcategories.get(randomcategory);
        allcategories.get(randomcategory).click();
        Thread.sleep(1500);
        return this;


    }

}
