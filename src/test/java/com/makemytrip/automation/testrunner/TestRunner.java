package com.makemytrip.automation.testrunner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "src/test/java/com/makemytrip/automation/feature",
		glue = "com.makemytrip.automation",
		plugin = { "pretty", "html:target/cucumber-reports/cucumber.html", "json:target/cucumber-reports/cucumber.json" },
		publish = false
		)
public class TestRunner extends AbstractTestNGCucumberTests {

}
