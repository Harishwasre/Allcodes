package com.java_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Finding_xpath_byattribute {
static
	 public void  main(String args[])
	{
		String key ="webdriver.chrome.driver";
		String value="E:\\selenium\\chromedriver_win32\\chromedriver.exe";
		String url="https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&";
		
		System.setProperty(key,value);
		WebDriver d =new ChromeDriver();
		d.get(url);
		d.manage().window().maximize();
		d.findElement(By.xpath("//a[text()='Conditions of Use']")).click();
//		d.findElement(By.id("ap_email")).sendKeys("harish");
//		d.findElement(By.xpath("//input[@type =\"email\"]")).sendKeys("harishwashre@gmail.com");
//		d.findElement(By.xpath("//input[@type =\"submit\"]")).click();
//		d.findElement(By.xpath("//input[@type =\"password\"]")).sendKeys("harish@123");

//		Dimension f=new Dimension(200,300);
//		d.manage().window().setSize(f);
        Point p=new Point(100,200);
        d.manage().window().setPosition(p);
	}

}
