package com.java_selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import zmq.io.coder.IDecoder;

public class Automation_demo
{

	public static void main(String[] jubnj) throws InterruptedException
	  {
		String key="webdriver.chrome.driver";
		String value="E:\\selenium\\chromedriver_win32\\chromedriver.exe";
		String url="file:///E:/New%20folder/HTML.html";
        System.setProperty(key,value);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(url);
        WebElement a =driver.findElement(By.id("1"));
        a.sendKeys("harish");
        a.sendKeys("bhim");
        driver.findElement(By.name("whole no")).sendKeys("5154842484");
//        driver.findElement(By.tagName("input")).sendKeys("jhandu");
//        driver.findElement(By.className("ram")).sendKeys("jhandu");
          driver.findElement(By.name("female")).click();
          driver.findElement(By.name("male")).click();
          driver.findElement(By.name("mobile no.")).sendKeys("20515151");
          Thread.sleep(20001);
          driver.quit();
	}
}