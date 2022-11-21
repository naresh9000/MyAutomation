package testRunner;





@CucumberOptions(features ="@target/failed_scenarios.txt",
				glue ="stepDefinitions",
				monochrome = true,
				dryRun = true,
				publish = true,
				plugin= {"html:target/cucumber.html","json:target/cucumber.json",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						}
				)

public class FailedTestRunner {

}
