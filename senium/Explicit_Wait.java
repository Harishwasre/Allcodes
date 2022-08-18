package com.infy.synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.Timeout;

public class Explicit_Wait 
{
	public static void main(String[] args)
	{
		String key = "webdriver.chrome.driver";
		String value = "D:\\Selenium\\chromedriver_win32U\\chromedriver.exe";
		String URL = "https://www.google.com/";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver(); // used to open the chromedriver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(URL);
		
		driver.findElement(By.name("q")).sendKeys("selenium" + Keys.ENTER);
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement result = w.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a/h3)[1]")));
		// WebElement result = w.until(ExpectedConditions.elementToBeClickable(By.xpath("(/a/a/h3)[1]"))); --> Error Scenario
		System.out.println(result.getText());
		
	}

}
