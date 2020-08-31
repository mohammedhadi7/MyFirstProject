package com.escape.testcases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.escape.pageobjects.AddPage;
import com.escape.pageobjects.LoginPageObject;

public class AddCustomer extends BaseClass {
	
	@Test
	public void addCustomer002() throws InterruptedException, IOException {
		
	LoginPageObject op=new LoginPageObject(driver);
	op.enterUser(username);
	op.enterPwd(password);
	op.loginButton();
	AddPage ad=new AddPage(driver);
	ad.customClick();
	ad.addCustomer("Abdull");
	ad.addGender("male");
	ad.customDOB("09","27","1970");
	ad.addAddress("2865 homesteadd rd apt 23");
	ad.addCity("Fremontt");
	ad.addState("Califorrnia");
	ad.addPin("950513");
	ad.addMobile("6015129505");
	String emailId=randomString()+" @gmail.com";
	ad.addEmail(emailId);
	ad.addPassword("yourmppoworld$");
	ad.CustomSubmit();
	
	Thread.sleep(3000);
	
	Boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
	
	
	if(res==true) {
		Assert.assertTrue(true);
		logger.info("TestCase passed");
	}else {
		captureScreen("AddCustomerTest",driver);
		logger.info("Test Case Failed");
		Assert.assertTrue(false);
		
	}
	
	
	
	
	
	
	
		
	}
	
	
	

}
