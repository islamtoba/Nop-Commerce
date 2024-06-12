package testcases;

import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P03_LoginPage;
import static testcases.TC01_Registration.email;
import static testcases.TC01_Registration.password;

public class TC02_Login extends TestBase {

    @Test(priority = 1,description = "Login to System with Valid Data", enabled = true)
    public void loginWithValidData_P() throws InterruptedException {
        new P01_HomePage(driver).clickLoginTap();

        new P03_LoginPage(driver)
                .inputEmail(email)
                .inputPassword(password)
                .clickLoginButton();
    }
}
