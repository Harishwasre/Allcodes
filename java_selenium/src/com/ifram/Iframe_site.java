package com.ifram;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Iframe_site
{
	public static void main(String[] args) throws IOException
	{
		String key ="webdriver.chrome.driver";
		String value="E:\\selenium\\chromedriver_win32\\chromedriver.exe";
		String url="https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame";
		System.setProperty(key,value);
		WebDriver d =new ChromeDriver();
		d.get(url);
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
//		WebElement f = d.findElement(By.xpath("//iframe[@name=\"globalSqa\"]"));
		d.switchTo().frame("globalSqa");//by name-->by id--> by webelement
		d.findElement(By.xpath("//img[@data-image-title=\"DatabaseTestingTrainingNew\"]")).click();
		
		TakesScreenshot t=((TakesScreenshot)d);
		File b=t.getScreenshotAs(OutputType.FILE);
		File c=new File("E:\\New folder (2)\\harish1.png\\");
		FileHandler.copy(b, c);
	}


}
