/*********************
Package Name:bmw_scripts
Script Name:BMWModule6ClickOnFinance
Script Description: Main script to be executed.
Date Of Creation: 19/4/2020
Author Name:Sadiq Mehmood Ansari
Employee ID:855396
 *********************/
package bmw_scripts;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import bmw_methodlib.MethodLibrary;
import bmw_pageobjects.LandingPage;
import bmw_utilities.Base;
import bmw_utilities.WritetoExcel;



public class BMWModule6ClickOnFinance {
	static WebDriver driver;
	public static Logger log = LogManager.getLogger(BMWModule6ClickOnFinance.class.getName());
	public Base base;
	static MethodLibrary ml;
	public LandingPage landp;
	@BeforeClass
	public void beforeClass() throws IOException {
		log.info("driver is initialised");
		base = new Base();
		driver = base.invokeBrowser();
		ml=new MethodLibrary(driver, log);

	}
//ClickonFinance
	@Test 
	public void toClickonFinance() throws Throwable {
		ml.clickOnFinance();   //Click on finance
		log.info("Clicked on finance");
		base.getScreenshot("Click on Finance");	
	}

	@AfterClass
	public void afterClass() {

		driver.close();
		driver = null;
		log.info("driver closed");
	}

}
