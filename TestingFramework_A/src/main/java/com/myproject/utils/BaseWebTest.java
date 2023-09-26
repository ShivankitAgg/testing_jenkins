package com.myproject.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseWebTest {

	public WebDriver driver;
	Properties prop;
	String browsername;
	ChromeOptions chromeOptions;
	
	@BeforeSuite
	public void initializeframework()  {

		prop = new Properties();
		FileInputStream fis = null;
		try {
			String path = System.getProperty("user.dir");
			String otherPath= path + "\\TestingFramework_A\\Propertyfile.properties";
			fis = new FileInputStream(otherPath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@BeforeMethod
	public void setUp()
	{
		browsername = prop.getProperty("browser");
		 chromeOptions = new ChromeOptions();
		 chromeOptions.addArguments("--remote-allow-origins=*");

		if (browsername.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(chromeOptions);
			driver.get(prop.getProperty("url"));		}

		else if (browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	
	  public WebDriver getDriver() {
		    return driver;
		  }
	  
	  
	@AfterSuite
	public void Closeframework()  {
		driver.quit();
	}


}
