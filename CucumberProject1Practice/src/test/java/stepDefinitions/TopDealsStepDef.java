package stepDefinitions;

import java.util.HashMap;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.qa.cart.Base.TestBase;
import com.qa.cart.pages.GreenCartSearchPage;
import com.qa.cart.pages.OffersDealsPage;
import com.qa.cart.utility.TestContexSetup;
import com.qa.cart.utility.Utility;

import io.cucumber.java.en.Then;

public class TopDealsStepDef extends TestBase{
	
	TestBase ts=new TestBase();
	GreenCartSearchPage gc;
	OffersDealsPage od;
	HashMap<String,WebElement> webelements;
	Utility ut=new Utility();
	String expectedprodname;
	TestContexSetup testcontex;
	
	public TopDealsStepDef(TestContexSetup testcontex) {

		this.testcontex = testcontex;
	}

	
	@Then("User Search for the same short name {string} in the offer page")
	public void user_search_for_the_same_short_name_in_the_offer_page(String string) {
		gc=new GreenCartSearchPage();
		od=new OffersDealsPage();
		webelements=gc.getgreenCartWebElements();
		webelements.get("topdeals_link").click();
		ut.movingtochildwindow();
		od.searchItem(string);

	}
	@Then("Check if the product exists")
	public void check_if_the_product_exists() {
	  String actualProdname=od.productName();
	 Assert.assertEquals(testcontex.expectedprodname, actualProdname);
	  
	  
	  
	}
	@Then("^User Search for the same short name with (.+) in the offer page$")
	public void user_search_for_the_same_short_namewith_in_the_offer_page(String string) {
		gc=new GreenCartSearchPage();
		od=new OffersDealsPage();
		webelements=gc.getgreenCartWebElements();
		webelements.get("topdeals_link").click();
		ut.movingtochildwindow();
		od.searchItem(string);

	}

}
