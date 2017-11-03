package com.application.scripts;

import org.testng.annotations.Test;

import com.Pages.MyAccountPage;
import com.objectRepository.SignInPage;

public class VerifyAddNewPatient extends SignInPage{
	
	MyAccountPage myaccount = new MyAccountPage();
  @Test
  public void SignIn() throws Throwable{
	  
	  signIn();
	  Thread.sleep(lSleep_Low);
	  myaccount.AddPatient();
	  Thread.sleep(lSleep_Medium);
	  //myaccount.CancelInAddPatientPopUp();
	  Thread.sleep(lSleep_Medium);
	  myaccount.SelectPatient("Ftest","PatientName");
	  
  }
}
