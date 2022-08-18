package com.infy.synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluent_Wait {

	public static void main(String[] args)
	{
		String key = "webdriver.chrome.driver";
		String value = "D:\\Selenium\\chromedriver_win32U\\chromedriver.exe";
		//String URL = "https://www.google.com/";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver(); // used to open the chromedriver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.get(URL);
		
		Wait <WebDriver> w = new FluentWait <WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		Boolean text = w.until(ExpectedConditions.titleIs(value));
		
	}

}
