package com.escape.testcases;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.escape.pageobjects.LoginPageObject;

public class LoginTest extends BaseClass {
	

	
	
	@Test
	public void loginTestCase() throws InterruptedException, IOException {
		
		
		LoginPageObject lpp=new LoginPageObject(driver);
		lpp.enterUser(username);
		logger.info("username Entered");
		lpp.enterPwd(password);
		logger.info("password Entered");
		lpp.loginButton();
		Thread.sleep(2000);
		
		if(driver.getCurrentUrl().equals("http://www.demo.guru99.com/V4/manager/Managerhomepage.php")) {
			logger.info("test Case Passed");
			Assert.assertTrue(true);
			
		}else {
			logger.info("Test case Failed");
			captureScreen("LoginTest",driver);
			Assert.assertTrue(false);
			
		}
		
	}



	
		
	}


