package com.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObject.BaseClass;
import com.PageObject.LoginPage;

public class TC_Login_01 extends BaseClass {
	
	@Test
	public void test_Login()
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
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Testcase pass");
			
		}else {
			Assert.assertTrue(false);
			logger.info("Testcase fail");
		}
		
		
		
	}

}
