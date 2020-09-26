package stepDefinitions;

import com.amazonweb.base.Base;
import com.amazonweb.utils.ConfigurationFileReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks{

	@Before
	public static void startUp(Scenario scenario) {
		System.out.println(scenario.getName());
		Base.reader = new ConfigurationFileReader();
		Base.initializeBrowser();
	}

	@After
	public static void tearDown() {
		Base.quitBrowser();
	}
}
