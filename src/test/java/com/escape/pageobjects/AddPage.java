package com.escape.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddPage {
	
	public WebDriver driver;
	
	public AddPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);

}
	
	@FindBy (how= How.XPATH, using="//a[text()='New Customer']")
	WebElement clickAddCustomer;
	
	
	@FindBy(how= How.NAME, using="name")
	WebElement addName;
	
	@FindBy(how=How.XPATH, using="//input[@name='rad1' and @value='m']")
	WebElement addGender;
	
	@FindBy(how=How.NAME, using="dob")
	WebElement addDOB;
	
	@FindBy(how=How.NAME, using="addr")
	WebElement addAddress;
	
	@FindBy(how=How.NAME, using="city")
	WebElement addCity;
	
	@FindBy(how=How.NAME, using="state")
	WebElement addState;
	
	
	@FindBy(how=How.NAME, using="pinno")
	WebElement addPin;
	
	
	@FindBy(how=How.NAME,using="telephoneno")
	WebElement addTelephone;
	
	@FindBy(how=How.NAME, using="emailid")
	WebElement addEmail;
	
	
	@FindBy(how=How.NAME, using="password")
	WebElement addPassword;
	
	
	@FindBy(how=How.NAME, using="sub")
	WebElement clickSubmit;
	
	
	
	public void addCustomer(String name) {
		addName.sendKeys(name);		
	}
	
	public void addAddress(String address) {
	addAddress.sendKeys(address);
	}
	
	public void addCity(String city) {
		addCity.sendKeys(city);
		
	}
	
	public void addState(String state) {
		addState.sendKeys(state);
	}
	
	public void addPin(String Pin) {
	addPin.sendKeys(String.valueOf(Pin));
	}
	
	public void addMobile(String Nmobile) {
		addTelephone.sendKeys(Nmobile);
		
	}
	
	public void addEmail(String Email) {
		addEmail.sendKeys(Email);
	}
	
	public void addPassword(String password) {
		addPassword.sendKeys(password);
	}
	
	
	public void customClick() {
		clickAddCustomer.click();
		
	}	
			
		public void CustomSubmit() {
		
		clickSubmit.click();
	}
	
	public void customDOB(String mm, String dd, String yyyy) {
		addDOB.sendKeys(mm);
		addDOB.sendKeys(dd);
		addDOB.sendKeys(yyyy);
	}
	
	public void addGender(String gender) {
	
	addGender.sendKeys(gender);
	
		
	}
}