package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Users/eldrid/TrialGithub/CucumberseleniumTechfios2/src/main/java/Features",
		glue={"stepDefinitions"}
		
		)

public class TestRunner {		
	

}
