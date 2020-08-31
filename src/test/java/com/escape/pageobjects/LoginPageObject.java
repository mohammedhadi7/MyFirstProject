package com.escape.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {
	
	public WebDriver driver;
	 
	 
	 public LoginPageObject(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		
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

	
	public void logoutButton() {
		clickLogout.click();
	}
	
	
	public void enterUser(String username) {
		txtname.sendKeys(username);
	}
	
	public void enterPwd(String password) {
		txtpassword.sendKeys(password);
	}
	
	
	public void loginButton() {
		clickLogin.click();
	}
}
