package stepDefinitions;

import java.util.HashMap;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.qa.cart.pages.GreenCartSearchPage;
import com.qa.cart.pages.OffersDealsPage;
import com.qa.cart.utility.ConfigReader;
import com.qa.cart.utility.TestContexSetup;
import com.qa.cart.utility.Utility;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;

public class GreencartStepdeffile {

	GreenCartSearchPage gc;
	OffersDealsPage od;
	HashMap<String, WebElement> webelements;
	Utility ut = new Utility(DriverFactory.getDriver());
	String expectedprodname;
	TestContexSetup testcontex;
	ConfigReader configreader;
	Properties prop;
	// Dependecy Ijection-Shared variable between the Stepdefination files
	// DEpendecy Picoconatiner has been implemented in POM.xml file

	public GreencartStepdeffile(TestContexSetup testcontex) {

		this.testcontex = testcontex;
		gc = new GreenCartSearchPage(DriverFactory.getDriver());
	}

	@Given("User is on Greencart Landing page")
	public void user_is_on_greencart_landing_page() throws Exception {
		configreader = new ConfigReader();
		prop = configreader.initializeprop();
		String URL = prop.getProperty("url");

		DriverFactory.getDriver().get(URL);

	}

	@When("User search with the Short name {string} and extracted actual name of the product")
	public void user_search_with_the_short_name_and_extracted_actual_name_of_the_product(String shortname)
			throws Exception {

		gc.searchItem(shortname);
		Thread.sleep(2000);
		testcontex.expectedprodname = gc.productName();

	}

	@When("^User search with the Short name with (.+) and extracted actual name of the product$")
	public void user_search_with_the_short_namewith_and_extracted_actual_name_of_the_product(String shortname)
			throws Exception {

		gc.searchItem(shortname);
		Thread.sleep(2000);
		testcontex.expectedprodname = gc.productName();

	}

	@When("Added {string} Items of the selected product to cart")
	public void added_items_of_the_selected_product_to_cart(String string) throws InterruptedException {
		gc.increment(Integer.parseInt(string));
		Thread.sleep(1000);

	}

}
