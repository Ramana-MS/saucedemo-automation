package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import pages.LoginPage;
import pages.ProductsPage;
import pages.CartPage;
import utils.DriverFactory;

import static org.testng.Assert.*;

public class AddToCartTest {
    WebDriver driver;
    LoginPage loginPage;
    ProductsPage productsPage;
    CartPage cartPage;

    @BeforeMethod
    public void setUp() {
        driver = DriverFactory.setUp();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
        cartPage = new CartPage(driver);
    }

    @DataProvider(name = "sortOptions")
    public Object[][] sortOptions() {
        return new Object[][] {
            {"Price (low to high)"},
            {"Price (high to low)"},
            {"Name (A to Z)"}
        };
    }

    @Test(dataProvider = "sortOptions")
    public void testAddFirstProductToCart(String sortOption) {
        loginPage.login("standard_user", "secret_sauce");

        productsPage.sortBy(sortOption);
        String expectedName = productsPage.getFirstProductName();
        String expectedPrice = productsPage.getFirstProductPrice();

        productsPage.addFirstProductToCart();
        productsPage.goToCart();

        assertEquals(cartPage.getProductName(), expectedName);
        assertEquals(cartPage.getProductPrice(), expectedPrice);
        assertEquals(cartPage.getProductQuantity(), "1");
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.tearDown();
    }
}
