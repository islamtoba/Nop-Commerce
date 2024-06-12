package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_RegistrationPage {
    WebDriver driver;

    public P02_RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By genderMale = By.xpath("//input[@id='gender-male']");

    private final By genderFemale = By.xpath("//input[@id='gender-female']");

    private final By firstName = By.xpath("//input[@id='FirstName']");

    private final By lastName = By.xpath("//input[@id='LastName']");

    private final By dayOB = By.xpath("//select[@name='DateOfBirthDay']");

    private final By monthOB = By.xpath("//input[@id='LastName']");

    private final By yearOB = By.xpath("//input[@id='LastName']");

    private final By email = By.xpath("//input[@id='Email']");

    private final By companyName = By.xpath("//input[@id='Company']");

    private final By newsLetter = By.xpath("//input[@id='Newsletter']");

    private final By password = By.xpath("//input[@id='Password']");

    private final By confirmPassword = By.xpath("//input[@id='ConfirmPassword']");

    private final By registerButton = By.xpath("//button[@id='register-button']");

    private final By registerSuccessfullyMessage = By.xpath("//div[@class='result']");


    public P02_RegistrationPage selectGenderMale() throws InterruptedException {
        driver.findElement(this.genderMale).click();
        Thread.sleep(1000);
        return this;
    }

    public P02_RegistrationPage enterFristName(String firstName) throws InterruptedException {
        driver.findElement(this.firstName).sendKeys(firstName);
        Thread.sleep(1000);
        return this;

    }

    public P02_RegistrationPage enterLastName(String lastName) throws InterruptedException {
        driver.findElement(this.lastName).sendKeys(lastName);
        Thread.sleep(1000);
        return this;

    }

    public P02_RegistrationPage enterEmail( String email) throws InterruptedException {
        driver.findElement(this.email).sendKeys(email);
        Thread.sleep(1000);
        return this;

    }

    public P02_RegistrationPage enterCompanyName(String CompanyName) throws InterruptedException {
        driver.findElement(this.companyName).sendKeys(CompanyName);
        Thread.sleep(1000);
        return this;

    }

    public P02_RegistrationPage enterPasswordAndConfirmIt(String password) throws InterruptedException {
        driver.findElement(this.password).sendKeys(password);
        driver.findElement(this.confirmPassword).sendKeys(password);
        Thread.sleep(1000);
        return this;
    }

    public P02_RegistrationPage clickRegisterButton() throws InterruptedException {
        driver.findElement(this.registerButton).click();
        Thread.sleep(1000);
        return this;

    }


    public P02_RegistrationPage setDayOB() throws InterruptedException {

        driver.findElement(this.dayOB).sendKeys();
        Thread.sleep(1000);
        return this;

    }

    public P02_RegistrationPage setMonthOB() throws InterruptedException {

        driver.findElement(this.monthOB).sendKeys();
        Thread.sleep(1000);
        return this;

    }

    public P02_RegistrationPage setYearOB() throws InterruptedException {

        driver.findElement(this.yearOB).sendKeys();
        Thread.sleep(1000);
        return this;

    }

    public boolean regMessageAppearSuccessfully()
    {return driver.findElement(registerSuccessfullyMessage).getText().
            contains("Your registration completed");}
}
