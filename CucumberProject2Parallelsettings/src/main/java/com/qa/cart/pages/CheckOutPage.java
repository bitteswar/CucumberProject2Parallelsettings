package com.qa.cart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.cart.utility.Utility;



public class CheckOutPage {
	private WebDriver driver;
	
	Utility ut;
	public CheckOutPage(WebDriver driver) {

		this.driver = driver;
		ut=new Utility(driver);
	
	}	
	private String expectedproduct;
	
	private By productname = By.xpath("//p[@class='product-name']");
	
	
	public String productnameverify() {
		
		
		if( ut.elementvisible(driver.findElement(productname), 3)) {
			
			 expectedproduct = driver.findElement(productname).getText().split("-")[0].trim();
		}
		 
		return expectedproduct;
		 
	}
	
	
	
	
	

}
