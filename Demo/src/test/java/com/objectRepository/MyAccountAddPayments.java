package com.objectRepository;

import org.openqa.selenium.By;

public class MyAccountAddPayments extends MyAccountAddAddressFun{
	
	//public By paymentslink = By.xpath("//li[@class='yCmsComponent active']/a");
	public By paymentslink = By.xpath("//div[@class='row accmain-wrapper']/div/div[3]/ul/li[3]/a");
	public By paymentsaddbutton = By.xpath("//button[contains(text(), 'Add New Payment Method')]");
	public By paymentsnameoncard = By.xpath("//input[@id='nameOnCard']");
	public By paymentscardnumber = By.id("cardNumber");
	public By paymentsexpirationmonth = By.id("expiryMonth");
	public By paymentsexpirationyear = By.id("expiryYear");
	public By paymentssecuritycode = By.id("issueNumber");
	public By paymentsbillingfirstname = By.name("billingAddress.firstName");
	public By paymentsbillinglastname = By.name("billingAddress.lastName");
	public By paymentsbillingcountry = By.id("billingAddress_countryIso");
	public By paymentsbillingaddress1 = By.id("billingAddress_line1");
	public By paymentsbillingaddress2 = By.id("billingAddress_line2");
	public By paymentsbillingcity = By.id("billingAddress_townCity");
	public By paymentsbillingstate = By.id("billingAddress_regionIso");
	public By paymentsbillingzipcode = By.id("billingAddress_postcode");
	public By paymentsbillingphonenumber = By.id("billingAddress_phone");
	public By paymentsaddbuttonlast = By.xpath("//div[@class='form-buttons']/div[@class='row']/div[2]/button[@id='load']");
	
	public void paymentsAddMethod()
	{
		try {
			
			click(paymentslink, "Payments link in MyAccount");
			click(paymentsaddbutton, "Payments add button in MyAccount");
			type(paymentsnameoncard, "TestCard", "Name on the card");
			type(paymentscardnumber, "4111111111111111", "Card Number");
			selectByValue(paymentsexpirationmonth, "09", "Month Selection");
			selectByValue(paymentsexpirationyear, "2024", "Year Selection");
			type(paymentssecuritycode, "183", "Security code");
			type(paymentsbillingfirstname, "TestFirst", "First name in billing section");
			type(paymentsbillinglastname, "Testlast", "Last name in billing section");
			selectByValue(paymentsbillingcountry, "US", "Country Selection");
			type(paymentsbillingaddress1, "GREELEY COMMONS\r\n" + 
					"4759 W 29th Street\r\n", "Address1 in billing section");
			type(paymentsbillingaddress2, "Suite C\r\n" + 
					"Greeley, Colorado", "Address2 in billing section");
			type(paymentsbillingcity, "Colorado", "Enter City in billing section");
			selectByValue(paymentsbillingstate, "US-CO", "Selection of State in billing section");
			type(paymentsbillingzipcode, "80634", "Enter Zipcode in billing section");
			type(paymentsbillingphonenumber, "7896541236", "Enter Phone number in billing section");
			click(paymentsaddbuttonlast, "Add button");
			
			
			
			
			
			
		}
		catch(Throwable e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	

}
