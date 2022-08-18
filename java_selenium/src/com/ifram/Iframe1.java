package com.ifram;


import java.io.IOException;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import Screenshot.Genralization;


public class Iframe1 {
	public static void main(String []args) throws IOException 
	{
		String url="https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame";
		System.setProperty("webdriver.edge.driver","E:\\drivers of browser\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
	    driver.get(url);
		driver.switchTo().frame("globalSqa");
		WebElement tc=driver.findElement(By.xpath("//img[@alt=\"Selenium Online Training\"]"));
		tc.click();
		System.out.println(driver.getCurrentUrl());
		
		if(tc.isDisplayed()) 
		{
		Genralization.Screenshot(driver);
		System.out.println("screenshot sucessfully taken");
		}
		else 
		{
			System.out.println("failed to take screenshot");
		}
	}

}
