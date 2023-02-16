package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Hooks.TestBase;

public class HomePage {
	
	public WebDriver driver;
	public TestBase testBase;

	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	/*
	 * String email="uk1792692@gmail.com"; String pass="Welcome@123";
	 */
	
   @FindBy(xpath="//p[@data-cy='LoginHeaderText']")
   WebElement loginClick;
   
	@FindBy(xpath="//input[@id='username']")
	WebElement userName;
	
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@class='capText font16']")
	WebElement clickBtn;
	
	
   public String getCurTitle()
   {
	   String titleName="MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday";
	   String names[]=titleName.split("-");
	   String name=names[0].trim();
	   System.out.println(name);
	   //MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday
	   return name;
   }
	
	public void clickLogin()
	{
		loginClick.click();
	}
	
	public void placeLoginPage(String userName1, String password1) throws InterruptedException
	{
		userName.sendKeys(userName1);
		Thread.sleep(3000);
		clickBtn.click();
		password.sendKeys(password1);
	}
	
	public void clickLoginBtn() throws InterruptedException
	{
		Thread.sleep(3000);
		clickBtn.click();
	}
	
	
	
	
	

}
