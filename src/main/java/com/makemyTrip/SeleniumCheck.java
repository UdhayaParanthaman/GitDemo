package com.makemyTrip;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class SeleniumCheck {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/hotels/");
		driver.findElement(By.cssSelector("label[for='city']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter city/ Hotel/ Area/ Building']")).sendKeys("Coi");
		driver.findElement(By.xpath("//p[normalize-space()='Coimbatore District, Tamil Nadu, India']")).click();
		String s = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'][1])[1]")).getText();
		System.out.println(s);
		String[] str=s.split("20");
		
		String month = str[0].trim();
		String yr = str[1];
		
		System.out.println(month);
		System.out.println(yr);
		boolean a  = false;
		
		while(s!="July 2023")
		{
			System.out.println("month");
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		
		}

		
		
	}
}
