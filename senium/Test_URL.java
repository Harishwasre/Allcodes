package com.infy.Sample_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_URL {

	public static void main(String[] args)
	{
		String key = "webdriver.chrome.driver";
		String value = "D:\\Selenium\\chromedriver_win32\\chromedriver.exe";
		String URL ="https://www.facebook.com/";
		String ExpURL="https://www.facebook";
		System.setProperty(key, value );
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(URL);
		String ActualURL = driver.getCurrentUrl();
		
		System.out.println("ActualURL = "+ActualURL);
		if (ExpURL.equals(ActualURL))
		{
			System.out.println("Test is pass= "+ ActualURL);
		}else
		{
			System.out.println("Test is fail");
		}
		driver.quit();
	}
}
