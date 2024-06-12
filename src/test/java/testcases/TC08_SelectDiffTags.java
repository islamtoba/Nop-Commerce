package testcases;


import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P03_LoginPage;
import pages.P05_Products;

import static testcases.TC01_Registration.email;
import static testcases.TC01_Registration.password;

public class TC08_SelectDiffTags extends TestBase {


    @Test(priority = 1,description = "User Select Differnt Category")

    public void userSelectDifferentTags() throws InterruptedException {

        new P05_Products(driver).hoverOnRandomMenuAndSubMenu();
    }
}



