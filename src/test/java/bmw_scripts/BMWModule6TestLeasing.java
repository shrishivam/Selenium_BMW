/*********************
Application Name: https://www.bmw.in/en/
Case Study Name : Searching Your Dream Car
Package Name:bmw_scripts
Script Name: BMWModule6TestLeasing
Script Description: Main script to be executed.
Date Of Creation: 19/4/2020
Author Name:Sadiq Mehmood Ansari
Employee ID:855396
 *********************/
package bmw_scripts;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import bmw_methodlib.MethodLibrary;
import bmw_pageobjects.LandingPage;
import bmw_utilities.Base;

public class BMWModule6TestLeasing{
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

  @Test
  public void ferifyLeasing() throws IOException, InterruptedException {
	  ml.clickOnFinance(); 
	  ml.TestLeasing();
  }
  
	@AfterClass
	public void afterClass() {
		driver.quit();
		driver = null;
		log.info("driver closed");
	}
}
