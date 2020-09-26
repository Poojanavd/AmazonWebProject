package com.amazonweb.browsers;

import java.util.Arrays;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.amazonweb.base.Base;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowser {

	public static void initializeChromeBrowser() {
		try {
			WebDriverManager.chromedriver().version("85").setup();
			ChromeOptions option = new ChromeOptions();
			option.addArguments(Arrays.asList("start-maximized", "no-default-browser-check", "-disable-popup-blocking",
					"-disable-notifications", "--ignore-certificate-errors"));
			Base.driver = new ChromeDriver(option);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}

	}
}
