package com.objectRepository;

import org.openqa.selenium.By;

public class ContactLensesMO extends SearchResultsPage {

	public By contactlenseslink = By
			.xpath("//div[@class='col-xs-12 col-md-8 main-navigation']/ul/li[2]/a/span[@class='v-center']");
	public By BrandsSelection = By.xpath(
			"//div[@class='col-xs-12 col-md-8 main-navigation']/ul/li[2]/div/div[@class='container']/div[@class='row']/div[1]/ul/li[1]/a");
	public By ProductSelection = By.xpath("//*[@id='productGridListing']/div/div[1]/div[2]/a");

	public By RtQtySelection = By.id("inputQtyRightNew");
	public By LtQtySelection = By.id("inputQtyLeftNew");
	public By AddToCartSelection = By.xpath("//*[@id='nviContactDetailsForm']/div[2]/div/div[3]/button");
	public By Checkoutbutton = By.xpath(
			"//div[@class='shopping-action shopping-action--bottom']/div[@class='row']/div/a[@class='btn btn-1 btn-checkout']");

	public By GuestCheckoutNowSelection = By
			.xpath("//div[@class='checkout-guest hidden-xs']/descendant::button[contains(text(),'Guest Checkout')]");
	public By FirstNameSelection = By.id("firstname");

	public By LastNameSelection = By.id("lastName");
	public By EmailSelection = By.id("email3");
	public By MonthsSelection = By.id("months");
	public By daysSelection = By.id("days");
	public By YearsSelection = By.id("years");
	public By StateDrpSelection = By.id("stateDropdown");

	public By ContinueSelection = By.xpath("//*[@id='patientPrescriptionFormId']/fieldset/div[6]/div/input");
	public By authorizedshoppersusername = By.id("username");
	public By authorizedshopperspassword = By.id("password");
	public By authorizedshoppersubmitbutton = By.id("login-button");
	//public By Acuvueimageclick = By.xpath("//a[@href='/shop/contact-lenses/acuvue']/img");
	public By Acuvueimageclick = By.xpath("//a[@href");
	public By PhoneNumber = By.id("address_phone");
	public By Country = By.id("address_country");
	public By Line1 = By.id("address_line1");
	public By TownOrCity = By.id("address_townCity");
	public By regionSelection = By.id("selectRegion");
	public By PostCode = By.id("address_postcode");
	public By ContinueToBillingButton = By.xpath("//*[@id='row checkout-step-continue']/div/button");
	public By AddressPopUp = By
			.xpath("//*[@id='popup_suggested_delivery_addresses_form']/div/div/div/div[2]/div/div[2]/button");
	public By NameOnCard = By.id("nameOnCard");
	public By CardNumber = By.id("cardNumber");
	public By ExpiryMonth = By.id("expiryMonth");
	public By ExpiryYear = By.id("expiryYear");
	public By CVVNumber = By.id("issueNumber");
	public By ContinueTorivewOrder = By.id("load");

	/*
	 * public void contactsLensSelection() {
	 * 
	 * try { //mouseover(By.xpath(".//span[text()='Contact Lenses']"),
	 * "contactlenseslink"); click(contactlenseslink, "contactlenseslink");
	 * Thread.sleep(lSleep_Medium); click(BrandsSelection, "Brand Link");
	 * click(ProductSelection, "Product selection");
	 * selectBySendkeys(RtQtySelection, "1", "right qty");
	 * selectBySendkeys(LtQtySelection, "1", "left qty");
	 * 
	 * click(AddToCartSelection, "Add to cart button");
	 * click(GuestCheckoutNowSelection, "guest check out button");
	 * 
	 * type(FirstNameSelection, "madhu", "first name"); type(LastNameSelection,
	 * "sann", "last name"); type(EmailSelection, "madhu419@gmail.com", "email");
	 * selectBySendkeys(MonthsSelection, "May", "Month");
	 * selectBySendkeys(daysSelection, "1", "day"); selectBySendkeys(YearsSelection,
	 * "1990", "year"); click(ContinueSelection, "Continue button");
	 * 
	 * } catch (Throwable e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * 
	 * }
	 */

	public void contactsLensSelection() {

		try {

			click(contactlenseslink, "contactlenseslink");
			Thread.sleep(lSleep_Medium);
			//click(BrandsSelection, "Brand Link");
			type(authorizedshoppersusername, xlsrdr.getCellData("Costco", "Email", 6), "Authorized Shoppers Username");
			type(authorizedshopperspassword, xlsrdr.getCellData("Costco", "Password", 6),
					"Authorized Shoppers Password");
			click(authorizedshoppersubmitbutton, "Authorized Shoppers Submit button");
			Thread.sleep(lSleep_High);
			click(Acuvueimageclick, "Acuvue product selection");
			Thread.sleep(lSleep_Low);
			click(ProductSelection, "Product selection");
			selectBySendkeys(RtQtySelection, "1", "right qty");
			selectBySendkeys(LtQtySelection, "1", "left qty");

			click(AddToCartSelection, "Add to cart button");
			click(Checkoutbutton, " Checkout Button");
			click(GuestCheckoutNowSelection, "guest check out button");
			type(FirstNameSelection, "madhu", "first name");
			type(LastNameSelection, "sann", "last name");
			type(EmailSelection, "madhu419@gmail.com", "email");
			selectBySendkeys(MonthsSelection, "May", "Month");
			selectBySendkeys(daysSelection, "1", "day");
			selectBySendkeys(YearsSelection, "1990", "year");
			selectBySendkeys(StateDrpSelection, "Alaska (3 locations)", "dropdown Alaska");

			click(ContinueSelection, "Continue button");

			Thread.sleep(lSleep_High);
			type(PhoneNumber, "1234567898", "Phone Number");
			selectBySendkeys(Country, "United States", "Country");
			type(Line1, "4010 moorpark", "Address line 1");
			type(TownOrCity, "sanjose", "Town or city");
			selectBySendkeys(regionSelection, "California", "region");
			type(PostCode, "95117", "Postal code");
			click(ContinueToBillingButton, " Continue to Button");
			click(AddressPopUp, " Address popup continue Button");
			type(NameOnCard, "madhu", "Name on card");
			type(CardNumber, "4111111111111111", "card number");
			selectBySendkeys(ExpiryMonth, "02", "Month");
			selectBySendkeys(ExpiryYear, "2021", "Year");
			type(CVVNumber, "123", "CVV Number");
			Thread.sleep(lSleep_High);
			click(ContinueTorivewOrder, " Continue to review order");

		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
