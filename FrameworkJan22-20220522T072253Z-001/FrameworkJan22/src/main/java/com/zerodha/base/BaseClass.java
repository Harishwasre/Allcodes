package com.zerodha.base;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.zerodha.utility.Utility;

public class BaseClass 
{
	protected static WebDriver driver=null;
	public static void browserLaunch() throws EncryptedDocumentException, InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\softFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(Utility.propertydata("url"));
	}
}
