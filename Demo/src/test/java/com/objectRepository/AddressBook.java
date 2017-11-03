package com.objectRepository;

import org.openqa.selenium.By;

import com.accelerators.ActionEngine;

public class AddressBook extends ActionEngine {

	//By addressBookLink = By.xpath("//*[@id='header_renewMembership']/li[2]/a");
	
	By addAnAddressButton	= By.xpath("//a[@href='/my-account/address-book']");
	By selectAddNewAddress = By.xpath("//div[@class='accmain-addresses__add']/button[@class='btn btn-1 modal-delay']");
	By firstName = By.id("inputFirstName");
	By lastName = By.id("inputLastName");
	By addressline1 = By.id("_address_line1");
	By addressLine2 = By.id("address_line2");
	By City = By.id("address_townCity");
	By region = By.id("selectRegion");
	By zipField = By.id("address_postcode");
	By country = By.id("account_address_country");
	By add_address = By.id("load");
	By addresscreated = By.id("//div[@class='notification-box success']/div[@class='title']");
	
	
	
	
	
	
	
	public void clickOnAddanAddressButton() throws Throwable
	{
		click(addAnAddressButton,"Add an address button");
		Thread.sleep(lSleep_Medium);
	}
	
	


	public void addAddress() throws Throwable
	{
	
		click(selectAddNewAddress, "Add New Address");
		
		type(firstName, "ftest", "First Name");
		type(lastName, "ltest", "Last Name");
		type(addressline1, "4010 moorpark", "Address Line1");
		type(City, "sanjose", "City");
		selectByValue(region, "California","State");
		type(zipField, "sanjose", "City");
		
		
	}
	
	public void deleteAddress() throws Throwable
	{
		//click(deleteAddressLink,"Delete Address");
		//click(confirmDeleteAddress,"Confirm Delete Address");
	}
	
}
