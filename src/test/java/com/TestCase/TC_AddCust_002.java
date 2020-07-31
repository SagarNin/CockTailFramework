package com.TestCase;

import org.testng.annotations.Test;

import com.PageObject.AddCustomer;
import com.PageObject.BaseClass;
import com.PageObject.LoginPage;

public class TC_AddCust_002 extends BaseClass {
	
	@Test(priority = 1)
	public void addCust() throws InterruptedException
	{
          LoginPage pg = new LoginPage(driver);
	    
		driver.get(baseURL);
		logger.info("URL is open");
		
		pg.setUserName(uname);
		logger.info("Enter username");
		
		pg.setPassword(pass);
		logger.info("Enter Password");
		
		pg.clkSubmit();
		logger.info("submit");
		
		Thread.sleep(3000);
	}
	    @Test(priority = 2)
		public void addcustomer()
		{
		AddCustomer cust = new AddCustomer(driver);
		
		cust.AddClk();
		
		logger.info("Providing cust detail");
		
		cust.addName("Sagar");
		cust.addGender();
		cust.adddob("2","4","2222");
		cust.addLocation("shivnery society,yavatmal");
		cust.addcity("mumbai");
		cust.addState("Japan");
		cust.addPin("2364");
		cust.addMobile("7709944088");
		cust.addEmai("agjksj@gmail.com");
		cust.addPass("Sag37@8df");
		cust.addsub();
	}
	
	

}
