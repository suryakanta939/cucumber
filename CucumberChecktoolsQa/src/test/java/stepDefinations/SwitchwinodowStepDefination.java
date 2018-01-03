package stepDefinations;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.toolsQa.baseClass.InitializationFunctions;
import com.toolsQa.baseClass.InvokeBrowser;
import com.toolsQa.commonUtils.ActionFunctions;
import com.toolsQa.commonUtils.HandelAlert;
import com.toolsQa.commonUtils.HandelWindow;
import com.toolsQa.commonUtils.WaitForWebPage;
import com.toolsQa.pageClasses.CucumberSwitchwinodow;
import com.toolsQa.reportLib.ExtentFactory;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SwitchwinodowStepDefination {

	WebDriver driver;
	CucumberSwitchwinodow cw;
	ExtentTest test;
	ExtentReports report;
	@Before
	public void beforescenario(){
		System.out.println("executing before everyscenarion");
		report=ExtentFactory.generateReport();
		test=report.startTest("checking ing with cucumber");
	   driver=InvokeBrowser.opneBrowser("firefox");
	   cw=new CucumberSwitchwinodow(driver, test);
	}

	@After
	public void afterScenario(Scenario scen){
		System.out.println("executing after every scenarion");
		driver.close();
	}
	@Given("^user navigate to the main page$")
	public void user_navigate_to_the_main_page() throws Throwable {
		
	   driver.get("http://toolsqa.com/");
	   driver.manage().window().maximize();
	  
	}
	
	
	@When("^user navigate to the demosite$")
	public void user_navigate_to_the_demosite() throws Throwable {
	   ActionFunctions.mouseHoverOnTheElement(driver,cw.demosits);
	}

	@Then("^clciked on the automation practice window$")
	public void clciked_on_the_automation_practice_window() throws Throwable {
		WaitForWebPage.waitFortheElementToBeVisible(driver, cw.practiceWindow, 10);
	   cw.practiceWindow.click();
	}
	
	@Given("^user is home page$")
	public void user_is_home_page() throws Throwable {
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	@Then("^user will be on the Automation Practice Switch Windows page$")
	public void user_will_be_on_the_Automation_Practice_Switch_Windows_page() throws Throwable {
		WaitForWebPage.waitFortheElementToBeVisible(driver, cw.titile, 10);
	    assertEquals(cw.titile.getText(), "Automation Practice Switch Windows","title matched");
	}

	
	@Then("^User will handel the new browser window$")
	public void user_will_handel_the_new_browser_window() throws Throwable {
		cw.newBrowserWindow.click();
		test.log(LogStatus.INFO, "clciked on the new browser window");
		HandelWindow.handelWindowByNo(driver, 2);
		test.log(LogStatus.INFO, "new window opened");
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "window is maximized");
		Thread.sleep(500);
		ActionFunctions.mouseHoverOnTheElement(driver, cw.tools);
		test.log(LogStatus.INFO, "mouse hovered on the tools");
		Thread.sleep(500);
		ActionFunctions.mouseHoverOnTheElement(driver, cw.uiAutomation);
		test.log(LogStatus.INFO, "mouse hovered on the uiautomationa");
		WaitForWebPage.waitFortheElementToBeVisible(driver, cw.seleniumTutorial, 10);
		test.log(LogStatus.INFO, "seleniumTutorial element is visible");
		cw.seleniumTutorial.click();
		test.log(LogStatus.INFO, "clciked on the seleniumtutoraij");
		driver.close();
		test.log(LogStatus.INFO, "current window is closed");
		HandelWindow.handelWindowByNo(driver, 1);
		test.log(LogStatus.INFO, "coming to the parent window");
		System.out.println(cw.titile.getText());
		test.log(LogStatus.INFO, "read the title");
	}


	
	@Then("^clciked on the new mesage window$")
	public void clciked_on_the_new_mesage_window() throws Throwable {
		WaitForWebPage.waitFortheElementToBeVisible(driver, cw.messageWindow, 10);
		cw.messageWindow.click();
		test.log(LogStatus.INFO, "clicked on the message window");
		
	}

	
	@Then("^handeled the new message window$")
	public void handeled_the_new_message_window() throws Throwable {
		HandelWindow.handelWindowByNo(driver, 2);
		test.log(LogStatus.INFO, "moving the control to next window");
		Thread.sleep(2000);
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
		 WaitForWebPage.waitFortheElementToBeVisible(driver, cw.browserTab, 10);
	    cw.browserTab.click();
	    HandelWindow.handelWindowByNo(driver, 2);
		test.log(LogStatus.INFO, "new window opened");
	}

	
	
	@Then("^performed some function on the browser tab$")
	public void performed_some_function_on_the_browser_tab() throws Throwable {
		ActionFunctions.mouseHoverOnTheElement(driver, cw.tools);
		test.log(LogStatus.INFO, "mouse hovered on the tools");
		Thread.sleep(500);
		ActionFunctions.mouseHoverOnTheElement(driver, cw.uiAutomation);
		test.log(LogStatus.INFO, "mouse hovered on the uiautomationa");
		WaitForWebPage.waitFortheElementToBeVisible(driver, cw.seleniumTutorial, 10);
		test.log(LogStatus.INFO, "seleniumTutorial element is visible");
		cw.seleniumTutorial.click();
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
		WaitForWebPage.waitFortheElementToBeVisible(driver, cw.alert, 10);
	   cw.alert.click();
	}

	
	@Then("^then handeling the alert$")
	public void then_handeling_the_alert() throws Throwable {
	 HandelAlert.radingtextFromAlert(driver);
	  HandelAlert.acceptAlert(driver);
	  
	}


}
