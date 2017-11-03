package com.application.scripts;

import org.testng.annotations.Test;

import com.Pages.HomePage;

public class EyeGalssCheckOut extends HomePage {

	
	@Test
	public void eyeGlassCheckOut() throws Throwable {
		
		String [] headerNames= {"Shop by Category","Shop by Price","Shop Popular Brands","Learn More"};

		clickGlobalNavigationLink("Eyeglasses", "Eyeglasses");
		assertEyeGlassesHeaders(headerNames);

	}
}
