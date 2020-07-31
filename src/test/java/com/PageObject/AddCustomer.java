package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomer {
	
	WebDriver bdriver;
	
	public AddCustomer(WebDriver adriver)
	{
		bdriver = adriver;
		PageFactory.initElements(adriver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'New Customer')]")
	WebElement txt_new;
	
	@FindBy(xpath="//input[@name='name']")
	WebElement txt_name;
	
	@FindBy(xpath="//tr[5]//td[2]//input[2]")
	WebElement txt_gender;
	
	@FindBy(xpath="//input[@name='dob']")
	WebElement txt_DOB;
	
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement txt_Add;
	
	@FindBy(xpath="//input[@name='city']")
	WebElement txt_City;
	
	@FindBy(xpath="//input[@name='state']")
	WebElement txt_State;
	
	@FindBy(xpath="//input[@name='pinno']")
	WebElement txt_pin;
	
	@FindBy(xpath="//input[@name='telephoneno']")
	WebElement txt_Mobile;
	
	@FindBy(xpath="//input[@name='emailid']")
	WebElement txt_email;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txt_pass;
	
	@FindBy(xpath="//input[@name='sub']")
	WebElement txt_submit;
	
	
	public void AddClk()
	{
		txt_new.click();
	}
	
	public void addName(String name)
	{
		txt_name.sendKeys(name);
	}
	
	public void addGender()
	{
		txt_gender.click();
	}
	
	public void adddob(String mm,String dd,String yy) {
		txt_DOB.sendKeys(mm);
		txt_DOB.sendKeys(dd);
		txt_DOB.sendKeys(yy);
	}
	public void addLocation(String add)
	{
		txt_Add.sendKeys(add);
	}
	
	public void addcity(String city)
	{
		txt_City.sendKeys(city);
	}
	
	public void addState(String State)
	{
		txt_State.sendKeys(State);
	}
	
	public void addPin(String Pin)
	{
		txt_pin.sendKeys(Pin);
	}
	
	public void addMobile(String number)
	{
		txt_Mobile.sendKeys(number);
	}
	
	public void addEmai(String email)
	{
		txt_email.sendKeys(email);
	}
	
	public void addPass(String passs)
	{
		txt_pass.sendKeys(passs);
	}
	
	public void addsub()
	{
		txt_submit.click();
	}
	
	
	
	
	

}
