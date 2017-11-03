package com.application.scripts;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.objectRepository.ContactLensesMO;


public class ContactLensesOrder extends ContactLensesMO{
	  
	  @Test
	  public void contactLensesOrderTest() throws Throwable{
		 // signIn();
		  //contactLensesMousehover();
		  contactsLensSelection();
		  
		 
		 /* WebDriver driver;
			
			@BeforeMethod
			public void startMethod()
			{
				
				String url = "https://www.militaryoptical.com/";
				System.setProperty("webdriver.chrome.driver", "C://Users//e001589//Desktop//Selenium softwares//chromedriver.exe");
				driver = new ChromeDriver();
				driver.get(url);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			}
			
			@Test
			public void test() throws Exception
			{
				
				 Actions action = new Actions(driver);
				  action.moveToElement(driver.findElement(By.xpath("//div[@class='col-xs-12 col-md-8 main-navigation']/ul/li[2]/a/span[@class='v-center']"))).build().perform();
				  Thread.sleep(1000);
				  driver.findElement(By.xpath("//div[@class='col-xs-12 col-md-8 main-navigation']/ul/li[2]/div/div[@class='container']/div[@class='row']/div[1]/ul/li[1]/a")).click();
				  
				System.out.println("PAssed");
				
				WebDriverWait wait = new WebDriverWait(driver,10);
				wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
				
				
			}
		 */

}}

