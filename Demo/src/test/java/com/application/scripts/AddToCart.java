package com.application.scripts;

import org.testng.annotations.Test;

import com.objectRepository.SignInPage;

public class AddToCart extends SignInPage{
  
  @Test
  public void addToCart() throws Throwable {
	  signIn();
	  //searchAndSelectProduct();
	  addItemToCart();
	  signOut();
  }
	
}
