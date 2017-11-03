package com.Pages;

import org.openqa.selenium.By;

import com.accelerators.ActionEngine;

public class MyAccountPage extends ActionEngine{
	
	
	
	public By AddNewPAtient = By.xpath("//button[@class='btn btn-3 addnew-patient modal-delay']");
	
	public By PatientInfoLable = By.id("modaladdNewPatientLabel");
	public By PatientFirstName = By.id("firstName");
	public By LastName = By.id("register.lastName");
	public By Month = By.id("selectMonth");
	public By Day = By.id("selectDay");
	public By Year = By.id("selectYear");
	public By Add =  By.xpath("//div[@class='col-xs-6']/button[@id='load' and text()='Add']");
	
	
	public By Cancel = By.xpath(".//*[@id='addNewPatientForm']/div[4]/div/div[1]/button");
	public By Close = By.xpath("//*[@id='addNewPatient']/div/div/div[1]/button");
	
	String PatientLink ="//h4[contains(text(),'Patients')]/following-sibling::ul/li/a[starts-with(.,'#')]";
	
	
	
	
    public void AddPatient() {
    	
    	try {
    		
    click(AddNewPAtient, "Add New Patient Button");		
    
        Thread.sleep(lSleep_Low);
	
	assertText(PatientInfoLable, "New Patient Information");
	type(PatientFirstName, "Ftest", "First Name");
	type(LastName, "ltest", "Last Name");
	selectByValue(Month, "01", "Month");
		selectByValue(Day, "1", "Day");
		selectByValue(Year, "1990", "Year");
		Thread.sleep(lSleep_Low);
		click(Add, "Add Button");
		
	
   }
	   catch(Throwable e) {
		
		  e.printStackTrace();
		
		
	   }
	
  }
    
 public void CancelInAddPatientPopUp() {
    	
    	try {
    		
    click(AddNewPAtient, "Add New Patient Button");		
    
        Thread.sleep(lSleep_Low);
	
		click(Cancel, "Cancel Link");
	
		click(AddNewPAtient, "Add New Patient Button");		
	    
        Thread.sleep(lSleep_Low);
	
		click(Close, "Close Button");
				
			
   }
	   catch(Throwable e) {
		
		  e.printStackTrace();
		
		
	   }
	
  }
 
 public void SelectPatient(String LinkName,String LocatorName) {
 	
 	try {
 		
 click(By.xpath(PatientLink.replace("#", LinkName)), "Patient Link");
				
			
}
	   catch(Throwable e) {
		
		  e.printStackTrace();
		
		
	   }
	
}
 
    
    }
