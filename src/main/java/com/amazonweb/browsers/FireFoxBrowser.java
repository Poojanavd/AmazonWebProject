package com.amazonweb.browsers;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;

import com.amazonweb.base.Base;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FireFoxBrowser {

	public static void initializeFireFoxBrowser() {
		try {
			WebDriverManager.firefoxdriver().version(Base.reader.getVersion()).setup();
			FirefoxOptions option = new FirefoxOptions();
			option.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			option.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			Base.driver = new FirefoxDriver(option);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}

	}
}
