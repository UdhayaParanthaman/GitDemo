package StepDefinitions;

import static org.junit.Assert.*;
import static org.testng.Assert.assertEquals;
import org.junit.Assert;
import java.io.IOException;

import org.openqa.selenium.WebDriver;


import Hooks.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HomePage;
import pageObject.HotelPage;

public class HomePageStepDefinition   {

	
	public WebDriver driver;
    TestContextSetup testContextSetup;
    HomePage homePage;

	public HomePageStepDefinition(TestContextSetup testContextSetup) throws IOException {
		this.testContextSetup = testContextSetup;
		this.homePage=testContextSetup.pageObjectManager.getHomePage();
	}

	@Given("I am on the Login page URL")
	public void i_am_on_the_login_page_url() throws IOException {
		//homePage.getCurTitle();	
		Assert.assertTrue(homePage.getCurTitle().contains("MakeMyTrip"));
	}

	@When("click on login button")
	public void click_on_login_button() throws InterruptedException {
		Thread.sleep(2000);
		homePage.clickLogin();
	}
	
	@Then("give valid Credentials {string} and {string} for logged in")
	public void give_valid_credentials_and_for_logged_in(String userName, String password) throws InterruptedException {
		homePage.placeLoginPage(userName, password);
		//homePage.clickLoginBtn();
		
	}
	
	

	
}
