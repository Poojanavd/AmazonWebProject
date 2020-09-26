package com.amazonweb.browsers;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.CapabilityType;

import com.amazonweb.base.Base;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeBrowser {

	public static void initializeEdgeBrowser() {
		try {
			WebDriverManager.edgedriver().version(Base.reader.getVersion()).setup();
			EdgeOptions option = new EdgeOptions();
			option.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);	
			option.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			Base.driver = new EdgeDriver();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
}
