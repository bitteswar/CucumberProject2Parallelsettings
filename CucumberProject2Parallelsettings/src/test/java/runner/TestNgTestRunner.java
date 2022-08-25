package runner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features", glue = { "stepDefinitions",
		"apphooks" }, tags = ("@placeCart or @Greencart"), dryRun = false, monochrome = true, plugin = {
				"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" ,"rerun:target/failed_scenarios.txt"}

)

/*
 * "pretty", "html:target/cucumber-html-report.html",
 * "json:target/cucumber-json-report.json" ,
 */

public class TestNgTestRunner extends AbstractTestNGCucumberTests {

	// Running Parallel Testcases in cucumber
	// By Calling scenarios method from its parent class and @Dataprovider annotaion
	// with parralle as true

	@Override

	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();

	}

}
