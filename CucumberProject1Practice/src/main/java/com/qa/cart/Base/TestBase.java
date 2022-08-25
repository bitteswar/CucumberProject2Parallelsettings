package com.qa.cart.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static Properties prop;
	public static WebDriver driver;

	public TestBase() {
		prop = new Properties();

		FileInputStream fl;
		try {
			fl = new FileInputStream(System.getProperty("user.dir") + "//src//main//java//com//qa//cart//properties//config.properties");
			prop.load(fl);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void initialization() throws Exception {

		String browsername = prop.getProperty("browser");
		String URL=prop.getProperty("url");
		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();

		}
		else if (browsername.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe");
			driver = new ChromeDriver();

		}
		else if (browsername.equalsIgnoreCase("ff")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe");
			driver = new ChromeDriver();

		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(URL);
		Thread.sleep(5000);

	}

}
