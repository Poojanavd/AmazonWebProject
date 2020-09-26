package com.amazonweb.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "classpath:FeatureFiles/HomePage.feature", glue = "stepDefinitions", plugin = { "pretty",
		"json:target/jsonReports/cucumber-report.json", 
//		"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"
		})

@RunWith(Cucumber.class)
public class TestRunner extends AbstractTestNGCucumberTests{

}
