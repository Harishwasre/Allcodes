package com.java_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implimantaion_test implements Interface_Test1
{
	public void Chrome_Lunch()
	{
		System.setProperty(key,value);
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().window().minimize(); 
		driver.get(url);
    	driver.equals(url);
		
	}
	public static void main(String[] args)
	{
		
		 Implimantaion_test n = new  Implimantaion_test();
		 n.Chrome_Lunch();		  
	}
	
}
