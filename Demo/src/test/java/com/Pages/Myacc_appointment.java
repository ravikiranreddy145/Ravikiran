package com.Pages;
import org.openqa.selenium.By;

import com.accelerators.ActionEngine;
import com.objectRepository.Viewallstores_appointment;

  public class  Myacc_appointment extends Viewallstores_appointment{
  public By Appointments_link = By.xpath("//a[@href='/my-account/appointments']");
  public By Appointments_header = By.xpath("//div[@class='accmain-header']/h1[@class='accmain-header__title']");
  public By NoAppointments_text = By.xpath("//button[@id='scheduleneyeexam']/following-sibling::p");
  public By Scheduleeyeexam = By.xpath("//button[@id='scheduleneyeexam']");
  public By Nolocationpopup_close = By.xpath("//a[@id='lightwindow_title_bar_close_link']");
  public By Myaccbreadcrumb =By.xpath("//ol[@class='breadcrumb']/descendant::li");
  public By Enterlocation =By.id("locationSearch");
  public By searchbtn =By.id("search_button");
  public By Schedulebtn_location =By.xpath("//tbody/tr[@class='div_row'][2]/descendant::a[text()='Schedule Exam']");
  
  
  
  public void Myaccscheduling()
  {
 
 try {
  
  if(isElementPresent(Appointments_link, "checking whehter create appointment link is present"))
  {
  click(Appointments_link, "Appointment link clicked");
  isElementPresent(Myaccbreadcrumb, "checking whehter breadcrumb is present");
  isElementPresent(Appointments_header, "checking appointment header is present");
  isElementPresent(NoAppointments_text, "checking whehter breadcrumb is present");
  }
  else {
   System.out.println("Element is not present");
   failureReport("Elemnts are missing", "All links are not present");
  }
  click(Scheduleeyeexam, "Appointment button clicked");
  Thread.sleep(20000);
  click(Nolocationpopup_close, "Pop up closed");
  Thread.sleep(5000);
  click(Enterlocation, "Location state to be entered");
  type(Enterlocation, "10006","Location entered");
  click(searchbtn,"Searched locations");
  Thread.sleep(20000);
  click(Schedulebtn_location,"Searched locations");
  Thread.sleep(lSleep_Low);
  click(had_exam, "Selecting exam");
  click(type_exam, "Selecting type of exam");
  click(ever_worn,"Selecting contact lenses question");
  click(assistance_exam, "Selecting any help needed");
  click(continue_btn, "CLiking on continue button");
  Thread.sleep(lSleep_High);
  click(select_date, "Selection of date");
  Thread.sleep(lSleep_High);
  click(select_time, "Selection of time");
  Thread.sleep(lSleep_Low);
  click(scheduleappointmentdateTime,"schedule continue button");
  Thread.sleep(lSleep_Low);
  type(patient_fname, "ftest1","first name");
  type(patient_lname, "ltest1","last name");
  selectByValue(Month, "08","birth month");
  selectByVisibleText(date, "12","birth month");
  selectByVisibleText(year, "1991","birth month");
  type(email, "asdf@golemico.com","email id ");
  type(Phone, "6855824561","mobile number");
  click(Phone_type, "phone type");
  click(checkbox_agree, "Agreeing terms and conditions");
  click(checkbox_18, "Agreeing age 18 above");
  click(submit_appiontment, "Clicking on schedule appointment");
  isElementPresent(appointment_confirmation,"Appointment is scheduled");
    }
 catch(Throwable e)
 {
  e.printStackTrace();
     }
  }
  }


