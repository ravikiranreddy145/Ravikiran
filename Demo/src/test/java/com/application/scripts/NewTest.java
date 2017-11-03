package com.application.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.objectRepository.ContactLensesMO;

public class NewTest extends ContactLensesMO{
	WebDriver driver;
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
  public void f() throws Throwable {
	 // driver.get("https://www.emirates.com/in/English/?linkCategory=domain&linkItem=flyemirates.com");
//	  mouseover(By.xpath("//span[text()='Contact Lenses']"), "Book");
	  Actions action = new Actions(driver);
	  action.moveToElement(driver.findElement(By.xpath("//div[@class='col-xs-12 col-md-8 main-navigation']/ul/li[1]/a/span[1]"))).build().perform();
	  Thread.sleep(5000);
  }
}
