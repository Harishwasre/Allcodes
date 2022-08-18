package com.java_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navi_Impl implements Navigation_topic

{


	public void insta() throws InterruptedException 
	{
		System.setProperty(key,value);
	WebDriver in =new ChromeDriver();
		 in.manage().window().maximize();
		 in.navigate().to(url);
		 Thread.sleep(2000);
		 in.navigate().back();
		 Thread.sleep(2000);
		 in.navigate().refresh();
		 Thread.sleep(5000);
		 in.navigate().forward();
		 Thread.sleep(2000);
	 in.quit();
	}
	public static void main(String[] args) throws InterruptedException 
	{
		Navi_Impl i=new Navi_Impl();
		i.insta();
	}	
}
