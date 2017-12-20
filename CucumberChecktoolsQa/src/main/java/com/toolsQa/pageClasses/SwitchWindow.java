package com.toolsQa.pageClasses;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.toolsQa.commonUtils.ActionFunctions;
import com.toolsQa.commonUtils.HandelWindow;
import com.toolsQa.commonUtils.WaitForWebPage;

public class SwitchWindow {
 
	static WebDriver driver;
	static WebElement element;
	static ExtentTest test;
	
	@FindBy(id="button1")
	WebElement newBrowserWindow;
	
	@FindBy(xpath="//span[span[span[text()='Tools']]]")
	WebElement tools;
	
	@FindBy(xpath="//span[span[span[text()='UI Automation']]]")
	WebElement uiAutomation;
	
	@FindBy(xpath="//span[span[span[text()='Selenium Tutorial']]]")
	WebElement seleniumTutorial;
	
	@FindBy(xpath="//li[text()='Automation Practice Switch Windows']")
	WebElement titile;
	
	@FindBy(xpath="//button[text()='New Message Window']")
	WebElement messageWindow;
	
	@FindBy(xpath="//body[contains(text(),'Knowledge increases by sharing')]")
	WebElement text;
	
	@FindBy(xpath="//button[text()='New Browser Tab']")
	WebElement browserTab;
	
	@FindBy(id="alert")
	WebElement alert;
	
	public SwitchWindow(WebDriver driver,ExtentTest test){
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver,this);
	}
	
	
	public void handelBroserWindow() throws InterruptedException{
		newBrowserWindow.click();
		test.log(LogStatus.INFO, "clciked on the new browser window");
		HandelWindow.handelWindowByNo(driver, 2);
		test.log(LogStatus.INFO, "new window opened");
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "window is maximized");
		Thread.sleep(500);
		ActionFunctions.mouseHoverOnTheElement(driver, tools);
		test.log(LogStatus.INFO, "mouse hovered on the tools");
		Thread.sleep(500);
		ActionFunctions.mouseHoverOnTheElement(driver, uiAutomation);
		test.log(LogStatus.INFO, "mouse hovered on the uiautomationa");
		WaitForWebPage.waitFortheElementToBeVisible(driver, seleniumTutorial, 10);
		test.log(LogStatus.INFO, "seleniumTutorial element is visible");
		seleniumTutorial.click();
		test.log(LogStatus.INFO, "clciked on the seleniumtutoraij");
		driver.close();
		test.log(LogStatus.INFO, "current window is closed");
		HandelWindow.handelWindowByNo(driver, 1);
		test.log(LogStatus.INFO, "coming to the parent window");
		System.out.println(titile.getText());
		test.log(LogStatus.INFO, "read the title");
		
	}
	
	public void handelMessageWindow(){
		
		messageWindow.click();
		test.log(LogStatus.INFO, "clicked on the message window");
		HandelWindow.handelWindowByNo(driver, 2);
		test.log(LogStatus.INFO, "moving the control to next window");
		driver.manage().window().maximize();
//		System.out.println(text.getText());
//		test.log(LogStatus.INFO, "reading the text");
		driver.close();
		test.log(LogStatus.INFO, "closing the child window");
		HandelWindow.handelWindowByNo(driver, 1);
		test.log(LogStatus.INFO, "coming to the parent window");
	}
	
	
}
