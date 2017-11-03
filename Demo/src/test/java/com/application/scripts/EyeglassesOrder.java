package com.application.scripts;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EyeglassesOrder {
WebDriver driver;
	
	@BeforeMethod
	public void startMethod()
	{
		
		String url = "https://ambest-sap.nationalvision.com";
		System.setProperty("webdriver.chrome.driver", "C://Users//e001589//Desktop//Selenium softwares//chromedriver_win32 (2)//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
  @Test
  public void mensCategory() throws Exception{
	  Actions action = new Actions(driver);
	  action.moveToElement(driver.findElement(By.xpath("//div[@class='col-xs-12 col-md-8 main-navigation']/ul/li[1]/a/span[1]"))).build().perform();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//div[@class='col-xs-12 col-md-8 main-navigation']/ul/li[1]/div[@class='dropdown-menu']/div[@class='container']/div[@class='row']/div[1]/ul/li[2]/a")).click();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.id("username")).sendKeys("pdietrich2014");
	  driver.findElement(By.id("password")).sendKeys("aclens1234");
	  driver.findElement(By.id("login-button")).click();
	  Thread.sleep(2000);
	  
	  //select first product in the list
	  driver.findElement(By.xpath(".//*[@id='productGridListing']/div/div[1]/div[2]/div[1]/a")).click();
	  //driver.findElement(By.xpath(".//*[@id='productGridListing']/div/div[1]/div[2]/a/img")).click();
	  Thread.sleep(1000);
	  //
	  driver.findElement(By.id("configureProduct")).click();
	  Thread.sleep(3000);
	  //add to cart button
	  driver.findElement(By.xpath(".//*[@id='lensWizardForm']/button")).click();
	  //select prescription
	  Select select  = new Select(driver.findElement(By.id("prescriptionselection")));
	  select.selectByValue("doctor");
	  driver.findElement(By.xpath(".//*[@id='Form']/fieldset/div[5]/div[2]/input")).click();
	  Thread.sleep(1000);
	  //Select Lens Type and Material
	  driver.findElement(By.xpath(".//*[@id='lensTypeSelectionForm']/fieldset/div[2]/div[2]/input")).click();
	  //select lens package -->selecting protection package
	//  driver.findElement(By.xpath(".//*[@id='chkAgreementLensPackage_2']")).click();
	  Thread.sleep(1000);
	  //select lens package continue button
	  driver.findElement(By.xpath(".//*[@id='ContinueButtonSection']/div[2]/input")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath(".//*[@id='ActiveDivToScroll']/div[2]/div/div[2]/div/div/div[1]/form/input")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[@class='shopping-action shopping-action--bottom']/div[@class='row']/div/a[@class='btn btn-1 btn-checkout']")).click();
	  //sign in after during checkout
	 driver.findElement(By.id("j_username_loginPage")).sendKeys("allfresh@gmail.com");
	  driver.findElement(By.id("j_password_loginPage")).sendKeys("test@123");
	  driver.findElement(By.xpath("//form[@id='login_form_checkout']/fieldset/div[@class='form-group form-buttons']/button")).click();
	  
	  String errormessagetext ="Your email address or password was incorrect.";
	  
	  WebElement storemes = driver.findElement(By.xpath("//ul[@class='errorList']/li"));
	  String getmessage =storemes.getText();
	  Assert.assertEquals(errormessagetext, getmessage);
	  System.out.println("Process continuessssss...........");
	  
	 
	  //guest checkout
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[@class='checkout-guest hidden-xs']/descendant::button[contains(text(),'Guest Checkout')]")).click();
	  
	  Thread.sleep(2000);
	  //doctor / prescription for patient
	  //driver.findElement(By.id("patientOption2")).click();
	  
	  //checkout doctor prescription
	  driver.findElement(By.id("firstname")).clear();
	  driver.findElement(By.id("firstname")).sendKeys("Ravikiran");
	  driver.findElement(By.id("lastName")).clear();
	  driver.findElement(By.id("lastName")).sendKeys("reddy");
	  driver.findElement(By.id("email3")).sendKeys("threezero@gmail.com");
	  
	 
	  
	  
	  
	  //Date of Birth-- month
	  Select select1 = new Select(driver.findElement(By.id("months")));
	  select1.selectByValue("2");
	//Date of Birth--day
	  Select select2 = new Select(driver.findElement(By.id("days")));
	  select2.selectByValue("2");
	//Date of Birth--year
	  Select select3 = new Select(driver.findElement(By.id("years")));
	  select3.selectByValue("1989");
	  
	 /* //Select Your America’s Best Contacts & Eyeglasses Store 
	  Select select4 = new Select(driver.findElement(By.id("stateDropdown")));
	  select4.selectByValue("US-CA");
	  Thread.sleep(500);
	  //selecting one form set of store locations
	  driver.findElement(By.id("eyeglassesStore1")).click();
	  //checkout doctor continue button
	  driver.findElement(By.xpath(".//*[@id='patientPrescriptionFormId']/fieldset/div[6]/div/input")).click();
	  */
	  
	  // click on continue button in doctor checkout page
	  driver.findElement(By.xpath("//div[@class='checkout-page__action row']/div/input")).click();
	  Thread.sleep(1000);
	  //shipping step--address enter
	  driver.findElement(By.id("address_firstName")).sendKeys("RAmu");
	  driver.findElement(By.id("address_surname")).sendKeys("krishna");
	  driver.findElement(By.id("address_phone")).sendKeys("7896541236");
	  
	  Select sel = new Select(driver.findElement(By.id("address_country")));
	  sel.selectByValue("US");
	  
	  driver.findElement(By.id("address_line1")).sendKeys("hyderabad");
	  driver.findElement(By.id("address_townCity")).sendKeys("newyork");
	  
	  Select sel1 = new Select(driver.findElement(By.id("selectRegion")));
	  sel1.selectByValue("US-CO");
	  driver.findElement(By.id("address_postcode")).sendKeys("10011");
	  //click on continue button
	  driver.findElement(By.xpath("//div[@id='row checkout-step-continue']/div/button")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//div[@class='model-form-buttons']/div/div[2]")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.id("nameOnCard")).sendKeys("Madhu");
	  driver.findElement(By.id("cardNumber")).sendKeys("4111111111111111");
	  
	  Select card = new Select(driver.findElement(By.id("expiryMonth")));
	  card.selectByIndex(9);
	  Select card1 = new Select(driver.findElement(By.id("expiryYear")));
	  card1.selectByIndex(6);
	  driver.findElement(By.id("issueNumber")).sendKeys("183");
	
		driver.findElement( By.id("load")).click();

	
  }
}
