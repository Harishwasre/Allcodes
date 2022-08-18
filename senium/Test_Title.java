package com.infy.Sample_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Title {

	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String value = "D:\\Selenium\\chromedriver_win32\\chromedriver.exe";
		String URL ="https://www.facebook.com/";
		String ExpTitle= "Facebook – log in or sign up";
		
		System.setProperty(key, value );
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(URL);
		
		String Title = driver.getTitle();
		
		System.out.println("Title = "+Title);
		if (ExpTitle.equals(Title))
		{
			System.out.println("Test is pass= "+ Title);
		}else
		{
			System.out.println("Test is fail");
		}
		driver.quit();

	}

}
