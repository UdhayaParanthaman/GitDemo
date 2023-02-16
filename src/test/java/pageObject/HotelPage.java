package pageObject;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Hooks.TestBase;

public class HotelPage {

	public WebDriver driver;
	public TestBase testBase;

	public HotelPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//li[@class='menu_Hotels']//a[1]")
	WebElement hotelClickbtn;

	@FindBy(css = "label[for='city']")
	WebElement clickOnCity;

	@FindBy(xpath = "//input[@placeholder='Enter city/ Hotel/ Area/ Building']")
	WebElement enterCityName;

	@FindBy(xpath = "//p[normalize-space()='Coimbatore District, Tamil Nadu, India']")
	WebElement select;

	@FindBy(xpath = "//label[@for='city']")
	WebElement selection;

	@FindBy(xpath = "//div[@aria-label='Sat Feb 18 2023']")
	WebElement checkInDate;

	String dat;

	// @FindBy(xpath="//div[@aria-label='Tue Mar 28 2023']")
	// WebElement checkOutDate;
	@FindBy(css = "div[aria-label=+res")
	WebElement checkOutDate;

	public void hotelLandingPage() {
		hotelClickbtn.click();
	}

	public void clickCountryName() {
		clickOnCity.click();
	}

	public void cityName() {
		enterCityName.sendKeys("coim");
		select.click();

	}

	public void dateSelect() throws InterruptedException {
		Thread.sleep(3000);
		checkInDate.click();
		Thread.sleep(3000);
		checkOutDate.click();
	}

	public void currentDate() {
		Format dateFormat = new SimpleDateFormat("EEE MMM dd yyyy");
		String res = dateFormat.format(new Date());
		System.out.println("Date = " + res);
	}

}
