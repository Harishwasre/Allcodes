package com.java_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_down_up
{
	public static void main(String [] args) 
	{
		String key ="webdriver.chrome.driver";
		String value="E:\\selenium\\chromedriver_win32\\chromedriver.exe";
		String url="https://amzon.com/";
		System.setProperty(key,value);
		WebDriver d =new ChromeDriver();
		d.get(url);
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		
//		Dimension di=new Dimension(500,500);
//		d.manage().window().setSize(di);
		
		JavascriptExecutor je=((JavascriptExecutor)d);
		je.executeScript("scroll(0,1000)");
		je.executeScript("scroll(500,1000)");
		
//		d.findElement(By.xpath("//img[@alt=\"Headsets\"]")).click();
	}

}
