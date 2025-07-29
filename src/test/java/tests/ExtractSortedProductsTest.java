package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import pages.LoginPage;
import pages.ProductsPage;
import utils.DriverFactory;

public class ExtractSortedProductsTest {
    WebDriver driver;
    LoginPage loginPage;
    ProductsPage productsPage;

    @BeforeMethod
    public void setUp() {
        driver = DriverFactory.setUp();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
    }

    @Test
    public void extractTop3SortedByNameZtoA() {
        loginPage.login("standard_user", "secret_sauce");
        productsPage.sortBy("Name (Z to A)");
        productsPage.printTop3ProductNamesAndPrices();
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.tearDown();
    }
}
 