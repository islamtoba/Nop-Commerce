package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class P05_Products {

    public P05_Products clickLoginTap;
    WebDriver driver;

    // TODO: Step1: Constructor
    public P05_Products(WebDriver driver) {
        this.driver = driver;

    }

    private final By clickSearchForProduct = By.xpath("//button[@class='button-1 search-box-button']");

    public P05_Products searchForProductBtn() {

        driver.findElement(clickSearchForProduct).click();
        return this;

    }

    private final By searchStoreTextbox = By.xpath("//input[@id='small-searchterms']");

    public P05_Products searchForProduct(String product) {

        driver.findElement(searchStoreTextbox).sendKeys(product);
        return this;
    }

    private final By rightIteamBeenChoosen = By.xpath("//a[normalize-space()='Nokia Lumia 1020']");

    private final By computerCategory = By.xpath("//ul[@class='top-menu notmobile']//*[text()='Computers ']");

    public P05_Products clickOnComputersCategory() throws InterruptedException {
        driver.findElement(computerCategory).click();

        WebElement computerCategoryVar = (WebElement) computerCategory;

        Actions action = new Actions(driver);

        action.moveToElement(computerCategoryVar).perform();
        return this;

    }

    private final By electronicsCategory = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    public P05_Products clickElectronicsCategory() throws InterruptedException {
        WebElement electronicsElement = driver.findElement(electronicsCategory);
        Actions action = new Actions(driver);
        Thread.sleep(1500);
        // Optional: Wait for the element to be visible
        if (electronicsElement.isDisplayed()) {
            action.moveToElement(electronicsElement).perform();
        } else {
            System.out.println("Error: 'Apparel' category element is not visible.");
        }
        Thread.sleep(1500);
        return this;
    }

    private final By ElectronicsCameraSubCategory = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Camera & photo']");
    public P05_Products getElectronicsCameraSubCategory() throws InterruptedException {
        driver.findElement(ElectronicsCameraSubCategory).click();
        Thread.sleep(1500);
        return this;
    }

    private final By digitalDownloadsCategory = By.xpath("//ul[@class='top-menu notmobile']//a[@href='/digital-downloads']");
    public P05_Products clickDigitalDownloadsCategory() throws InterruptedException {
        driver.findElement(digitalDownloadsCategory).click();
        Thread.sleep(1500);
        return this;
    }

    private final By digBookNightVisions = By.xpath("//h2[@class='product-title']//a[normalize-space()='Night Visions']");
    public P05_Products clickOnDigBookNightVisions() throws InterruptedException {
        driver.findElement(digBookNightVisions).click();
        Thread.sleep(1500);
        return this;
    }
    private final By ElectronicsCellPhonesSubCategory = By.xpath("//ul[@class='top-menu notmobile']//a[@href='/cell-phones']");
    public P05_Products getElectronicsCellPhonesSubCategory() throws InterruptedException {
        driver.findElement(ElectronicsCellPhonesSubCategory).click();
        Thread.sleep(1500);
        return this;
    }
    private final By HTCOne4G = By.xpath("//h2[@class='product-title']//a[@href='/htc-one-m8-android-l-50-lollipop']");
    public P05_Products clickOnHTCOne4G() throws InterruptedException {
        driver.findElement(HTCOne4G).click();
        Thread.sleep(1500);
        return this;
    }
    private final By AddToCartHTCOne4G = By.xpath("//button[@id='add-to-cart-button-18']");
    public P05_Products clickOnAddToCartHTCOne4G() throws InterruptedException {
        driver.findElement(AddToCartHTCOne4G).click();
        Thread.sleep(1500);
        return this;
    }
    private final By AddToCartBookNightVisions = By.xpath("//button[@id='add-to-cart-button-34']");
    public P05_Products clickAddToCartBookNightVisions() throws InterruptedException {
        driver.findElement(AddToCartBookNightVisions).click();
        Thread.sleep(1500);
        return this;
    }
    private final By ShoppingCartHyperLink = By.xpath("//a[normalize-space()='shopping cart']");
    public P05_Products clickOnShoppingCart() throws InterruptedException {
        driver.findElement(ShoppingCartHyperLink).click();
        Thread.sleep(1500);
        return this;
    }


    private final By apparelCategory = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']");

    public P05_Products clickOnApparelCategory() throws InterruptedException {
        WebElement apparelElement = driver.findElement(apparelCategory);
        Actions action = new Actions(driver);
        Thread.sleep(1500);
        // Optional: Wait for the element to be visible
        if (apparelElement.isDisplayed()) {
            action.moveToElement(apparelElement).perform();
        } else {
            System.out.println("Error: 'Apparel' category element is not visible.");
        }
        Thread.sleep(1000);
        return this;
    }
    private final By apparelShoesSubCategory = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Shoes']");

    public P05_Products clickOnapparelShoesSubCategory() throws InterruptedException {
        driver.findElement(apparelShoesSubCategory).click();
        Thread.sleep(1500);
        return this;
    }
    private final By computerDesktopSubCategory = By.xpath("//ul[@class='top-menu notmobile']//*[text()='Desktops ']");

    public P05_Products clickOnComDesktopsSubCategory() throws InterruptedException {
        driver.findElement(computerDesktopSubCategory).click();
        Thread.sleep(1500);
        return this;
    }

    private final By clickOnBuildYourOwnDesktop = By.xpath("//h2[@class='product-title']/a[@href='/build-your-own-computer']");

    public P05_Products clickOnFirstDesktops() throws InterruptedException {
        driver.findElement(clickOnBuildYourOwnDesktop).click();
        Thread.sleep(1500);
        return this;
    }

    private final By chooseLeicaTMirrorless  = By.xpath("//h2[@class=\"product-title\"]//a[@href=\"/leica-t-mirrorless-digital-camera\"]");

    public P05_Products clickOnLeicaTMirrorless() throws InterruptedException {
        driver.findElement(chooseLeicaTMirrorless).click();
        Thread.sleep(1500);
        return this;
    }


    private final By computerNotebooksSubCategory = By.xpath("//ul[2]/li[1]/ul/li[2]/a[text()='Notebooks ']");

    private final By computerSoftwareSubCategory = By.xpath("//ul[2]/li[1]/ul/li[3]/a[text()='Software ']");


    private final By electronicsCellPhoneSubCategory = By.xpath("//ul[2]/li[2]/ul/li[2]/a[text()='Cell phones ']");

    private final By electronicsOthersSubCategory = By.xpath("//ul[2]/li[2]/ul/li[3]/a[text()='Others ']");



    private final By apparelClothingSubCategory = By.xpath("//ul[2]/li[3]/ul/li[2]/a[text()='Clothing ']");

    private final By apparelAccessoriesSubCategory = By.xpath("//ul[2]/li[3]/ul/li[3]/a[text()='Accessories ']");

    private final By selectRamType = By.xpath("//select[@id='product_attribute_2']");

    public P05_Products selectAttributeRamList() throws InterruptedException {
        driver.findElement(select8GBRamType).click();
        Thread.sleep(1500);
        return this;
    }

    private final By select8GBRamType = By.xpath("//option[@value='5']");

    public P05_Products clickOnRamList() throws InterruptedException {
        driver.findElement(selectRamType).click();
        Thread.sleep(1500);
        return this;
    }

    private final By select400GB = By.xpath("//input[@id='product_attribute_3_7']");

    public P05_Products clickOn400GB() throws InterruptedException {
        driver.findElement(select400GB).click();
        Thread.sleep(1500);
        return this;
    }

    private final By clickAddToCart = By.xpath("//button[@id='add-to-cart-button-1']");

    public P05_Products clickOnAddToCartBtn() throws InterruptedException {
        driver.findElement(clickAddToCart).click();
        Thread.sleep(1500);
        return this;
    }

    private final By addToWishList=By.xpath("//button[@id='add-to-wishlist-button-1']");

    public P05_Products clickOnAddToWishListBtn() throws InterruptedException {
        driver.findElement(addToWishList).click();
        Thread.sleep(1500);
        return this;
    }
    private final By addToWishListForCam=By.xpath("//button[@id='add-to-wishlist-button-16']");

    public P05_Products clickOnAddToWishListBtn2() throws InterruptedException {
        driver.findElement(addToWishListForCam).click();
        Thread.sleep(1500);
        return this;
    }
    private final By addToCompareList=By.xpath("//button[@class='button-2 add-to-compare-list-button']");

    public P05_Products clickOnAddToCompareListBtn() throws InterruptedException {
        driver.findElement(addToCompareList).click();
        Thread.sleep(1500);
        return this;
    }

    public P05_Products scrollDown() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)");
        Thread.sleep(1500);
        return this;

    }


    public boolean rightIteamBeenChoosenCorrect() throws InterruptedException {
        Thread.sleep(1500);
        return driver.findElement(rightIteamBeenChoosen).getText().contains("Nokia Lumia 1020");

    }

    private final By sucessmsg=By.xpath("//div[@class=\"bar-notification success\"]");

    public Boolean ifsucessmsgdisplayed() throws InterruptedException {
        return driver.findElement(this.sucessmsg).isDisplayed();
    }

    private final By category=By.xpath("(//strong)[2]");
    public Boolean checkifcategoriesdisplayes() throws InterruptedException {
        return driver.findElement(this.category).isDisplayed();
    }


    public P05_Products hoverOnRandomMenuAndSubMenu() throws InterruptedException {
        List<By> menuLocators = Arrays.asList(
                By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"),
                By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']"),
                By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")
        );

        List<By> subMenuLocators = Arrays.asList(
                By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']"),
                By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Notebooks']"),
                By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Software']"),

                By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Camera & photo']"),
                By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']"),
                By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Others']"),

                By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Shoes']"),
                By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Clothing']"),
                By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Accessories']")
        );

        // Check if any menus or submenus are present
        if (menuLocators.isEmpty() || subMenuLocators.isEmpty()) {
            System.out.println("Error: No menu or submenu elements found using the provided locators.");
            return this;
        }
        // Select a random menu
        int randomMenuIndex = new Random().nextInt(menuLocators.size());
        By randomMenuLocator = menuLocators.get(randomMenuIndex);
        WebElement randomMenu = driver.findElement(randomMenuLocator);
        Thread.sleep(1500);
        Actions action = new Actions(driver);
        Thread.sleep(1500);
        // Hover over the random menu
        action.moveToElement(randomMenu).perform();
        // Optional: Wait for submenu to appear (replace with a robust wait strategy)
        Thread.sleep(1000);
        // Select a random sub-menu from the chosen menu
        List<WebElement> subMenuElements = driver.findElements(subMenuLocators.get(randomMenuIndex));
        // Check if sub-menus are present for the chosen menu
        if (subMenuElements.isEmpty()) {
            System.out.println("Error: No sub-menu elements found for the chosen menu.");
            Thread.sleep(1500);
            return this;
        }
        int randomSubMenuIndex = new Random().nextInt(subMenuElements.size());
        WebElement randomSubMenu = subMenuElements.get(randomSubMenuIndex);
        Thread.sleep(2000);
        // Hover over the random sub-menu
        action.moveToElement(randomSubMenu).perform();
        Thread.sleep(1500);
        return this;
    }


}
