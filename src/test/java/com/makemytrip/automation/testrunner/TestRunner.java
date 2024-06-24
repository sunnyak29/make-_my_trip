package com.makemytrip.automation.testrunner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "feature", //the path of the feature files
		glue={"stepdefination"}, //the path of the step definition files
		plugin = { "pretty","html:target/cucumber-reports" }
		
//		strict = true
		)
public class TestRunner {

}
