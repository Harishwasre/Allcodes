package com.java_selenium;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args)
	{
	    String key="webdriver.chrome.driver";
		String value = "E:\\selenium\\chromedriver_win32\\chromedriver.exe";
		String url="https://www.facebook.com/campaign/landing.php?campaign_id=16109720371&extra_1=s%7Cc%7C580541310615%7Ce%7Cfacebook%20sign%20up%7C&placement=&creative=580541310615&keyword=facebook%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D16109720371%26adgroupid%3D134258540818%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-5066597374%26loc_physical_ms%3D9300342%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI-8KD-uSz9wIVxJ1LBR1udgRpEAAYASAAEgKSkfD_BwE";
		System.setProperty(key, value);
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
//		driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
		
		WebElement day=driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
//		Dimension t = day.getSize();
//		System.out.println(t);
		Select day1=new Select(day);
		day1.getOptions();
		day1.selectByVisibleText("20");
		
		WebElement day2=driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));

		Select month1=new Select(day2);
	     List<WebElement> get = month1.getOptions();
//	     month1.selectByIndex(1);
	     for(int i=get.size()-1;i>=0;i--) 
	     {
	    	 String months = get.get(i).getText();
	    	 System.out.println(months);
	     }
	     System.out.println("harish");
	     driver.close();
	}
}
