package com.objectRepository;

import org.openqa.selenium.By;

import com.accelerators.ActionEngine;
import com.utilities.Xls_Reader;

public class RegistrationPage extends ActionEngine {

	public By email_Address = By.id("register_email1");
	public By logon_Password = By.id("register_logonPassword");
	public By logon_PasswordVerify = By.id("register_logonPasswordVerify");
	public By memebership_Number = By.id("register_userField2");
	public By register_Button	 = By.xpath("//button/span/span[contains(text(),'Register')]");
	public By register_Link = By.id("header_sign_in");
	public By email_ValidationMessage = By.id("register_email1_validation");
	public By logonPassword_ValidationMessage = By.id("register_logonPassword_validation");
	public By logonPasswordVerify_ValidationMessage = By.id("register_logonPasswordVerify_validation");

	public void clickOnRegisterLink() throws Throwable
	{
			click(register_Link, "Register Link");
	}
	
	public void clickOnRegister() throws Throwable
	{
			click(register_Button,"Register Button");
	}

	public void verifyValidationMessages() throws Throwable
	{
			
			assertText(email_ValidationMessage, "Please enter your email address.");
			assertText(logonPassword_ValidationMessage, "This field is required");
			assertText(logonPasswordVerify_ValidationMessage, "Confirm Password");
	}

	public void verifyPasswordErrorMessage() throws Throwable
	{
			
			type(email_Address,xlsrdr.getCellData("Costco", "Email", 2),"Email Address");
			type(logon_Password,xlsrdr.getCellData("Costco", "Password", 2),"Password");
			type(logon_PasswordVerify,xlsrdr.getCellData("Costco", "LogonPassword", 2),"Password");
			click(register_Button,"Register Button");
			assertText(logonPasswordVerify_ValidationMessage, xlsrdr.getCellData("Costco", "LogonPwdValidationMessage", 2));		
	}
}
