package com.Selenium.TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AnnotationsTest 
{
	
	@Test
	public void login()
	{
		Reporter.log("Login successfully", true);
	}
	@Test
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
	public void orderStatus()
	{
		Reporter.log("Order is successful", true);
	}
	public void browserClose()
	{
		Reporter.log("Browser close", true);
	}
	@Test
	public void browserLaunch()
	{
		Reporter.log("Browser successfully launched", true);
	}
}
