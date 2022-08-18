package com.Selenium.TestNg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationsSequence 
{
	
	@BeforeClass
	public void login()
	{
		Reporter.log("Login successfully", true);
	}
	@BeforeMethod
	public void searchProduct()
	{
		Reporter.log("Product selected", true);
	}
	@Test
	public void addToCart()
	{
		Reporter.log("Product added to cart", true);
	}
	@Test
	public void payment()
	{
		Reporter.log("Payment successful", true);
	}
	@AfterMethod
	public void orderStatus()
	{
		Reporter.log("Order is successful", true);
	}
	@AfterSuite
	public void browserClose()
	{
		Reporter.log("Browser close", true);
	}
	@BeforeSuite
	public void browserLaunch()
	{
		Reporter.log("Browser successfully launched", true);
	}
}
