package package2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, tags = {"@uat , @pro , @Pay"})
public class Runner {
	
}
