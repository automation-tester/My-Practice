package runnerclasses;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				 monochrome=true,
				 features="src/test/resources/Features/MultipleScenarios/",
				 glue={"com.cucumber.step_definationMultipleScenarios"},
				 plugin={"pretty","html:target/cucumber-html-report","json:target/cucumber1.json","pretty:target/cucumber-pretty.txt",
				"usage:target/cucumber-usage.json","junit:target/cucumber-results.xml"}
				 //"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"
				 )
public class Runner_MultipleScenarios {

}
