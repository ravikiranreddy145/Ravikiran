package com.objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ErrorHandling extends SearchResultsPage {

	public By emailerrormessage = By.id("j_username_loginPage-error");
	public By passworderrormessage = By.id("j_password_loginPage-error");
	public By signinbutton = By.xpath("//button[@class='btn btn-1 btn-signin']");
	public By signinup = By.xpath("//span[text()='Sign in/up']");

	@Test
	public void loginErrorHandle() {

		try {

			click(signinup, "Singin/up");
			click(signinbutton, "Sign in button");
			WebElement web = driver.findElement(emailerrormessage);
			String emailerror = web.getText();
			String emailerrorcheck = "Email field is required";
			String passworderrorcheck = "Password field is required";

			assertTextPresent(emailerrorcheck);
			assertTextPresent(passworderrorcheck);
			Thread.sleep(lSleep_High);

		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
