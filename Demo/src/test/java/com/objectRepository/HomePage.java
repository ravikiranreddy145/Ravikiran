package com.objectRepository;

import org.openqa.selenium.By;

public class HomePage extends SignInPage{

	By shopAllDepartments = By.id("navigation-dropdown");
	By electronics = By.xpath("//*[@id='WC_CategoriesSidebarDisplayf_links_3_1']");
	By xBox = By.xpath("//*[@id='navigation-flyout-container']/div[2]/ul[1]/ul/li[1]/a");
	By searchResults = By.xpath("//*[@id='search-results']/div[4]/div/*/div[3]/div[1]/a/img");
	By wishList = By.id("wish-list-link");
	public By myaccount = By.id("myaccount-d");
	By wishLists = By.xpath("//*[@id='header_renewMembership']/li[6]/a");
	By deleteLink = By.className("delete-link");
	By addProduct = By.xpath("//*[@id='add_to_wishlist_form']/div[3]/button[1]/span/span");
	By listName = By.name("listIdName");
	By viewWishList = By.id("costcoModalBtn2");
	By confirmWishListDelete = By.xpath("/html/body/div[8]/div[3]/div/button[1]/span/span");
	By wishDeletionMessage = By.xpath("//*[@id='WishListDisplayForm']/p[2]");
	
	public void selectProductToWishList()
	{
		try {
			mouseover(shopAllDepartments, "Shop All Departments");
			mouseover(electronics,"Electronics");
			click(xBox,"XBOX One");
			JSClick(searchResults, "Search Result");
			click(wishList,"Add to Wish List");
			type(listName,"Test","Wish List Name");
			click(addProduct,"Add Product");
			click(viewWishList,"View Wish List");
			click(deleteLink,"Delete Wish List");
			click(confirmWishListDelete,"Confirm Delete Wish List");
			assertText(wishDeletionMessage, xlsrdr.getCellData("Costco", "WishDeletionMessage", 4));
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}
