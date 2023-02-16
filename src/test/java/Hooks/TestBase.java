package Hooks;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public WebDriver driver;
	
	public WebDriver WebBrowserManager() throws IOException
	{
		//read datas from file
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		Properties prop=new Properties();
		prop.load(fis); //loading the file
		String url=prop.getProperty("BaseUrl");
		String browser_properties=prop.getProperty("browser");
		String browser_maven=System.getProperty("browser");
		
		String browser= browser_maven!=null?browser_maven:browser_properties;
		System.out.println(url);
		if(driver==null)
		{
			if(browser.equalsIgnoreCase("Chrome"))
			{
				driver=new ChromeDriver();
			}
			/*
			 * if(browser.equalsIgnoreCase("FireFox")) { driver=new FirefoxDriver();
			 * 
			 * }
			 */
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get(url);
			//System.out.println(url);
		    //System.out.println(driver.getTitle());
			driver.manage().window().maximize();
	
		}
	
		return driver;
	}
	}
	

