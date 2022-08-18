package com.java_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Class   
{ 
	
	public static  void main(String []args)
	{
		String key="webdriver.chrome.driver";
		String value="E:\\selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key,value );
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("selenium");
		
		List<WebElement> list = driver.findElements(By.xpath("//*[@class=\"erkvQe\"]//div[@class=\"wM6W7d\"]"));
		 
		for (WebElement c:list) 
		{
			System.out.println("--------"+c.getText());
			
		}
	driver.quit();
	}  
}  