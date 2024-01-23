package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\main\\java\\features\\application.feature", //the path of the feature files
		glue={"StepDefination"}, //the path of the step definition files
		dryRun = false,
		monochrome = true,
		plugin = { "pretty","html:target/cucumber-reports" }
		
//		strict = true
		)
public class TestRunner {

}
