package com.application.scripts;

import org.testng.annotations.Test;

import com.Pages.Myacc_appointment;
import com.Pages.Myaccount2;
import com.objectRepository.SignInPage;

public class OrderAndAppointment extends SignInPage{
	
	
	Myacc_appointment Myapp= new Myacc_appointment();
  @Test
  public void SignIn() throws Throwable{
	  
	  signIn();
	  Myapp.Myaccscheduling();
	  
	  
  }
}
