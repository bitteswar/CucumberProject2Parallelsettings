package com.qa.cart.pages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.cart.Base.TestBase;

public class GreenCartSearchPage extends TestBase {

	HashMap<String, WebElement> webelemap = new HashMap();

	@FindBy(xpath = "//input[@class='search-keyword']")
	WebElement search_textbox;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement search_button;

	@FindBy(xpath = "//h4[@class='product-name']")
	WebElement productname;

	@FindBy(xpath = "//a[contains(text(),'Top Deals')]")
	WebElement topdeals_link;

	public GreenCartSearchPage() {

		PageFactory.initElements(driver, this);
	}

	public void searchItem(String shortname) {
		

		search_textbox.sendKeys(shortname);

	}

	public String productName() {
		String prodName = productname.getText().split("-")[0].trim();
		return prodName;

	}

	public HashMap<String, WebElement> getgreenCartWebElements() {
		webelemap.put("search_textbox", search_textbox);
		webelemap.put("search_button", search_button);
		webelemap.put("productname", productname);
		webelemap.put("topdeals_link", topdeals_link);

		return webelemap;

	}

}
