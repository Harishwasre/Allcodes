package com.zerodha.userProfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DashBoard 		//pom class 3
{
	@FindBy (xpath="//span[@class='user-id']") private WebElement userID;
	@FindBy (xpath="//div[@class='avatar']/span") private WebElement initials;
	
	public DashBoard(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void verifyUserID(String username)
	{
		String actUN =userID.getText();
		Assert.assertEquals(actUN, username," Expected and actual user name are different");
	}
	public void verifyInitials(String expInitials)
	{
		System.out.println(expInitials);
		String actInitials = initials.getText();
		Assert.assertEquals(actInitials, "PM","Actual & expected UN are different");	
	}

	

}
