package testcases;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P01_HomePage;
import pages.P03_LoginPage;
import pages.P04_PasswordRecovery;
import pages.P05_Products;

import java.util.concurrent.TimeUnit;

import static testcases.TC01_Registration.email;
import static testcases.TC01_Registration.password;

public class TC04_SearchFunction extends TestBase {

    @Test(priority = 1,description = "Search for a product")
    public void searchForAnyProduct() throws InterruptedException {

        new P05_Products(driver).searchForProduct("Nokia Lumia 1020").searchForProductBtn();
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(new P05_Products(driver).rightIteamBeenChoosenCorrect(),"Nokia Lumia 1020");
        soft.assertAll();

    }
}
