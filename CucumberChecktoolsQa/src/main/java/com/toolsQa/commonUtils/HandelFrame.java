package com.toolsQa.commonUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandelFrame {

	public static void handelFrameByText(WebDriver driver,String text){
		driver.switchTo().frame(text);
	}
	
	public static void handelFrameByIndex(WebDriver driver,int no){
		driver.switchTo().frame(no);
	}
	
	public static void handelFrameByElement(WebDriver driver,WebElement element){
		driver.switchTo().frame(element);
	}
	
	public static void backToMainWIndow(WebDriver driver){
		driver.switchTo().defaultContent();
	}
}
