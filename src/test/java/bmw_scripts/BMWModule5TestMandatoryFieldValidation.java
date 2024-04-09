package bmw_scripts;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import bmw_methodlib.MethodLibrary;
import bmw_utilities.Base;

public class BMWModule5TestMandatoryFieldValidation {

	static WebDriver driver;
	public static Logger log = LogManager.getLogger(BMWTest.class.getName());

	@BeforeClass
	public void beforeClass() throws IOException {

		log.info("driver is initialised");

		Base base = new Base();
		driver = base.invokeBrowser();

	}

	@Test
	public void testMandatoryFieldValidation() throws InterruptedException, IOException {

		MethodLibrary lib = new MethodLibrary(driver, log);

		lib.mandatoryFieldValidation();

	}

	@AfterClass
	public void afterClass() {

		driver.close();
		driver.quit();
		driver = null;
		log.info("driver closed");
	}
}
