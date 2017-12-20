package com.toolsQa.reportLib;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentFactory {
	
   static ExtentReports report;
   
   public static ExtentReports generateReport(){
	   File f=new File("Report");
	   File fs=new File(f,"");
	   System.out.println(fs.getAbsolutePath()+"\\tollsQa.html");
	  report=new ExtentReports(fs.getAbsolutePath()+"\\tollsQa.html",false);
	   return report;
   }
   
}
