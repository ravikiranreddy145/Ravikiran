package com.Pages;

import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.accelerators.ActionEngine;
import com.thoughtworks.selenium.webdriven.commands.KeyEvent;

public class HomePage extends ActionEngine {

	private String globalNavigationLink = "//li[@class='dropdown yamm-fw']/a/span[text()='#']";

	public void clickGlobalNavigationLink(String linkName, String locatorName) throws Throwable {
		mouseover(By.xpath(globalNavigationLink.replace("#", linkName)), locatorName);
		/*Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_RIGHT);*/

		
		Thread.sleep(5000);
	}

	public void assertEyeGlassesHeaders(String[] headerNames) throws Throwable {
		for (String headerName : headerNames)
			if (isElementDisplayed(driver.findElement(By.xpath(
					"//li[@class='dropdown yamm-fw']/a[contains(.,'Eyeglasses')]/following-sibling::div/descendant::div[@class='col-md-2 col-xs-12 dropdown-menu__level2']/h3[text()='"
							+ headerName + "']"))))
				SuccessReport("Validate headers", "Successfully validated the headers");
			else
				failureReport("Validate headers", "failed to validated headers");
	}

}
