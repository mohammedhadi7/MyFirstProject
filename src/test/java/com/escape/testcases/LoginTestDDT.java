package com.escape.testcases;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.openqa.selenium.Alert;
import org.testng.Assert;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.escape.pageobjects.LoginPageObject;

import com.escape.utilities.ExcelLibrary;

public class LoginTestDDT extends BaseClass {

	
	ExcelLibrary lib=new ExcelLibrary();


	
	@Test(dataProvider="TestFeed")
	public void ddtTest(String un,String pw) throws InterruptedException {
			LoginPageObject lpp=new LoginPageObject(driver);
			lpp.enterUser(un);
			lpp.enterPwd(pw);
			lpp.loginButton();
			Thread.sleep(2000);

			if(isAlertPresent()==true) {

				Alert alert=driver.switchTo().alert();
				alert.accept();
				driver.switchTo().defaultContent();
				Assert.assertTrue(false);
				logger.warn("Login Failed");

			} else {
				Assert.assertTrue(true);
				logger.info("Login passed");
				lpp.logoutButton();
				driver.switchTo().alert().accept();
				driver.switchTo().defaultContent();	
			}


		}

	

	
	
	
	 @DataProvider(name="TestFeed")
	    public Object[][] getDataFromDataprovider(){
	    return new Object[][] 
	    	{	
	    		{lib.excelLib("Sheet2", 0, 0), lib.excelLib("Sheet2", 0, 1) },
	            {lib.excelLib("Sheet2", 1, 0), lib.excelLib("Sheet2", 1, 1) },
	            {lib.excelLib("Sheet2", 2, 0), lib.excelLib("Sheet2",2, 1) },
	            {lib.excelLib("Sheet2", 3, 0), lib.excelLib("Sheet2", 3, 1) },
	            {lib.excelLib("Sheet2", 4, 0), lib.excelLib("Sheet2", 4, 1) },
	            {lib.excelLib("Sheet2", 5, 0), lib.excelLib("Sheet2", 5, 1) },
	            {lib.excelLib("Sheet2", 6, 0), lib.excelLib("Sheet2", 6, 1) },
	            
	           
	        };

	    }
	
	
	
	
}


	