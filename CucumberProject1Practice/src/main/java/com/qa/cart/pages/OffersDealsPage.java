package com.qa.cart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.cart.Base.TestBase;

public class OffersDealsPage extends TestBase{
	
	@FindBy(xpath="//input[@id='search-field']")
	WebElement offer_search_textbox;
	

	
	@FindBy(xpath="//tbody/tr/td[1]")
	WebElement offer_productname;

public OffersDealsPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void searchItem(String productname) {
		
		offer_search_textbox.sendKeys(productname);
		
	}
	
	public String productName() {
		String prodName=offer_productname.getText();
		return prodName;
		
	}
}
