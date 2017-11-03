package com.application.scripts;

import org.testng.annotations.Test;

import com.objectRepository.MyAccountAddSupportTickets;

public class MyAccountAddSupportTicket extends MyAccountAddSupportTickets{
	
	@Test
	public void addSupportTicketMyAccount()
	{
		try
		{
			signIn();
			supporTicketsAddMethod();
		}
		catch(Throwable e)
		{
			e.printStackTrace();
		}
	}

}
