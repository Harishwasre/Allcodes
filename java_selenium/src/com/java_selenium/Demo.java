package com.java_selenium;


import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.ObjectArrays;

public class Demo {

	public static void main(String[] args) {
		String key ="webdriver.chrome.driver";
		String value="E:\\selenium\\chromedriver_win32\\chromedriver.exe";
		
		System.setProperty(key ,value);
//        open browser
		WebDriver driver= new ChromeDriver();
//		maximize the browser
		driver.manage().window().maximize();
		driver.manage().window().minimize();
//		String url= "https://www.flipkart.com/";
		driver.get("https://www.flipkart.com/");
//		driver.close();
//		driver.quit();
		ArrayList arr = new ArrayList();
		HashSet set =new HashSet();
		LinkedList ll =new LinkedList();
	}

}

