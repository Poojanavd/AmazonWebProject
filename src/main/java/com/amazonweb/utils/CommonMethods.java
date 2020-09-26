package com.amazonweb.utils;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazonweb.base.Base;

public class CommonMethods extends Base implements ExcelFileReader{

	public static boolean clickElement(WebElement element) {
		boolean result = false;
		try{
			Thread.sleep(5000);
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(element));
			element.click();
			result = true;
		}
		catch(Exception e) {
			System.out.println(element+" is not clicked");
			result = false;
		}
		return result;
	}
	
	public static boolean areTitlesMatched(String menuName) {
		try {
			String actualTitle = driver.getTitle();
			String expectedTitle = ExcelFileReader.getCellData(menuName);
			return actualTitle.equals(expectedTitle);

		} catch (InvalidFormatException | IOException e) {
			e.printStackTrace();
		}
		return false;
	}
}
