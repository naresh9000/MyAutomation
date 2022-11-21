package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;


// @Runwith -- is the junit annotation
//@RunWith annotation tells JUnit that tests should run using Cucumber 
//class present in 'Cucumber.api.junit' package.

@RunWith(Cucumber.class)
@CucumberOptions(features ="featureFiles",
				 glue ="stepDefinitions",
				 monochrome = true,
				 dryRun = true,
				publish = true,
				plugin= {"html:target/cucumber.html","json:target/cucumber.json",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						"rerun:target/failed_scenarios.txt"
						}
				)
public class CucumberTestRunner {

}
