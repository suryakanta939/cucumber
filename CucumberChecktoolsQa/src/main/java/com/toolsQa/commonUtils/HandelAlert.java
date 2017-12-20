package com.toolsQa.commonUtils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class HandelAlert {

	 public static void acceptAlert(WebDriver driver){
		 Alert al=driver.switchTo().alert();
		 al.accept();
	 }
	 
	 public static void cancelAlert(WebDriver driver){
		 Alert alt=driver.switchTo().alert();
		 alt.dismiss();
	 }
	 
	 public static void radingtextFromAlert(WebDriver driver){
		 Alert alt=driver.switchTo().alert();
		 System.out.println(alt.getText());
	 }
}
