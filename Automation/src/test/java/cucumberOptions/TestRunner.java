package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/Login.feature",
		glue="stepDefinitions",		
		plugin= {"pretty","json:target/cucumber-reports/Cucumber.json"},
		monochrome=true)
public class TestRunner {

}
