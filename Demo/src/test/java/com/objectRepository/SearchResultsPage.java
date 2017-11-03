package com.objectRepository;

import org.openqa.selenium.By;

import com.accelerators.ActionEngine;

public class SearchResultsPage extends ActionEngine{

	By searchField = By.id("search-field");
	By searchIcon = By.xpath("//*[@id='search-widget']/form/div/i");
	By searchItem = By.xpath("//*[@id='search-results']/*/div[3]/div[1]/a/img");
	By addToCart = By.name("add-to-cart");
	By viewCart = By.xpath("//*[@id='costcoModalText']/div[2]/div[2]/a/button");
	By itemQuantity = By.id("quantity_1");
	By updateQuantity = By.xpath("//a[contains(text(),'Update')]");
	By emptyCartMessage = By.className("empty-cart-text");
	public By myaccount = By.id("myaccount-d");
	public By signOut = By.xpath("//*[@id='header_renewMembership']/form/li/input");
	public By signIn_Button	= By.xpath("//button/span/span[contains(text(),'Sign in')]");
	
	
	public void dellMethod
	
	() throws Throwable
	{
			type(searchField,"Dell Inspiron","Search Field");
			click(searchIcon,"Search Icon");
			click(searchItem,"Search Item");
	}
	
	public void addItemToCart() throws Throwable
	{
			click(addToCart,"Add to Cart");
			JSClick(viewCart,"View Cart");
			type(itemQuantity,"0","Item Quantity");
			click(updateQuantity,"Update Quantity");
			assertText(emptyCartMessage,xlsrdr.getCellData("Costco", "EmptyCartMessage", 3));
	}
}
