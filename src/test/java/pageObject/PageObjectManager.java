package pageObject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public WebDriver driver;
	public HomePage homePage;
	public HotelPage hotelPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomePage getHomePage()
	{
		homePage=new HomePage(driver);
		return homePage;
		
	}
	
	public HotelPage getHotelPage()
	{
		hotelPage=new HotelPage(driver);
		return hotelPage;
	}
	
	
	
	
	
}
