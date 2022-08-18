package com.java_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title_Url {

	public static void main(String[] args) throws InterruptedException 
	{
		String b="webdriver.chrome.driver"; 
		String c="E:\\selenium\\chromedriver_win32\\chromedriver.exe";
		String URL ="https://tinder.com/";
		String title="Tinder | Dating, Make Friends & Meet New People";
		System.setProperty(b, c);
		WebDriver in = new ChromeDriver();
		in.manage().window().maximize();
		in.navigate().to(URL);
		Thread.sleep(2000);
		 String j ="https://tinder"; 
		 String Title=in.getTitle();
		 System.out.println(Title);
//	   String h = in.getCurrentUrl();
	   if(title.equals(Title))
	   {
		   System.out.println("Title is: " + Title)   ;
	   }
	   else
	   {
		   System.out.println("test case fail")   ;  
	   }
	   in.quit();
	}


	

}
