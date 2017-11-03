package com.Pages;

import org.openqa.selenium.By;

import com.accelerators.ActionEngine;


public class Myaccount2 extends ActionEngine{
 public By Appointments_link = By.xpath("//a[@href='/my-account/appointments']");
 public By Appointments_header = By.xpath("//div[@class='accmain-header']/h1[@class='accmain-header__title']");
 public By NoAppointments_text = By.xpath("//button[@id='scheduleneyeexam']/following-sibling::p");
 public By Scheduleeyeexam = By.id("scheduleneyeexam");
 public By Nolocationpopup_close = By.id("lightwindow_title_bar_close_link");
 public By orderhistory_link = By.linkText("Order History");
 public By ordersnotfound = By.xpath("//div[@class='col-xs-12 col-sm-6']/div[@class='accmain-intro accmain-intro_favorite']");
 public By Autoreorder_link = By.xpath("//a[@href='/my-account/autoreorder/auto-reorders']");
 public By Autoreorder_header = By.xpath("//div[@class='accmain-header']/h1");
 public By NoAutoreorders = By.xpath("//div[@class='row accorder-reorder__info']/following-sibling::h4");
 public By Myaccbreadcrumb=By.xpath("//ol[@class='breadcrumb']/descendant::li");
 

public void Myaccountmethod()
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
  if(isElementPresent(Autoreorder_link, "checking whehter Auto reorder link is present"))
  {
  click(Autoreorder_link, "Autoreorder link clicked");
  isElementPresent(Myaccbreadcrumb, "checking whehter breadcrumb is present");
  isElementPresent(ordersnotfound, "checking appointment header is present");
  
  }
  else {
   System.out.println("Elements is not present");
   failureReport("Elemnts are missing", "All links are not present");
  
  }
  if(isElementPresent(orderhistory_link, "checking whehter create orderhistory link is present"))
  {
  click(orderhistory_link, "Orderhistory link clicked");
  isElementPresent(Myaccbreadcrumb, "checking whehter breadcrumb is present");
  isElementPresent(Autoreorder_header, "checking Autoreorder header is present");
  isElementPresent(NoAutoreorders, "checking No Autoreorder is present");
  
  }
  else {
   System.out.println("Elements is not present");
   failureReport("Elemnts are missing", "All links are not present");
  
  }
 }
 catch(Throwable e)
 
 {
  e.printStackTrace();
 }
}
}