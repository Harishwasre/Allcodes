package com.java_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args)
	{
		String key="webdriver.chrome.driver";
		String value = "E:\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe";
		String url="https://www.journaldev.com/26429/selenium-webdriver";
		System.setProperty(key, value);
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		JavascriptExecutor je=((JavascriptExecutor)driver);
//		je.executeScript("scroll(0,2000))");
		je.executeScript("scroll (0, 1800)");
         List<WebElement> row = driver.findElements(By.xpath("//table[1][@class=\"tg\"]//tbody//tr"));
         System.out.println(row.size());
        
       List<WebElement> col = driver.findElements(By.xpath("//table[1][@class=\"tg\"]//tbody//th"));
       System.out.println(col.size());
        for (int i=2;i<row.size();i++) 
        {
        	for(int j=1;j<=col.size();j++)
        	{
        		
        		WebElement text = driver.findElement(By.xpath("//table[1][@class=\"tg\"]//tbody//tr["+i+"]//td["+j+"]"));
        		String c = text.getText();
        		System.out.println(c);		
        	}
        }
        driver.quit();
	}

}
