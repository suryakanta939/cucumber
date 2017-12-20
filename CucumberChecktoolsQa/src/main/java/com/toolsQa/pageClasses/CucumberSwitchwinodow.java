package com.toolsQa.pageClasses;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.toolsQa.baseClass.InvokeBrowser;
import com.toolsQa.commonUtils.ActionFunctions;
import com.toolsQa.commonUtils.HandelAlert;
import com.toolsQa.commonUtils.HandelWindow;
import com.toolsQa.commonUtils.WaitForWebPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberSwitchwinodow {

	static WebDriver driver;
	static WebElement element;
	static ExtentTest test;
	@FindBy(xpath="//span[span[span[text()='DEMO SITES']]]")
	public
	WebElement demosits;
	
	@FindBy(xpath="//span[span[span[text()='Automation Practice Switch Windows']]]")
	public
	WebElement practiceWindow;
	
	@FindBy(id="button1")
	public WebElement newBrowserWindow;
	
	@FindBy(xpath="//span[span[span[text()='Tools']]]")
	public WebElement tools;
	
	@FindBy(xpath="//span[span[span[text()='UI Automation']]]")
	public WebElement uiAutomation;
	
	@FindBy(xpath="//span[span[span[text()='Selenium Tutorial']]]")
	public WebElement seleniumTutorial;
	
	@FindBy(xpath="//li[text()='Automation Practice Switch Windows']")
	public
	WebElement titile;
	
	@FindBy(xpath="//button[text()='New Message Window']")
	public WebElement messageWindow;
	
	@FindBy(xpath="//body[contains(text(),'Knowledge increases by sharing')]")
	public WebElement text;
	
	@FindBy(xpath="//button[text()='New Browser Tab']")
	public WebElement browserTab;
	
	@FindBy(id="alert")
	public WebElement alert;
	
	public CucumberSwitchwinodow(WebDriver driver,ExtentTest test){
		
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver,this);
	}
	
	@Given("^user is home page$")
	public void user_is_home_page() throws Throwable {
	   driver=InvokeBrowser.opneBrowser("firefox");
	   driver.get("http://toolsqa.com/");
	   driver.manage().window().maximize();
	   WaitForWebPage.implicityWait(driver, 10);
	   
	}

	@When("^user navigate to the demosite$")
	public void user_navigate_to_the_demosite() throws Throwable {
	   ActionFunctions.mouseHoverOnTheElement(driver, demosits);
	}

	@Then("^clciked on the automation practice window$")
	public void clciked_on_the_automation_practice_window() throws Throwable {
	   practiceWindow.click();
	}

	@Then("^user will be on the Automation Practice Switch Windows page$")
	public void user_will_be_on_the_Automation_Practice_Switch_Windows_page() throws Throwable {
	    assertEquals(titile.getText(), "Automation Practice Switch Windows","title matched");
	}

	@Then("^User will handel the new browser window$")
	public void user_will_handel_the_new_browser_window() throws Throwable {
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

	@Given("^user is on the automation practice window page$")
	public void user_is_on_the_automation_practice_window_page() throws Throwable {
		System.out.println(titile.getText());
		test.log(LogStatus.INFO, "read the title");
	}

	@Then("^clciked on the new mesage window$")
	public void clciked_on_the_new_mesage_window() throws Throwable {

		messageWindow.click();
		test.log(LogStatus.INFO, "clicked on the message window");
		
	}

	@Then("^handeled the new message window$")
	public void handeled_the_new_message_window() throws Throwable {
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

	@When("^clicked on the new browser tab$")
	public void clicked_on_the_new_browser_tab() throws Throwable {
	   browserTab.click();
	   HandelWindow.handelWindowByNo(driver, 2);
		test.log(LogStatus.INFO, "new window opened");
		
		
		
	}

	@Then("^performed some function on the new tab$")
	public void performed_some_function_on_the_new_tab() throws Throwable {
		ActionFunctions.mouseHoverOnTheElement(driver, tools);
		test.log(LogStatus.INFO, "mouse hovered on the tools");
		Thread.sleep(500);
		ActionFunctions.mouseHoverOnTheElement(driver, uiAutomation);
		test.log(LogStatus.INFO, "mouse hovered on the uiautomationa");
		WaitForWebPage.waitFortheElementToBeVisible(driver, seleniumTutorial, 10);
		test.log(LogStatus.INFO, "seleniumTutorial element is visible");
		seleniumTutorial.click();
		test.log(LogStatus.INFO, "clciked on the seleniumtutoraij");
	}

	@Then("^coming back to mainWindow$")
	public void coming_back_to_mainWindow() throws Throwable {
		driver.close();
		test.log(LogStatus.INFO, "current window is closed");
		HandelWindow.handelWindowByNo(driver, 1);
	}

	@When("^clicked on the alert box$")
	public void clicked_on_the_alert_box() throws Throwable {
	   alert.click();
	}

	@Then("^then handeling the alert$")
	public void then_handeling_the_alert() throws Throwable {
	 HandelAlert.radingtextFromAlert(driver);
	  HandelAlert.acceptAlert(driver);
	  
	}


}
