package com.application.scripts;

import org.testng.annotations.Test;

import com.objectRepository.HomePage;

public class AddProductToWishList extends HomePage{
	
	@Test
  public void addProductToWishList() {
		signIn();
		selectProductToWishList();
		signOut();
  }
}
