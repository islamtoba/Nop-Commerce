package util;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import pages.P08_Checkout;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Random;


public abstract class Utility {
    public static String getRandomFirstName() {

        String[] firstNames = {"Alice", "Bob", "Charlie", "David", "Emily", "Frank", "Grace", "Henry", "Isabel"};
        Random random = new Random();
        int index = random.nextInt(firstNames.length);
        return firstNames[index];
    }


    public static String generateRandomGmaiL() {
        int usernameLength = (int) (Math.random() * 6) + 6; // Minimum 6 characters, maximum 11
        String username = RandomStringUtils.randomAlphanumeric(usernameLength).toLowerCase();

        // Limit special characters
        username = username.replaceAll("[._]+", "_"); // Replace consecutive dots or underscores with a single underscore

        String domain = "gmail.com";
        return String.format("%s@%s", username, domain);
    }


    public static int getRandomIntFrom1to7() {
        // create random object
        Random random = new Random();
        // generate a random intger between 0 and 6
        int randomInt = random.nextInt(7);
        // add 1 to ensure the range is from 1 to 7
        return randomInt + 1;
    }

    public static void captureScreenshot(WebDriver driver, String screenshotName) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        Date currntDate=new Date();
        screenshotName=screenshotName+" "+currntDate.toString().replace(" ","-").replace(":","-");
        try {
            FileHandler.copy(takesScreenshot.getScreenshotAs(OutputType.FILE), new File(System.getProperty("user.dir")
                    + "/src/test/resources/Screenshots/"+ screenshotName + ".png"));
        } catch (WebDriverException | IOException e) {
            e.printStackTrace();
        }
    }


}


