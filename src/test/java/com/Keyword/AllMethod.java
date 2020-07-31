package com.Keyword;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Utility.ReadProperty;

public class AllMethod {

	static WebDriver driver;
	static WebElement element;
	

	public static void enterText(String locatorType, String locatorname, String locatorvalue)
	{
		driver.findElement(By.xpath(locatorname)).sendKeys(locatorvalue);
	}

	public static void clickAll(String locatorType, String locatorValue) {

		switch (locatorType) {
		case "xpath":
			driver.findElement(By.xpath(locatorValue)).click();
			System.out.println("Text entered successfully");
			break;

		case "id":
		   driver.findElement(By.id(locatorValue)).click();
			System.out.println("Text entered successfully");
			break;
		}
		
	}
	
	public static void wait( String locatortype, String locatorvalue, String parameter)
	{
		switch (locatortype) {
	
		case "id":
			WebDriverWait wait = new WebDriverWait(driver, 100);
			element= wait.until(ExpectedConditions.elementToBeClickable(By.id(locatorvalue)));
			element.sendKeys(parameter);
			break;

		default:
			break;
		}
		
		
	}
	
	public static void SCroll(int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor)driver;

		js.executeScript("window.scrollBy(" + x + "," + y + ")");
}
	
	public static void dropByyIndex(String locatorvalue, int i) {
		Select sel = new Select(driver.findElement(By.xpath(locatorvalue)));
		sel.selectByIndex(i);
		System.out.println("Select from dropdown:" + i);
}
}