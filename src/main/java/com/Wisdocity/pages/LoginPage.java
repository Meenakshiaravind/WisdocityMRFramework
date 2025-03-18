package com.Wisdocity.pages;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	private By logIn = By.xpath("//a[text()='Log In']");
	private By userName = By.xpath("//input[@placeholder='example@email.com']");
	private By password = By.xpath("//input[@placeholder='********']");
	private By logInBtn = By.xpath("//button[@type='submit']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickLoginBtn() {
		try
		{
			driver.findElement(logIn).click();
		}
		catch(NoSuchElementException  e) {
			System.err.println("Login button not found: " + e.getMessage());
            throw e;
		}
	}
	
	public void enterUserName() {
		try
		{
			driver.findElement(userName).sendKeys("meenakshiaravind0719@gmail.com");
		}
		catch(NoSuchElementException  e) {
			System.err.println("Username field not found " + e.getMessage());
            throw e;
		}
	}
	
	public void enterPassword() {
		try
		{
			driver.findElement(password).sendKeys("Meenakshi07");
		}
		catch(NoSuchElementException  e) {
			System.err.println("Password field not found " + e.getMessage());
            throw e;
		}
	}
	
	public void clickOnLoginBtn() {
		try
		{
			driver.findElement(logInBtn).click();
		}
		catch(NoSuchElementException  e) {
			System.err.println("Login Button not found " + e.getMessage());
            throw e;
		}
	}
	
	
	
	
	
	
//	public static void openURL() {
//		try {
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//		driver =new ChromeDriver();
//		 driver.get("https://test.wisdocity.ai/");
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	     driver.manage().window().maximize();
//	   
//	}
//		catch(Exception e) {
//            e.printStackTrace(); // If WebDriver fails to initialize, print the error
//        }  
//}


}
