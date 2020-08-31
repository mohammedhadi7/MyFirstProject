package com.escape.testcases;

import java.io.File;
import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import com.escape.utilities.InputFromConfig;


public class BaseClass{
	
		
	
	InputFromConfig ip=new InputFromConfig();
	
	public String baseurl=ip.getBaseUrl();
	public String username=ip.username();
	public String password=ip.password();
	
	WebDriver driver;
	public static Logger logger;

	
	@BeforeClass
	public WebDriver openUrl() {
		
		logger=Logger.getLogger("Islamic Banking Domain");
		PropertyConfigurator.configure(System.getProperty("user.dir")+"//log4j.properties");
		System.setProperty("webdriver.chrome.driver", ip.chromepath());
		driver=new ChromeDriver();
		
		
		
		driver.manage().window().maximize();
		driver.get(baseurl);
		logger.info("Url is Launched");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);	
		return driver;
		
		
	}
	
	
	@AfterClass
	public void tearDown() {
		
		driver.close();
		logger.info("Browswer is closed");
		driver=null;
		
	
		
	}
	
	
	
	public boolean isAlertPresent() {
		
		try 
		{
			driver.switchTo().alert();
			return true;
		}	
		catch(NoAlertPresentException e){
				return false;
			}
				
			}
	
public String captureScreen(String testname, WebDriver driver) throws IOException {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	String destination =System.getProperty("user.dir")+"//Reports//"+testname+".png";
	File finalDestination=new File(destination);
	FileUtils.copyFile(source, finalDestination);
	return destination;
	
		
	}


public String randomString() {
	String randomGenerate=RandomStringUtils.randomAlphabetic(8);
	return (randomGenerate);
}

        
    }
	

			
		
			
		
	
	


