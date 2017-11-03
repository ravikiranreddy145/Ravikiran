package com.objectRepository;

import org.openqa.selenium.By;

public class SignInPage extends SearchResultsPage {

	public By signIn_Link = By.xpath("//span[text()='Sign in/up']");
	public By email_Address = By.id("j_username_loginPage");
	public By logon_Password = By.id("j_password_loginPage");
	public By signIn_Button = By.xpath("//*[@id='login_form_page']/fieldset/div[4]/button");
	
	
	public By signup = By.xpath("//div[@class='create-account__inner']/div[@class='create-account__signin']/form/button");
	public By signupfirstname = By.id("register.firstName");
	public By signuplastname = By.id("register.lastName");
	public By signupemail = By.id("register.email");
	public By signupconfirmemail = By.id("confirmEmail");
	public By signuppassword = By.id("password");
	public By signupconfirmpassword = By.id("checkPwd");
	public By signupterms = By.id("chkAgreement");
	public By signupage = By.id("chkAge");
	public By signupcreateaccountbutton = By.xpath(".//*[@id='nviRegisterForm']/fieldset/div[9]/button");
	
	public By authorizedshoppersusername = By.id("username");
	public By authorizedshopperspassword = By.id("password");
	public By authorizedshoppersubmitbutton = By.id("login-button");

	public void signIn() {
		try {
			click(signIn_Link, "Sign In Link");
			//type(email_Address, xlsrdr.getCellData("Costco", "Email", 8), "Email Address");
			//type(logon_Password, xlsrdr.getCellData("Costco", "Password", 8), "Password");
			type(email_Address, "madhu.one@oct.com", "Email Address");
			type(logon_Password,"test@123", "Password");
			click(signIn_Button, "Sign In Button");
			// assertText(myaccount, "My Account");
			
			

		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void accountCreation() {
		try {
			//mouseHoverByJavaScript(myaccount, "My Account");
			
			long email = System.nanoTime();
			
			click(signIn_Link, "Sign In Link");
			Thread.sleep(lSleep_Medium);
			click(signup, "Sign Up for an Account");
			
			type(authorizedshoppersusername, xlsrdr.getCellData("Costco", "Email", 6), "Authorized Shoppers Username");
			type(authorizedshopperspassword, xlsrdr.getCellData("Costco", "Password", 6),
					"Authorized Shoppers Password");
			click(authorizedshoppersubmitbutton, "Authorized Shoppers Submit button");
			Thread.sleep(lSleep_High);
			
			
			type(signupfirstname, "Test", "FirstName");
			type(signuplastname,"TestConfirm","LastName");
			type(signupemail,email+"onefive@sep.com","Email Address");
			type(signupconfirmemail,email+"onefive@sep.com","Confirm Email Address");
			type(signuppassword,"123456","Password");
			type(signupconfirmpassword,"123456","Confirm Password");
			click(signupterms, "Terms and Conditions");
			click(signupage, "Age Confirmation");
			click(signupcreateaccountbutton, "Create account button");
			
			
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void signOut() {
		try {
			//mouseHoverByJavaScript(myaccount, "My Account");
			
			long email = System.nanoTime();
			
			click(signIn_Link, "Sign In Link");
			Thread.sleep(lSleep_Medium);
			click(signup, "Sign Up for an Account");
			Thread.sleep(lSleep_Low);
			type(signupfirstname, "Test", "FirstName");
			type(signuplastname,"TestConfirm","LastName");
			type(signupemail,email+"onefive@sep.com","Email Address");
			type(signupconfirmemail,email+"onefive@sep.com","Confirm Email Address");
			type(signuppassword,"123456","Password");
			type(signupconfirmpassword,"123456","Confirm Password");
			click(signupterms, "Terms and Conditions");
			click(signupage, "Age Confirmation");
			click(signupcreateaccountbutton, "Create account button");
			
			
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
