package com.escape.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPwithDDT {
	
	public WebDriver driver;

	
public LoginPwithDDT(WebDriver rdriver) {
		
		driver=rdriver;
		PageFactory.initElements(rdriver, this);		
}	
		@FindBy(name="uid")
		@CacheLookup
		WebElement txtname;
		
		
		@FindBy(name="password")
		@CacheLookup
		WebElement txtpassword;
		
		@FindBy(name="btnLogin")
		@CacheLookup
		WebElement clickLogin;
		
		
		@FindBy(xpath="//a[text()='Log out']")
		WebElement clickLogout;
	
			
		public void user(String username) {
			txtname.sendKeys(username);
		}
		
		public void pwd(String password) {
			txtpassword.sendKeys(password);
		}
		
		
		public void loginButton() {
			clickLogin.click();
		}
		
		public void logoutButton() {
			clickLogout.click();
		}
}


	

