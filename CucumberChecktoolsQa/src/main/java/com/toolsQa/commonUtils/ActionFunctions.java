package com.toolsQa.commonUtils;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionFunctions {
	/*
	 * this function will help to mouse hove on an element
	 * */
	public static void mouseHoverOnTheElement(WebDriver driver,WebElement element){
		Actions act=new Actions(driver);
		act.moveToElement(element).build().perform();
	}
	/*
	 * Thsi function will help to solve the problem like element is
	 * not clickable at point ,some other elements are taking the click
	 * */
	public static void moveToElementByCordinate(WebDriver driver,WebElement element){
		Actions act=new Actions(driver);
		int xCord=element.getLocation().getX();
		int yCord=element.getLocation().getY();
		act.moveToElement(element, xCord, yCord).build().perform();
	}
	
	public static void dragAndDropElement(WebDriver driver,WebElement srcElement,WebElement dstElement){
		Actions act=new Actions(driver);
		act.clickAndHold(srcElement).moveToElement(dstElement).release().build().perform();
	}
	
	public static void openLinkInOtherTab(WebDriver driver,WebElement element){
		Actions act=new Actions(driver);
		act.contextClick(element).sendKeys("t").build().perform();
	}

	public static void openNewTab(WebDriver driver,WebElement element){
		Actions act=new Actions(driver);
		act.sendKeys(Keys.CONTROL,"t").build().perform();
	}

}
