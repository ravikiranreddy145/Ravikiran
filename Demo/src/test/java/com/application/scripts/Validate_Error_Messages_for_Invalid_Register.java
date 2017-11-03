package com.application.scripts;

import org.testng.annotations.Test;

import com.objectRepository.RegistrationPage;

public class Validate_Error_Messages_for_Invalid_Register extends RegistrationPage{
  
 @Test
  public void validate_Error_Messages_for_Invalid_Register() throws Throwable {
	  clickOnRegisterLink();
	  verifyPasswordErrorMessage();
  }
}
