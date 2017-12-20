package com.toolsQa.pageClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.toolsQa.commonUtils.SelectFunctions;

public class Registration {


	static WebDriver driver;
	static WebElement element;
	static List<WebElement> elements;
	static ExtentTest test;
	/*
	 * here going to store the element for the registration page
	 * 
	 * 
	 */	
	@FindBy(id="name_3_firstname")
	WebElement firstName;

	@FindBy(id="name_3_lastname")
	WebElement lastName;

	@FindBy(xpath="//input[@type='radio']")
	static List<WebElement> maritalStatus;


	@FindBy(xpath="//input[@type='checkbox']")
	static List<WebElement> hobby;

	@FindBy(id="dropdown_7")
	WebElement countryDropDown;


	@FindBy(id="mm_date_8")
	WebElement monthDropDown;


	@FindBy(id="dd_date_8")
	WebElement dayDropDown;


	@FindBy(id="yy_date_8")
	WebElement yearDropDown;


	@FindBy(id="phone_9")
	WebElement phoneNo;

	@FindBy(id="email_1")
	WebElement emailId;

	public Registration(WebDriver driver,ExtentTest test){
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);

	}

	public static void chooseMaritalStatusAs(String text){
		int totalsize=maritalStatus.size();
		for(int i=0;i<totalsize;i++){
			String status=maritalStatus.get(i).getAttribute("value");
			if(status.equalsIgnoreCase(text)){
				maritalStatus.get(i).click();
			}
		}
	}
	public static void chooseHobbyAs(String text){
		int totalsize=hobby.size();
		for(int i=0;i<totalsize;i++){
			String status=hobby.get(i).getAttribute("value");
			if(status.equalsIgnoreCase(text)){
				hobby.get(i).click();
			}
		}
	}

	public void fillUpForm(String fn,String ln,String country,String month,String day,
			String year,String phone,String email ) throws InterruptedException{

		firstName.sendKeys(fn);
		test.log(LogStatus.INFO, "filling up the firstname");
		
		lastName.sendKeys(ln);
		test.log(LogStatus.INFO, "filling up the last name");
		
		chooseMaritalStatusAs("divorced");
		Thread.sleep(500);
		test.log(LogStatus.INFO, "choosing the marital status");
		
		chooseHobbyAs("reading");
		test.log(LogStatus.INFO, "choosing the hobby");
		
		SelectFunctions.selectElementBytext(countryDropDown, country);
		test.log(LogStatus.INFO, "selecting the country");
		
		SelectFunctions.selectElementBytext(monthDropDown, month);
		test.log(LogStatus.INFO, "selecting the month");
		
		SelectFunctions.selectElementBytext(dayDropDown, day);
		test.log(LogStatus.INFO, "selecting the day");
		
		SelectFunctions.selectElementBytext(yearDropDown, year);
		test.log(LogStatus.INFO, "selecting the year");
		
		phoneNo.sendKeys(phone);
		test.log(LogStatus.INFO, "filling up the phone no");
		
		emailId.sendKeys(email);
		test.log(LogStatus.INFO, "filling up the email");

	}

}
