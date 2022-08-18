package com.ifram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args)
	{
		String key ="webdriver.chrome.driver";
		String value="E:\\selenium\\chromedriver_win32\\chromedriver.exe";
		String url="https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame";
		System.setProperty(key,value);
		WebDriver d =new ChromeDriver();
		d.get(url);
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		WebElement f = d.findElement(By.xpath("//iframe[@name=\"globalSqa\"]"));
		d.switchTo().frame(f);
		d.findElement(By.xpath("//img[@alt=\"Selenium Online Training\"]")).click();
	}

}
