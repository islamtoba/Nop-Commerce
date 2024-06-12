package testcases;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.P01_HomePage;
import pages.P02_RegistrationPage;
import pages.P03_LoginPage;
import pages.P04_PasswordRecovery;


import java.util.concurrent.TimeUnit;

import static util.Utility.*;


public class TC01_Registration extends TestBase {

    Faker faker = new Faker();
    static String email = generateRandomGmaiL();
    String companyName = "Microsoft";
    static String password = "P@ssw0rd123";
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();


    @Test(priority = 1, description = "Register New User With Valid Data")
    public void registerNewUserWithValidData_P() throws InterruptedException {

        new P01_HomePage(driver).clickRegisterTap();
        new P02_RegistrationPage(driver).
                selectGenderMale().
                enterFristName(firstName).
                enterLastName(lastName).
                enterCompanyName(companyName).
                enterEmail(email).
                enterPasswordAndConfirmIt(password).
                clickRegisterButton();

        System.out.println(email);
        System.out.println(password);

        SoftAssert soft = new SoftAssert();
        soft.assertTrue(new P02_RegistrationPage(driver).regMessageAppearSuccessfully(), "Your registration completed");
        soft.assertAll();

    }

}
