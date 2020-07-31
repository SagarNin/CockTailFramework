package com.Keyword;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.PageObject.AddCustomer;
import com.PageObject.BaseClass;
import com.Utility.ReadConfig;
import com.Utility.ReadProperty;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calling extends AllMethod {
	
	   
	
	ReadProperty por = new ReadProperty();
	   
	public static  Logger logger;
	 
	@Test(priority = 1)
	public void setup() throws InterruptedException
	{
		logger = Logger.getLogger(Calling.class);
		PropertyConfigurator.configure("Log4j.properties");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.get(baseURL);
		driver.get(por.getApplicationURL());
		
		driver.manage().window().maximize();
		logger.info("Maximize browser");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		logger.info("Timeout");
		
		AllMethod.enterText("xpath", "//input[@name='uid']", por.getUsername());
		logger.info("enter username");

		AllMethod.enterText("xpath", "//input[@name='password']", por.getPassword());
		logger.info("enter pass");

		AllMethod.clickAll("xpath", "//input[@type='submit']");
		logger.info("clk on login");

		Thread.sleep(3000);
	}
	
	@Test(priority = 2)
	public void addCustomer() throws InterruptedException
	{
		AllMethod.clickAll("xpath", "//a[contains(text(),'New Customer')]");
		AllMethod.enterText("xpath", "//input[@name='name']", por.firstName());
		Thread.sleep(3000);
		
	}
	     @Test(enabled = false)
		public void test() throws InterruptedException
		{
			
		AllMethod.enterText("xpath", "//input[@name='name']",por.firstName());
		Thread.sleep(3000);
		AllMethod.clickAll("xpath", "//tr[5]//td[2]//input[2]");
		Thread.sleep(3000);
		AllMethod.enterText("xpath", "//input[@name='dob']", "22/33/1282");
		Thread.sleep(3000);
		AllMethod.enterText("xpath", "//textarea[@name='addr']", "Ram Nagaer");
		Thread.sleep(3000);
		
		AllMethod.enterText("xpath", "//input[@name='city']", "yavatamal");
		Thread.sleep(3000);
		AllMethod.enterText("xpath", "//input[@name='state']", "Maharastra");
		Thread.sleep(3000);
		AllMethod.enterText("xpath", "//input[@name='pinno']", "8657888");
		Thread.sleep(3000);
		AllMethod.enterText("xpath", "//input[@name='telephoneno']", "7837236324");
		Thread.sleep(3000);
		AllMethod.enterText("xpath", "//input[@name='emailid']", "RamNagaer@gmail.com");
		Thread.sleep(3000);
		AllMethod.enterText("xpath", "//input[@name='password']", "Ram@1666Nagaer");
		Thread.sleep(3000);
		AllMethod.clickAll("xpath", "//input[@name='sub']");
		
		
		
	}
}
