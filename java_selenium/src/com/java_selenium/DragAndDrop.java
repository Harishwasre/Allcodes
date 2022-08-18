package com.java_selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		String key="webdriver.chrome.driver";
		String value = "E:\\selenium\\chromedriver_win32\\chromedriver.exe";
		String url="https://www.globalsqa.com/demo-site/draganddrop/";
		System.setProperty(key, value);
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		
		WebElement fram=driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]"));
		driver.switchTo().frame(fram);
		
		WebElement drag = driver.findElement(By.xpath("//img[@alt=\"The peaks of High Tatras\"]"));
		WebElement drop=driver.findElement(By.xpath("//div[@class=\"ui-widget-content ui-state-default ui-droppable\"]"));
		
		Actions ac= new Actions (driver);
		ac.clickAndHold(drag).moveToElement(drop).release().build().perform();
//		 ac.dragAndDrop(drag, drop).perform();
		
		    Date d= new Date();
			TakesScreenshot tc=((TakesScreenshot)driver);
			File src =tc.getScreenshotAs(OutputType.FILE);
		    File f=new File("E:\\New folder (2)\\"+d.toString().replace(":", "_")+"harish.png");
		    FileHandler.copy(src, f);
		   
		
		Thread.sleep(2000);
		driver.close();
	}

}
