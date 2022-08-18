package com.Selenium.TestNg;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGKeywords 
{
	@Test (invocationCount=2)
	public void TC1()
	{
		Reporter.log("TC1 is successfully run", true);
	}
	@Test (priority=5,invocationCount=2)
	public void TC2()
	{
		Reporter.log("TC2 is successfully run", true);
	}
	@Test (priority=2)
	public void TC3()
	{
		Reporter.log("TC3 is successfully run", true);
	}
	@Test(priority=-1000)
	public void TC4()
	{
		Reporter.log("TC4 is successfully run", true);
	}
	@Test (enabled=false)
	public void TC5()
	{
		Reporter.log("TC5 is successfully run", true);
	}
	@Test (timeOut=3000)
	public void TC6() throws InterruptedException
	{
		//Thread.sleep(2000);
		Reporter.log("TC6 is successfully run", true);
	}
	@Test (timeOut=1000)
	public void login() throws InterruptedException
	{	
		Thread.sleep(2000);
		Reporter.log("Login is successfully run", true);
	}
	@Test (dependsOnMethods= {"login","TC1","TC2"})
	public void logout()
	{
		Reporter.log("Logout is successfully run", true);
	}
	
}
