package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="mainPage",
					glue ="Checkingtest",
					monochrome = true,
					dryRun = true,
					publish = true,
					plugin= {"html:target/cucumber.html","json:target/cucumber.json",
							"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
							}
					)


public class TestNGTestRunner extends AbstractTestNGCucumberTests{
	

	/*
	 * @Override
	 * 
	 * @DataProvider(parallel=true) public Object[][] scenarios() { return
	 * super.scenarios(); }
	 */

}
