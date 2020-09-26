package com.amazonweb.browsers;

import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;

import com.amazonweb.base.Base;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IEBrowser {

	public static void initializeIEBrowser() {
		try {
			WebDriverManager.iedriver().version(Base.reader.getVersion()).setup();
			InternetExplorerOptions option = new InternetExplorerOptions();
			option.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			option.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		}
		catch(Exception e){
			e.printStackTrace();
			System.exit(1);
		}
	}
}
