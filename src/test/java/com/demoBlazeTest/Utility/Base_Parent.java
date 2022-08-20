package com.demoBlazeTest.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Parent {
	
	public static Properties prop;
	public static WebDriver driver;

	public Base_Parent() {
		try {
		FileInputStream fileInp = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\demoBlazeTest\\Config\\Configuration_File.properties");
		prop = new Properties();
		prop.load(fileInp);
		
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	public void browserSetup() {
		String allBrowser = prop.getProperty("Browser");
		
		if(allBrowser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\SeleniumDriver2\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(TestData.pageLoadTimeout, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestData.implicitlyWait, TimeUnit.SECONDS);
		} else if (allBrowser.equals("IE")) {
			
		}
	}
	
	public static void URLLaunch(String URL) {
		driver.get(prop.getProperty("Url"));
	}
	
	public static void URLLaunch() {
		driver.get(prop.getProperty("Url"));
	}
	
}
