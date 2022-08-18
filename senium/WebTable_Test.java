package com.infy.Webtable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Test {

	public static void main(String[] args)
	{
		String key = "webdriver.chrome.driver";
		String value = "D:\\Selenium\\chromedriver_win32U\\chromedriver.exe";
		String URL = "https://www.techlistic.com/p/demo-selenium-practice.html";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver(); // used to open the chromedriver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Selenium 4
		driver.get(URL);
		
		List<WebElement> row = driver.findElements(By.xpath("//table[contains(@style, 'box-sizing')]/tbody/tr"));
		
		List<WebElement> column =driver.findElements(By.xpath("//table[contains(@style, 'box-sizing')]/tbody/tr/th"));
		
//		WebElement row = driver.findElement(By.xpath("(//td[contains(@style, 'border')])[1]"));
//		System.out.println(row.getText());
		// //table[contains(@style, 'box-sizing')]/tbody/tr[5]/td[2]
		
		
		for (int i=2; i<=row.size(); i++)
		{
			for (int j=1; j<=column.size(); j++)
			{
				WebElement text = driver.findElement(By.xpath("//table[contains(@style, 'box-sizing')]/tbody/tr["+i+"]/td["+j+"]"));
				System.out.print(text.getText()+"   ");
			}
			System.out.println(" ");
		}		
	}
}
