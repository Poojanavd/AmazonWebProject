package com.amazonweb.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazonweb.base.Base;
import com.amazonweb.utils.CommonMethods;
import com.amazonweb.utils.ExcelFileReader;

public class HomePage extends CommonMethods implements ExcelFileReader {

	public static final String HOMEPAGE = "HomePage";

	public HomePage() {
		PageFactory.initElements(Base.driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Mobiles')]")
	WebElement mobilesMenu;

	@FindBy(xpath = "//a[contains(text(),'Best Sellers')]")
	WebElement bestSellersMenu;

	@FindBy(xpath = "//a[contains(text(),\"Today's Deals\")]")
	 WebElement todaysDealMenu;

	@FindBy(xpath = "//a[contains(text(),'Computers')]")
	WebElement computersMenu;

	@FindBy(xpath = "//div[@id='nav-xshop']//a[contains(@class,'')][contains(text(),'Books')]")
	WebElement booksMenu;
	
	@FindBy(id="nav-logo")
	WebElement homePageAmazonLogo;

	public boolean isUserOnHomePage() {
		return isTitleMatched(HOMEPAGE);
	}


	public boolean clickMenu(String menuName) {
		switch (menuName) {
		case "Mobiles":
			return clickElement(mobilesMenu);

		case "Best Sellers":
			return clickElement(bestSellersMenu);

		case "Todays Deals":
			return clickElement(todaysDealMenu);

		case "Computers":
			return clickElement(computersMenu);

		case "Books":
			return clickElement(booksMenu);

		default:
			break;
		}
		return false;
	}

	public boolean isTitleMatched(String menuName) {
		switch (menuName) {
		case HOMEPAGE:
			return areTitlesMatched(HOMEPAGE);
		case "Mobiles":
		case "Best Sellers":
		case "Todays Deals":
		case "Computers":
		case "Books":
			return areTitlesMatched(menuName);
		default:
			break;
		}
		return false;

	}

	public boolean navigateToHomePage() {
		return clickElement(homePageAmazonLogo);
	}

}
