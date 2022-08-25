package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/greenCartwithDataTableExp.feature", glue = "stepDefinitions", dryRun = false, monochrome = true, plugin = {
		"pretty", "html:target/cucumber-html-report.html", "json:target/cucumber-json-report.json" }

)

public class TestNgRunner extends AbstractTestNGCucumberTests {

	// Running Parallel Testcases in cucumber
	// By Calling scenarios method from its parent class and @Dataprovider annotaion
	// with parralle as true

	/*
	 * @Override
	 * 
	 * @DataProvider(parallel = true) public Object[][] scenarios() { return
	 * super.scenarios();
	 * 
	 * }
	 */

}
