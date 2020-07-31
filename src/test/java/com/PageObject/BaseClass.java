package com.PageObject;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.Utility.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	ReadConfig conf = new ReadConfig();
	
	public String baseURL= conf.getApplicationURL();
	public String uname = conf.getUsername();
	public String pass = conf.getPassword();
	public static WebDriver driver;
	public static  Logger logger;
	
	

	@BeforeSuite
	public void setUp()
	{
		logger = Logger.getLogger(BaseClass.class);
		PropertyConfigurator.configure("Log4j.properties");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		logger.info("Lauch the chrome Browser");
		
		driver.manage().window().maximize();
		logger.info("maximize the browser");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		logger.info("wait for finding element");
				
		
	}

	@AfterSuite
	public void tearDown()
	{
		driver.close();
	}
	
	

}
