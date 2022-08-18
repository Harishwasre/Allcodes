package com.windowhandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class MulitipleWindow_handle {

	public static void main(String[] args)
	{
		String key="webdriver.chrome.driver";
		String value = "E:\\drivers of browser\\chromedriver_win32 (1)\\chromedriver.exe";
		String url="https://nxtgenaiacademy.com/multiplewindows/";
		System.setProperty(key, value);
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		driver.findElement(By.xpath("//button[@onclick=\"newBrwWin()\"]")).click();
		
		driver.findElement(By.xpath("//button[@onclick=\"newMsgWin()\"]")).click();
		driver.findElement(By.xpath("//button[@onclick=\"newBrwTab()\"]")).click();
		
		String parent=driver.getWindowHandle();
		
		Set<String>child=driver.getWindowHandles();
		
		for(String x:child)
		{
			if(!parent.equalsIgnoreCase(x)) 
			{
				driver.switchTo().window(x);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		driver.close();
		
	}

}
