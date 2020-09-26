package com.amazonweb.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsDemo {
	
	public static ExtentSparkReporter reporter;
	public static ExtentReports extent;

	public static ExtentReports extentConfig() {
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Automaion");
		reporter.config().setDocumentTitle("Test results");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("testter", "pooja");
		
		return extent;
	}
}
