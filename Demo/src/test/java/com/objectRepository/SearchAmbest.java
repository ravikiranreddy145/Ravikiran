package com.objectRepository;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.accelerators.ActionEngine;

public class SearchAmbest extends ActionEngine{
	
	public By search = By.xpath("//strong[@id='data-search']");
	public By searchenter = By.id("inputSearchProductInfo");
	public By searchsigninbutton = By.id("signIn");
	
	
	
	
  @Test
  public void search() {
	  
	  try {
		  mouseover(search, "Search");
		  Thread.sleep(lSleep_Medium);
		  type(searchenter, "heart", "Heart word is searchinng");
		  click(searchsigninbutton, "Search button");
	  }
	  catch(Throwable ae)
	  {
		  ae.printStackTrace();
	  }
	  
  }
}
