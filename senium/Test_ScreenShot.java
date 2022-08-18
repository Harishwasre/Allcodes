package com.infy.ScreenShot_Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Test_ScreenShot implements Take_Sc  {

	public static void main(String[] args) throws IOException
	{
		String key = "webdriver.chrome.driver";
		String value = "D:\\Selenium\\chromedriver_win32U\\chromedriver.exe";
		String URL = "https://www.primevideo.com/";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(URL);
		
		File destination = new File (store);
		FileHandler.copy(actual, destination);
		driver.close();
		Take_Sc tcc =new Take_Sc(driver);
	}
	public void tc( driver) {
		
		
		}

}
