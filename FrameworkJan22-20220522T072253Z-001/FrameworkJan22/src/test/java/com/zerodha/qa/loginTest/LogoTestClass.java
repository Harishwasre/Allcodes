package com.zerodha.qa.loginTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.zerodha.base.BaseClass;
import com.zerodha.login.HomePage;
import com.zerodha.login.PinPage;
import com.zerodha.userProfile.DashBoard;
import com.zerodha.utility.Utility;

public class LogoTestClass extends BaseClass 
{
	HomePage hp;
	PinPage pp;
	DashBoard db;
					//base class=Browser launch+cache clear
					//Utility class= Prametrization + Screenshot+Property file reader

	@BeforeMethod
	public void webLaunching() throws InterruptedException, EncryptedDocumentException, IOException
	{
		browserLaunch();
	}
	@Test
	public void logoVerify()	//homepage
	{
		hp.verifyLogo(Utility.booleanTestData(10, 6));
	}
//	@Test
//	public void headerTextVerify()		//homepage
//	{
//		hp.verifyHeaderText(expHeaderText);
//	}
//	

	@AfterClass
	public void browserClose() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}
}
