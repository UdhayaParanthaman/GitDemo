package StepDefinitions;

import org.openqa.selenium.WebDriver;

import Hooks.TestBase;
import Hooks.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HotelPage;


public class HotelStepDefinition {

	public WebDriver driver;
    TestContextSetup testContextSetup;
    HotelPage hotelPage;

    
	public HotelStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.hotelPage =testContextSetup.pageObjectManager.getHotelPage();
	}

	@Given("I want to land on the hotel page")
	public void i_want_to_land_on_the_hotel_page() {
		
		hotelPage.hotelLandingPage();
	}

	@When("click on the country name or location")
	public void click_on_the_country_name_or_location() throws InterruptedException {
	   
		hotelPage.clickCountryName();
		hotelPage.cityName();
//		hotelPage.dateSelect();
		hotelPage.currentDate();
		
		
		
	}


	@Given("click on the check in button")
	public void click_on_the_check_in_button() throws InterruptedException {
	 // hotelPage.dateSelect();
	}

	@When("have to select the check in date")
	public void have_to_select_the_check_in_date() {
	    	}

	@Given("click on the check Out button")
	public void click_on_the_check_out_button() {
	    	}

	@When("have to select the check Out date")
	public void have_to_select_the_check_out_date() {
	    	}
	

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		
	}

	}
