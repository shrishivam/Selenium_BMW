/*********************
Application Name: https://www.bmw.in/en/
Case Study Name : Searching Your Dream Car
Package Name:bmw_scripts
Script Name: BMW_TC_003
Script Description: Main script to be executed.
Date Of Creation: 19/4/2020
Author Name:Sadiq Mehmood Ansari
Employee ID:855396
 *********************/
package bmw_scripts;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import bmw_methodlib.MethodLibrary;
import bmw_pageobjects.LandingPage;
import bmw_utilities.Base;
import bmw_utilities.WritetoExcel;

public class BMWModule6EMICalculator {

	static WebDriver driver;
	public static Logger log = LogManager.getLogger(BMWModule6ClickOnFinance.class.getName());
	public Base base;

	@BeforeClass
	public void beforeClass() throws IOException {
		log.info("driver is initialised");
		base = new Base();
		driver = base.invokeBrowser();

	}

	// ClaculateEMI
	@Test
	public void EMICalculate() throws InterruptedException, IOException {

		MethodLibrary ml = new MethodLibrary(driver, log);

		ml.clickOnFinance();
		Thread.sleep(1000);
		ml.CalculateEMI();
		Thread.sleep(1000);
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
		driver = null;
		log.info("driver closed");
	}
}
