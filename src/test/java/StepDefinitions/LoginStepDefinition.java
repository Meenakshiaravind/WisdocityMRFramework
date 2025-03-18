package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.Wisdocity.pages.HomePage;
import com.Wisdocity.pages.LoginPage;
import com.Wisdocity.pages.base.BaseTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	private LoginPage loginPage;
	private HomePage homePage;
	
	 @Given("User navigates to login page")
	 public void user_navigates_to_login_page() {
	    BaseTest.getDriver().get("https://test.wisdocity.ai");
	    loginPage = new LoginPage(BaseTest.getDriver());
	 }
	 
	 @When("User clicks on Login button")
	 public void user_ClicksOnLoginBtn() {
		    loginPage.clickLoginBtn();
		 }
	 
	 @And("User enters Valid Username and Password")
	 public void user_enterCredentials() {
		 loginPage.enterUserName();
		 loginPage.enterPassword();
	 }
	 
	 @And("clicks on the Login button")
	 public void clickOnLoginBtn() {
		 loginPage.clickOnLoginBtn();
	 }
	 
	 @Then("User should see message {string}")
	 public void user_should_see_welcome_message(String expectedMessage) {
	      homePage = new HomePage(BaseTest.getDriver());
	      Assert.assertEquals(homePage.getWelcomeMessage(), expectedMessage);
	 }
	
//	private WebDriver driver;
//@Given("User is on Login Page")
//public void user_is_on_login_page() {
//	// Write code here that turns the phrase above into concrete actions
////	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
////	driver =new ChromeDriver();
////	 driver.get("https://test.wisdocity.ai/");
////	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
////     driver.manage().window().maximize();
////    throw new io.cucumber.java.PendingException();
//	LoginPage.openURL();
//}
//
//@When("User clicks on the Login button")
//public void userclicks_on_the_login_button() {
//    //  code here that turns the phrase above into concrete actions
////	driver.findElement(By.xpath("//a[text()='Log In']")).click();
////    throw new io.cucumber.java.PendingException();
//	LoginPage.clickLoginBtn();
//}
//
//@And("User enters Valid Username and Password")
//public void user_enters_valid_username_and_password() {
//    //  code here that turns the phrase above into concrete actions
//	driver.findElement(By.xpath("//input[@placeholder='example@email.com']")).sendKeys("Meenakshichandru2315@gmail.com");
//	driver.findElement(By.xpath("//input[@placeholder='********']")).sendKeys("Meenakshi@07");
//	driver.findElement(By.xpath("//button[@type='submit']")).click();
//    throw new io.cucumber.java.PendingException();
//}
//
//@And("clicks on the Login button")
//public void clicks_on_the_login_button() {
//	driver.findElement(By.xpath("//button[@type='submit']")).click();
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
//
//@Then("User lands on the Login Page")
//public void user_lands_on_the_login_page() {
//    // Write code here that turns the phrase above into concrete actions
//	Assert.assertTrue(driver.findElements(By.xpath("//div[@class='flex h-16 shrink-0 items-center justify-center']")).size()>0);
//    throw new io.cucumber.java.PendingException();
//}
//
//@And("Close the browser")
//public void close_the_browser() {
//	
//    // Write code here that turns the phrase above into concrete actions
//	driver.close();
//    throw new io.cucumber.java.PendingException();
//}

}
