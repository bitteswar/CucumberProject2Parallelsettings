package stepDefinations;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {

	@Given("^user is in landing page$")
	public void user_is_in_landing_page() {
		System.out.println("user is in landing page");
	}

	@When("^User logged in to application with username and password$")
	public void user_logged_in_to_application_with_username_and_password() {
		System.out.println("User logged in to application with username and password");
	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() {
		System.out.println("Home page is populated");
	}

	@And("^pages are displayed$")
	public void pages_are_displayed() {
		System.out.println("pages are displayed");

	}

//Regular expression
	@When("^User logged in to application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_logged_in_to_application_with_something_and_password_something(String strArg1, String strArg2)
			throws Throwable {
		System.out.println(strArg1 + " and " + strArg2);

	}

	// Regular expression
	@And("^pages are displayed \"([^\"]*)\"$")
	public void pages_are_displayed_something(String strArg1) throws Throwable {
		System.out.println(strArg1);
	}

//Data Table
	@When("^User enters data with following details$")
	public void user_enters_data_with_following_details(DataTable data) throws Throwable {

		List<List<String>> obj = data.asLists();
		System.out.println(obj.get(0).get(0));
		System.out.println(obj.get(0).get(1));
		System.out.println(obj.get(0).get(2));
		System.out.println(obj.get(0).get(3));

	}

	// parameterization and Scenario Outline with @Examples tag

	@When("^User enters data with following (.+) and (.+)$")
	public void user_enters_data_with_following_and(String userid, String password) throws Throwable {
		System.out.println(userid + " and " + password);
	}

	// BackgRound Scenarios

	@Given("^Validate the browser$")
	public void validate_the_browser() throws Throwable {
		System.out.println("Validate the browser");
	}

	@When("^Browser is Triggered$")
	public void browser_is_triggered() throws Throwable {
		System.out.println("Browser is Triggered");
	}

	@Then("^URL is Lunched$")
	public void url_is_lunched() throws Throwable {
		System.out.println("URL is Lunched");
	}

}
