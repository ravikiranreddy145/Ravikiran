package com.objectRepository;
import org.openqa.selenium.By;
public class Viewallstores_appointment extends MyAccountAddSupportTickets{
	public By view_allstores= By.xpath("//a[@href='/store-list']");
	 public By select_store= By.xpath("//a[@href='/store-list/homewood-al-35209']");
	 public By schedule_eyebutton= By.xpath("//a[@class='btn btn-eye-exam']/button[@class='btn btn-1 btn-eye-exam']");
	 public By had_exam= By.id("hadexamNo");
	 public By type_exam= By.id("examType3");
	 public By ever_worn= By.id("hasWornContactsBefore-no");
	 public By assistance_exam= By.id("examCheckOption2");
	 public By back_btn= By.id("examType_btn-back");
	 public By continue_btn= By.id("exam-type");
	 public By select_date=By.xpath("//td[@data-month='9']/a[@href='#' and text()='31']");
	 public By select_time=By.xpath("html/body/main/div[2]/div/div[2]/div/div/div[2]/div[2]/form/fieldset/div[1]/div/div[2]/div/div/div[42]/label");
	 public By patient_fname= By.id("inputPatientName");
	 public By patient_lname= By.id("inputPatientlastName");
	 public By Month= By.name("birthMonth");
	 public By date= By.name("birthDay");
	 public By year= By.name("birthYear");
	 public By email= By.name("email");
	 public By Phone= By.name("phoneNo");
	 public By Phone_type= By.id("inputMOBILE");
	 public By checkbox_agree= By.id("checkboxAgree");
	 public By checkbox_18= By.id("checkboxCertify");
	 public By submit_appiontment= By.id("schedule-appointment-guestPatientInfo");
	 public By appointment_confirmation= By.xpath("//div[@class='schedule-appointment__header']");
	 public By scheduleappointmentdateTime = By.id("schedule-appointment-dateTime");


    public void schedulingappointment()
     {
	try {
		click(view_allstores, "View all stores link");
		Thread.sleep(lSleep_Low);
		click(select_store, "Selecting store");
		Thread.sleep(5000);
		click(schedule_eyebutton, "CLiking on Schedule eye exam");
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
	   }
	catch(Throwable e)
	{
		e.printStackTrace();
     }
}

}
