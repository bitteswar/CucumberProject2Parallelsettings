package com.qa.cart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersDealsPage {

	private By offer_search_textbox = By.xpath("//input[@id='search-field']");
	private By offer_productname = By.xpath("//tbody/tr/td[1]");

	private WebDriver driver;

	public OffersDealsPage(WebDriver driver) {

		this.driver = driver;
	}

	public void searchItem(String productname) {

		driver.findElement(offer_search_textbox).sendKeys(productname);

	}

	public String productName() {
		String prodName = driver.findElement(offer_productname).getText();
		return prodName;

	}
}
