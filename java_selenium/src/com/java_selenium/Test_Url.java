package com.java_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Url
{
	public static void main(String[] args) throws InterruptedException
	{ 
		String b="webdriver.chrome.driver"; 
		String c="E:\\selenium\\chromedriver_win32\\chromedriver.exe";
		String URL ="https://tinder.com/";
		System.setProperty(b, c);
		WebDriver in = new ChromeDriver();
		
		in.navigate().to(URL);
		Thread.sleep(2000);
		 String j ="https://tinder"; 
	  // String h = in.getCurrentUrl();
	   if(URL.equals(j))
	   {
		   System.out.println("test case passed")   ;
	   }
	   else
	   {
		   System.out.println("test case fail")   ;  
	   }
	   in.quit();
	}
}
