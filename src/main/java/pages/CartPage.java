package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    By productName = By.className("inventory_item_name");
    By productPrice = By.className("inventory_item_price");
    By productQuantity = By.className("cart_quantity");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getProductName() {
        return driver.findElement(productName).getText();
    }

    public String getProductPrice() {
        return driver.findElement(productPrice).getText();
    }

    public String getProductQuantity() {
        return driver.findElement(productQuantity).getText();
    }
}
