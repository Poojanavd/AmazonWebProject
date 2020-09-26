package stepDefinitions;

import static org.testng.Assert.assertTrue;

import com.amazonweb.pages.HomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDef {

	HomePage homePage = new HomePage();
	boolean result = false;

	@Given("^I am on Amazon homepage$")
	public void iAmOnAmazonHomepage() {
		result = homePage.isUserOnHomePage();
		assertTrue(result, "HomePage title is incorrect");
	}

	@When("^I click on (.+) Menu$")
	public void iClickOnMobilesMenu(String menuName) {
		result = homePage.clickMenu(menuName);
		assertTrue(result, menuName + " is not clicked");
	}

	@Then("^I navigate to Homepage$")
	public void iNavigateToHomepage() {
		result = homePage.navigateToHomePage();
		assertTrue(result, "user not navigated to homepage");

	}

	@And("^I validate the title of (.+) Page$")
	public void iValidateTheTitleOfMobilePage(String menuName) {
		result = homePage.isTitleMatched(menuName);
		assertTrue(result, menuName + " title is incorrect");
	}
}
