package cucumberOption;



import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features" //Path of the features file till package name
		,glue="stepDefinations",stepNotifications=true //path of the step definitions file till package name
		//,dryRun=true //Checks if the mapping is done between the Feature file and step def file
		,monochrome=true
		//,tags="@Background" //Tag is imp run specific scenarios
		
		, plugin= {"pretty","html:target/cucumber-html-report.html", "json:target/cucumber-json-report.json"} //Reports generation
		)

public class TestRunner {

}
