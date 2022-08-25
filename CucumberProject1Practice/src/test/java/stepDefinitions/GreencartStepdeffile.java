package stepDefinitions;

import java.util.HashMap;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.qa.cart.Base.TestBase;
import com.qa.cart.pages.GreenCartSearchPage;
import com.qa.cart.pages.OffersDealsPage;
import com.qa.cart.utility.TestContexSetup;
import com.qa.cart.utility.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GreencartStepdeffile extends TestBase {

	TestBase ts = new TestBase();
	GreenCartSearchPage gc;
	OffersDealsPage od;
	HashMap<String, WebElement> webelements;
	Utility ut = new Utility();
	String expectedprodname;
	TestContexSetup testcontex;
	// Dependecy Ijection-Shared variable between the Stepdefination files
	//DEpendecy Picoconatiner has been implemented in POM.xml file

	public GreencartStepdeffile(TestContexSetup testcontex) {

		this.testcontex = testcontex;
	}

	@Given("User is on Greencart Landing page")
	public void user_is_on_greencart_landing_page() throws Exception {

		ts.initialization();

	}

	@When("User search with the Short name {string} and extracted actual name of the product")
	public void user_search_with_the_short_name_and_extracted_actual_name_of_the_product(String shortname)
			throws Exception {
		gc = new GreenCartSearchPage();
		gc.searchItem(shortname);
		Thread.sleep(2000);
		testcontex.expectedprodname = gc.productName();

	}
	
	@When("^User search with the Short name with (.+) and extracted actual name of the product$")
	public void user_search_with_the_short_namewith_and_extracted_actual_name_of_the_product(String shortname)
			throws Exception {
		gc = new GreenCartSearchPage();
		gc.searchItem(shortname);
		Thread.sleep(2000);
		testcontex.expectedprodname = gc.productName();

	}

}