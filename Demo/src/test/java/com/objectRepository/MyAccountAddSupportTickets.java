package com.objectRepository;

import org.openqa.selenium.By;

public class MyAccountAddSupportTickets extends MyAccountAddPayments{
	
	public By supportlink = By.xpath("//div[@class='row accmain-wrapper']/div/div[3]/ul/li[5]/a");
	public By supportcreatenewticket = By.id("add-support-ticket-btn");
	public By supportyouhavenosupporttickets = By.xpath("//div[@class='account-section-content col-md-6 col-md-push-3 content-empty' and  contains(text(),'You have no support tickets')]");
	public By supportsubject = By.id("createTicket-subject");
	public By supportmessage = By.id("createTicket-message");
	public By supportassociatedto = By.id("associatedTo");
	public By supportticketcategory = By.id("ticketCategory");
	public By supportsubmitbutton = By.id("addTicket");
	
	
	public void supporTicketsAddMethod()
	{
		
		try {
			click(supportlink, "Support Link");
			
			if(isElementPresent(supportcreatenewticket, "checking whehter create new ticket button is present"))
			{
			click(supportcreatenewticket, "Create new ticket");
			}
			else {
				System.out.println("Element is not present");
				failureReport("Create new ticket button", "Create new ticket button is not present");
			}
			
			type(supportsubject, "Testing", "Support ticket subject");
			type(supportmessage, "TestingMessage", "Support ticket Messsage");
			selectByValue(supportticketcategory, "ENQUIRY", "Category Selection");
			click(supportsubmitbutton, "Submit Button");
		}
		catch(Throwable e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	
	
	

}
