package com.objectRepository;

import org.openqa.selenium.By;

public class MyAccountAddAddressFun extends SignInPage{
	
	
	public By addresslink = By.xpath("//div[@class='row accmain-wrapper']/div/div[3]/ul/li[2]/a[@href='/my-account/address-book']");
	public By addnewaddressbutton = By.xpath("//div[@class='accmain-addresses__add']/button");
	public By addressdropdownpatientselect = By.id("patientId");
	public By addressfirstname = By.id("inputFirstName");
	public By addresslastname = By.id("inputLastName");
	public By addressmonth = By.id("selectMonth");
	public By addressday = By.id("selectDay");
	public By addressyear = By.id("selectYear");
	public By addressshippingline1 = By.id("address_line1");
	public By addressshippingline2 = By.id("address_line2");
	public By addressshippingcity = By.id("address_townCity");
	public By addressshippingstate = By.id("selectRegion");
	public By addressshippingzipcode = By.id("address_postcode");
	public By addressshippingcountry = By.id("account_address_country");
	public By addressaddbutton = By.xpath("//div[@class='form-buttons']/div[@class='row']/div[2]/button[@id='load']");
	public By addressshippingcountrydiff = By.name("countryIso");
	
	
	
	public void addAddress()
	{
		try {
			click(addresslink, "Address link in MyAccount");
			Thread.sleep(lSleep_Low);
			click(addnewaddressbutton, "Address button in MyAccount");
			//Thread.sleep(lSleep_VLow);
			selectByValue(addressdropdownpatientselect, "NewPatient", "New patient selection");
			type(addressfirstname, "TestPatient", "First Name in Address Creation");
			type(addresslastname, "TestPatienttest", "Lastt Name in Address Creation");
			selectByIndex(addressmonth, 3, "Month Selection in Address Creation");
			selectByIndex(addressday, 6, "Day Selection in Address Creation");
			selectByValue(addressyear, "1986", "Year selection in Address Creation");
			type(addressshippingline1, "GREELEY COMMONS\r\n" + 
					"4759 W 29th Street\r\n",
					  "Shipping Address");
			type(addressshippingline2, "Suite C  Greeley", "Shipping Address line2");
			type(addressshippingcity, "Colorado", "City selection in shipping in Address page");
			selectByVisibleText(addressshippingstate, "Colorado", "State Selection in Shipping in Address Page");
			type(addressshippingzipcode, "80634", "Zip code in shipping in Address page");
			selectByValue(addressshippingcountrydiff, "US", "Country selection in shipping in Address page");
			click(addressaddbutton, "Click on Add button in Address page");
			
		}
		catch(Throwable e)
		{
			e.printStackTrace();
		}
	}
	

}
