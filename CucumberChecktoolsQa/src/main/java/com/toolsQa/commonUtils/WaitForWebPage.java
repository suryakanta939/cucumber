package com.toolsQa.commonUtils;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForWebPage {

	
	public static void implicityWait(WebDriver driver,int timeINsec){
		driver.manage().timeouts().implicitlyWait(timeINsec, TimeUnit.SECONDS);
}
	
	public static void WaitForTheElementToBeClickable(WebDriver driver,WebElement element,int time){
		WebDriverWait wait=new WebDriverWait(driver, time);
	wait.until(ExpectedConditions.elementToBeClickable(element));
      }
	
	public static void waitFortheElementToBeVisible(WebDriver driver,WebElement element,int time){
		WebDriverWait wait=new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void waitForTheElementsToBePresent(WebDriver driver,String xpath,int time){
		WebDriverWait wait=new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath)));
	}
	
 }
