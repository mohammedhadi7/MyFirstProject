package com.escape.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class Reporting   implements ITestListener
{
	

	ExtentReports extent=ListReading.extentReporterGenerator();
	ExtentTest test;
	public ThreadLocal<ExtentTest> extentTest=new ThreadLocal<ExtentTest>();
	
	

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}


	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test=extent.createTest(result.getMethod().getMethodName());
		extentTest.set(test);

	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		extentTest.get().fail(result.getThrowable());
		
	
	try {
		
		
		extentTest.get().addScreenCaptureFromPath(System.getProperty("user.dir")+"\\Reports\\"+result.getName()+".png");
	}
	catch(IOException e) {
		
	}
	
	}



	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();


	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	
		
			
		}
}


