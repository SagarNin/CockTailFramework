package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ReadProperty {
	
	Properties prop;
	
	  public ReadProperty() {
		  File file = new File("./Configuration/Prop.properties");
		  
		  try {
				FileInputStream fis = new FileInputStream(file);
				prop = new Properties();
				prop.load(fis);
			} catch (Exception e) {
				System.out.println("Exception is " + e.getMessage());
			}

	  }
	  
	public String getApplicationURL() {
		
		
		String url=prop.getProperty("baseURL");
		return url;
	}

	public String getUsername() {
		
		String username=prop.getProperty("username");
		return username;
	}

	public String getPassword() {
		
		String password=prop.getProperty("password");
		return password;
	}
	
	public String firstName()
	{
		
		String name = prop.getProperty("name");
		return name;
		
	}
	
	
	
}
