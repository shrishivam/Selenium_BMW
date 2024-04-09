package bmw_scripts;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import bmw_methodlib.MethodLibrary;
import bmw_pageobjects.LandingPage;
import bmw_utilities.Base;
import bmw_utilities.ReadFromExcel;
import bmw_utilities.WritetoExcel;



public class BMWTest {
	static WebDriver driver;
	public static Logger log = LogManager.getLogger(BMWTest.class.getName());

	@BeforeClass
	public void beforeClass() throws IOException {

		log.info("driver is initialised");
		
		Base base = new Base();
		driver = base.invokeBrowser();
		
		//WritetoExcel.logData("driver is initialised",0,0);  //Writing result to excel sheet.
	}

	@Test
	public void testServicesTabs() throws InterruptedException, IOException {

	/*	
		driver.findElement(By.linkText("BMW World")).click();

		WebElement tech = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/div/div[2]/div[2]/div[4]/div/div[1]/div[4]"));
		System.out.println(tech.isDisplayed());
		Thread.sleep(2000);
		new Actions(driver).moveToElement(tech).build().perform();
		Thread.sleep(2000);
	*/
		//System.out.println();
		
	} 

	@AfterClass
	public void afterClass() {

		
		driver.close();
		driver.quit();
		driver = null;
		log.info("driver closed");
	}

}
