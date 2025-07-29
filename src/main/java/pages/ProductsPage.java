package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class ProductsPage {
    WebDriver driver;

    By sortDropdown = By.className("product_sort_container");
    By productNames = By.className("inventory_item_name");
    By productPrices = By.className("inventory_item_price");
    By addToCartButtons = By.cssSelector("button.btn_inventory");
    By cartIcon = By.className("shopping_cart_link");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void sortBy(String optionText) {
        new Select(driver.findElement(sortDropdown)).selectByVisibleText(optionText);
    }

    public String getFirstProductName() {
        return driver.findElements(productNames).get(0).getText();
    }

    public String getFirstProductPrice() {
        return driver.findElements(productPrices).get(0).getText();
    }

    public void addFirstProductToCart() {
        driver.findElements(addToCartButtons).get(0).click();
    }

    public void goToCart() {
        driver.findElement(cartIcon).click();
    }
}

