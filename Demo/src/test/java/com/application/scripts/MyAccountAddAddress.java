package com.application.scripts;

import org.testng.annotations.Test;

import com.objectRepository.MyAccountAddAddressFun;

public class MyAccountAddAddress extends MyAccountAddAddressFun{
	 @Test
	 public void addAddressMyAccount() throws Exception
	 {
		 signIn();
		 Thread.sleep(lSleep_VLow);
		 addAddress();
		 
	 }

}
