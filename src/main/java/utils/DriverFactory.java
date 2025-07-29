package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
   static WebDriver driver;

    public static WebDriver setUp() {
        WebDriverManager.chromedriver().setup();    
        driver = new ChromeDriver();
        driver.manage().window().maximize();
		return driver;
       
    }

    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

