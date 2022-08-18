package com.zerodha.login;





//pom= page object module 
//1 webpage = 1 pom class



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage 		//pom class 1
{
	@FindBy (xpath="//img[@alt='Kite']") private WebElement logo;
	@FindBy (xpath="//h2[contains(text(),'Login')]") private WebElement header;
	@FindBy (xpath="//*[@id='userid']") private WebElement userid;
	@FindBy (xpath="//*[@id='password']") private WebElement password;
	@FindBy (xpath="//button[@type='submit']") private WebElement submitBtn;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void verifyLogo(boolean logoExpStatus)		//exp-->excel & act-->Browser
	{
		boolean logoActStatus= logo.isDisplayed();
		
		Assert.assertEquals(logoActStatus, logoExpStatus, "Logo image is not displayed");
	}
	public void verifyHeaderText(String expHeaderText)
	{
		String actHeaderText = header.getText();
		Assert.assertEquals(actHeaderText, expHeaderText,"Header Text is different from expected ");
	}
	public void setUN(String username)
	{
		userid.sendKeys(username);
	}
	public void setpwd(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void clickSubmitBtn() throws InterruptedException
	{
		submitBtn.click();
		Thread.sleep(2000);
	}

}
