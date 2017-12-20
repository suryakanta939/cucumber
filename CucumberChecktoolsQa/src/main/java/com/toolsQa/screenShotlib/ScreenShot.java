package com.toolsQa.screenShotlib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ScreenShot {

	public static String takeScreenShot(WebDriver driver,String FileName) throws IOException{
		File f=new File("Image");
		File fs=new File(f,"\\"+FileName+".png");
		System.out.println(fs.getAbsolutePath());
		EventFiringWebDriver eDriver=new EventFiringWebDriver(driver);
		File srcFile=eDriver.getScreenshotAs(OutputType.FILE);
		File dstFile=new File(fs.getAbsolutePath());
		FileUtils.copyFile(srcFile, dstFile);
		String path=fs.getAbsolutePath();
		return path;
	}
}
