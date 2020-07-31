package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPage {

	
	WebDriver pdriver;
	
	public LoginPage(WebDriver qdriver )
	{
		pdriver = qdriver;
		PageFactory.initElements(qdriver, this);
	}
	
	@FindBy (xpath="//input[@name='uid']")
	WebElement  txt_username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txt_password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement txt_clk;
	
	public void setUserName(String uname)
	{
		txt_username.sendKeys(uname);
		
	}
	
	public void setPassword(String pass)
	{
		txt_password.sendKeys(pass);
	}
	
	public void clkSubmit()
	{
		txt_clk.click();
	}
	
}
