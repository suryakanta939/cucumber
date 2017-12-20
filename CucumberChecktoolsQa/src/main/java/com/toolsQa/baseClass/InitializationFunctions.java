package com.toolsQa.baseClass;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.toolsQa.commonUtils.WaitForWebPage;
import com.toolsQa.pageClasses.CucumberSwitchwinodow;
import com.toolsQa.reportLib.ExtentFactory;

public class InitializationFunctions  {
	static WebDriver driver;
	static CucumberSwitchwinodow cw;
	static ExtentTest test;
	static ExtentReports report;
	public static WebDriver homePage(){
		
		report=ExtentFactory.generateReport();
		test=report.startTest("checking ing with cucumber");
	   driver=InvokeBrowser.opneBrowser("firefox");
	   cw=new CucumberSwitchwinodow(driver, test);
	return driver;
	   
	}
	
	 
}
