package com.java_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass {

	public static void main(String[] args) throws InterruptedException
	{
		String key ="webdriver.chrome.driver";
		String value="E:\\selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty(key,value);
		WebDriver in =new ChromeDriver();
		
		 in.manage().window().maximize();
		 in.navigate().to("https://www.google.com/search?gs_ssp=eJzj4tTP1TewzEmvTDNg9BJOL81JSixKT1QozcssSy0qziypBACqPgtP&q=gulbarga+university&oq=&aqs=chrome.0.46i39i362j35i39i362l7.692630613j0j7&sourceid=chrome&ie=UTF-8");
			 
			 
		 Thread.sleep(2000);
		 in.navigate().back();
		 Thread.sleep(2000);
		 in.navigate().forward();
		 Thread.sleep(12000);
		 in.navigate().refresh();
		Thread.sleep(5000);
		 in.quit();
	}

}
