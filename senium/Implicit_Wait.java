package com.infy.synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Implicit_Wait 
{
	public static void main(String[] args)
	{
		String key = "webdriver.chrome.driver";
		String value = "D:\\Selenium\\chromedriver_win32U\\chromedriver.exe";
		String URL = "https://www.facebook.com/reg/";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver(); // used to open the chromedriver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Selenium 3
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Selenium 4
		driver.get(URL);

		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s = new Select (day);
		s.selectByVisibleText("18");

		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select sm = new Select (month);
		sm.selectByIndex(2);

	}
}