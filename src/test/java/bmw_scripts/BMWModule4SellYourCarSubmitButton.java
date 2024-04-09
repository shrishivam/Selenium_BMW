package bmw_scripts;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import bmw_methodlib.MethodLibrary;
import bmw_utilities.Base;

public class BMWModule4SellYourCarSubmitButton {

	static WebDriver driver;
	public static Logger log = LogManager.getLogger(BMWModule3BuildYourBMW.class.getName());
	MethodLibrary ml = null;
	Base base = null;

	@BeforeClass
	public void beforeClass() throws IOException {

		// log.info("driver is initialised");

		base = new Base();
		driver = base.invokeBrowser();
		ml = new MethodLibrary(driver, log);

		// WritetoExcel.logData("driver is initialised",0,0); //Writing result to excel
		// sheet.
	}

	@Test
	public void SellYourCarSubmit() throws IOException, InterruptedException {

		ml.clickOnModel();
		ml.clickOnUsedCars();
		ml.clickOnSellYourCar();
		new Actions(driver).sendKeys(Keys.PAGE_DOWN).build().perform();
		ml.validateSellYourCarSubmitButton();
	}

	@AfterClass
	public void afterClass() {

		driver.quit();
		driver = null;
		log.info("driver closed");
	}

}
