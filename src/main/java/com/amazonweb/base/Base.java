package com.amazonweb.base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;

import com.amazonweb.browsers.ChromeBrowser;
import com.amazonweb.browsers.EdgeBrowser;
import com.amazonweb.browsers.FireFoxBrowser;
import com.amazonweb.browsers.IEBrowser;
import com.amazonweb.utils.ConfigurationFileReader;
import com.amazonweb.utils.ListenersNG;

@Listeners(ListenersNG.class)
public class Base {

	public static WebDriver driver;
	public static ConfigurationFileReader reader;

	public static final String CHROME = "chrome";
	public static final String FIREFOX = "firefox";
	public static final String IE = "ie";
	public static final String EDGE = "edge";

	public static void initializeBrowser() {
		switch (Base.reader.getBrowser()) {
		case CHROME:
			ChromeBrowser.initializeChromeBrowser();
			break;
		case FIREFOX:
			FireFoxBrowser.initializeFireFoxBrowser();
			break;
		case IE:
			IEBrowser.initializeIEBrowser();
			break;
		case EDGE:
			EdgeBrowser.initializeEdgeBrowser();
			break;
		default:
			System.out.println("No browser selected");
		}
		Base.driver.manage().window().maximize();
		Base.driver.manage().deleteAllCookies();
		Base.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Base.driver.get(reader.getURL());
	}
	
	public static void quitBrowser() {
		Base.driver.quit();
	}
	
	public static void closeSession() throws IOException {
		quitBrowser();
		Runtime.getRuntime().exec("taskkill /F /IM ChromeDriver.exe");
	}

	public static void getScreenShots(){
		
	}
}