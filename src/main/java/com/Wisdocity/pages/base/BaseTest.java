package com.Wisdocity.pages.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	protected static WebDriver driver;

    public static void setup() {
    	try {
            // Setup Chrome WebDriver using WebDriverManager
//            System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");   
//            driver.get("https://test.wisdocity.ai");
    		WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
            driver.manage().window().maximize();
        	}catch (Exception e) {
                e.printStackTrace(); // If WebDriver fails to initialize, print the error
            }  
     }

//   public static void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }

    public static WebDriver getDriver() {
        return driver;
    }

}
