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

public class BMWModule4NewCar {

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
	public void NewCar() throws IOException, InterruptedException {

		ml.clickOnModel();
		ml.clickOnUsedCars();
		ml.clickOnNewCar();

		ml.switchToChildWindow();
		new Actions(driver).sendKeys(Keys.PAGE_DOWN).build().perform();
		new Actions(driver).sendKeys(Keys.PAGE_DOWN).build().perform();
		new Actions(driver).sendKeys(Keys.PAGE_DOWN).build().perform();
		ml.selectSeries7NewCar();

		ml.getNewCarSeries7ThirdModelName();
		ml.getNewCarSeries7ThirdModelPrice();
		ml.getNewCarSeries7ThirdModelFeaturesClick();
		ml.getNewCarSeries7ThirdModelFeatures();
		ml.clickOnCheckAvailabilty();
		ml.fillNewCarForm();
		ml.getAvailability();
	}

	@AfterClass
	public void afterClass() {

		driver.quit();
		driver = null;
		log.info("driver closed");
	}

}
