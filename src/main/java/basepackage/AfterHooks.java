package basepackage;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;

public class AfterHooks {
	
	public WebDriver driver;
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
