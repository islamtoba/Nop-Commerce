package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;

import static util.Utility.getRandomIntFrom1to7;

public class PageBase {

    // constructor
    // locators
    // action methos
    public PageBase(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "")
    WebElement searchBox;

    public void searchFunction(String keyword){
        searchBox.sendKeys(keyword, Keys.ENTER);
    }

     public static void hoverRandomElement(WebDriver driver,WebElement randomElement) throws InterruptedException {

         Actions actions = new Actions(driver);
         actions.moveToElement(randomElement).perform();
         Thread.sleep(1000);
     }

     public static void ScrollDown(WebDriver driver){
      JavascriptExecutor js=(JavascriptExecutor)driver;
      js.executeScript("window.scrollBy(0,350)","");
     }

     public static void ScrollEndDown(WebDriver driver){
      JavascriptExecutor js=(JavascriptExecutor)driver;
      js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
     }
    // TODO: Capture Screenshot
    public static void captureScreenshot(WebDriver driver, String screenshotName) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        try {
            FileHandler.copy(takesScreenshot.getScreenshotAs(OutputType.FILE), new File(System.getProperty("user.dir")
                    + "/src/test/resources/Screenshots/" + screenshotName + System.currentTimeMillis() + ".png"));
        } catch (WebDriverException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}


