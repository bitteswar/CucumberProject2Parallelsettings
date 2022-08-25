package apphooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.cart.utility.ConfigReader;
import com.qa.factory.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHook {

	private ConfigReader configreader;
	Properties prop;
	private DriverFactory driverFactory;
	WebDriver driver;

	@Before(order = 0)
	public void getProperty() {
		configreader = new ConfigReader();

		prop = configreader.initializeprop();

	}

	@Before(order = 1)
	public void lunchBrowser() {

		String browsername_propertiesfile = prop.getProperty("browser"); //Browser name coming from the property file
		String broswer_maven=System.getProperty("browser"); //Browser name coming from maven
		
		//result=testCondition ? value1 :value2
		
		String browsername=broswer_maven!=null ? broswer_maven : browsername_propertiesfile;

		driverFactory = new DriverFactory();

		driver = driverFactory.init_driver(browsername);

	}

	@After(order = 0)
	public void quitdriver() {
		driver.quit();

	}

	@After(order = 1) //For After annotaion Order-1 run prior to order 0
	public void teardown(Scenario scenario) {
		if (scenario.isFailed()) {

			// Take Screenshot

			String screeshotName = scenario.getName().replaceAll(" ", "_");

			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screeshotName);

		}

	}

}
