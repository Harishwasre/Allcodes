package com.java_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interview_task {

	public static void main(String[] args)
	{
		String key="webdriver.chrome.driver";
		String value = "E:\\selenium\\chromedriver_win32\\chromedriver.exe";
		String url="https://www.google.com/";
		System.setProperty(key, value);
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		
		

		driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("mobile");
		driver.findElement(By.xpath("//input[@class=\"gNO89b\"]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//h3[1][@class=\"LC20lb MBeuO DKV0Md\"]")).click();
		 System.out.println("passed");

	}

}
