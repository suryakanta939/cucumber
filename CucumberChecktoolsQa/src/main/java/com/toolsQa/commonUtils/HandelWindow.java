package com.toolsQa.commonUtils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class HandelWindow {

	public static void handelWindowByTitle(WebDriver driver,String desTitle){

		String pid=driver.getWindowHandle();
		Set<String> allIds=driver.getWindowHandles();
		for(String id:allIds){
			if(!id.equals(pid)){
				driver.switchTo().window(id);
				String actTitle=driver.getTitle();
				if(actTitle.equals(desTitle)){
					driver.switchTo().window(id);
				}
			}
		}
	}
	
	public static void handelWindowByNo(WebDriver driver,int windowNo){
		Set<String> allIds=driver.getWindowHandles();
		Iterator<String> itr=allIds.iterator();
		for(int i=1;i<=allIds.size();i++){
			String id=itr.next();
			if(i==windowNo){
				driver.switchTo().window(id);
			}
		}
	}

}
