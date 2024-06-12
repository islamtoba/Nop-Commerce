package testcases;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P01_HomePage;
import pages.P03_LoginPage;
import pages.P05_Products;

import java.util.concurrent.TimeUnit;

import static testcases.TC01_Registration.email;
import static testcases.TC01_Registration.password;

public class TC05_ChangeCurrency extends TestBase {


    @Test(priority = 1, description = "Change Currency")
    public void changeCurrency()  {

        WebElement dropdownElement = driver.findElement(By.xpath("//select[@id='customerCurrency']"));

        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText("Euro");
        SoftAssert soft = new SoftAssert();

        soft.assertTrue(new P01_HomePage(driver).currencyChanged(), "Euro");
        soft.assertAll();
    }
}
