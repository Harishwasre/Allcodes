package com.infy.Broken_Link;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Link_Test {

	public static void main(String[] args) throws IOException
	{
		String key = "webdriver.chrome.driver";
		String value = "D:\\Selenium\\chromedriver_win32U\\chromedriver.exe";
		String URL = "https://www.amazon.in/";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver(); // used to open the chromedriver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Selenium 4
		driver.get(URL);

		WebElement logo = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
		int x_co = logo.getLocation().getX();
		int y_co = logo.getLocation().getY();

		JavascriptExecutor je = ((JavascriptExecutor)driver);
		je.executeScript("window.scrollBy("+x_co+", "+y_co+")");

		List<WebElement> links = driver.findElements(By.xpath("//ul/li/a"));

		for (WebElement link: links )
		{
			String url = link.getAttribute("href");
			URL u = new URL(url);
			HttpURLConnection conn = (HttpURLConnection) u.openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();

			int respcode = conn.getResponseCode();

			if (respcode >400) {
				System.out.println("Link is broken "+ respcode+ "  Text is "+ link.getText());
			} else {
				System.out.println("Link is OK "+ respcode+ "  Text is "+ link.getText());
			}

		}


	}

}
