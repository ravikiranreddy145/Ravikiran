package com.application.scripts;

import org.testng.annotations.Test;

import com.objectRepository.MyAccountAddAddressFun;
import com.objectRepository.MyAccountAddPayments;

public class MyAccountAddPayment extends MyAccountAddPayments {
	 @Test
	 public void addPaymentMyAccount() throws Exception
	 {
		 signIn();
		 Thread.sleep(lSleep_VLow);
		 paymentsAddMethod();
		 
	 }

}
