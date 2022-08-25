package com.qa.factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public WebDriver driver;

	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

	public WebDriver init_driver(String browser) {
		System.out.println("browser value is:: " + browser);
		if (browser.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();

			tlDriver.set(new ChromeDriver());
		} else if (browser.equalsIgnoreCase("FF")||browser.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
		}

		else {
			System.out.println("Please pass the correct browser value:: " + browser);

		}
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		return getDriver();

	}
	/**
	 * This method is used to return the Driver through the threadlocal driver
	 * @return
	 */
	

	public static synchronized WebDriver getDriver() {
		return tlDriver.get();

	}

}
