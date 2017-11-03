package com.application.scripts;

import org.testng.annotations.Test;

import com.objectRepository.AddressBook;

public class UpdateAddressBook extends AddressBook{
  
	@Test
    public void updateAddressBook() throws Throwable {
		//signIn();
		//clickOnAddressBookLink();
		clickOnAddanAddressButton();
		addAddress();
		deleteAddress();
		//signOut(); 
	}
	
}
