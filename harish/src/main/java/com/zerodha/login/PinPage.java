package com.zerodha.login;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPage 		//pom class 2
{
	@FindBy (xpath="//input[@id='pin']") private WebElement pin;
	@FindBy (xpath="//button[@type='submit']") private WebElement submitBtn;
	
	public PinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setPin(String pinValue)
	{
		pin.sendKeys(pinValue);
	}
	public void clickPinSubmitBtn() throws InterruptedException
	{
		submitBtn.click();
		Thread.sleep(2000);
	}
}
