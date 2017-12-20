package com.toolsQa.commonUtils;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectFunctions {

	public static void selectElementBytext(WebElement element,String text){
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	public static void selectElementByValue(WebElement element,String value){
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	public static void selectElementByIndex(WebElement element,int index){
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	
	public static void verifyText(WebElement element,String desiredText){
		Select sel=new Select(element);
		List<WebElement> allOptions=sel.getOptions();
		for(int i=0;i<allOptions.size();i++){
			String actualText=allOptions.get(i).getText();
			if(actualText.equals(desiredText)){
				System.out.println("text is presnt");
			}
		}
	}
}
