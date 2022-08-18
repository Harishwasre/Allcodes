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

public class UNTestClassUserVerify extends BaseClass 
{
	HomePage hp;
	PinPage pp;
	DashBoard db;
					//base class=Browser launch+cache clear
					//Utility class= Prametrization + Screenshot+Property file reader

	@BeforeMethod
	public void loginToApp() throws InterruptedException, EncryptedDocumentException, IOException
	{
		browserLaunch();
		
		hp = new HomePage(driver);
		
		hp.setUN(Utility.propertydata("un"));	//username
		hp.setpwd(Utility.textTestData(10, 2)); //pwd
		
		hp.clickSubmitBtn();
		
		pp = new PinPage(driver);
		pp.setPin(Utility.textTestData(10, 3));	//pin -->parametrization
		
		pp.clickPinSubmitBtn();
	}
//	@Test
//	public void logoVerify()	//homepage
//	{
//		hp.verifyLogo(logoExpStatus);
//	}
//	@Test
//	public void headerTextVerify()		//homepage
//	{
//		hp.verifyHeaderText(expHeaderText);
//	}
	@Test
	public void userVerify() throws EncryptedDocumentException, InterruptedException, IOException		//dashboard
	{
		db= new DashBoard(driver);
		db.verifyUserID(Utility.textTestData(10, 1));	//username
		Utility.screenshot(driver);
		db.verifyInitials(Utility.textTestData(10, 4));
	} 
	@AfterMethod
	public void screenshotcapture(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			Utility.screenshot(driver);
		}
	}
	
	@AfterClass
	public void browserClose() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}
}
