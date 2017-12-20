package com.toolsQa.baseClass;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class InvokeBrowser {
	
	static WebDriver driver;
	
	public static WebDriver opneBrowser(String browserName){
		if(browserName.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("chrome")){
			File f=new File("Driver");
			File fs=new File(f,"chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", fs.getAbsolutePath());
			driver=new ChromeDriver();
					
		}
		return driver;
	}

}
