package bmw_scripts;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import bmw_methodlib.MethodLibrary;
import bmw_utilities.Base;


public class BMWModule5TestAllLinks {
	
	static WebDriver driver;
	public static Logger log = LogManager.getLogger(BMWTest.class.getName()); 

	@BeforeClass
	public void beforeClass() throws IOException {

		log.info("driver is initialised");
		
		Base base = new Base(); 
		driver = base.invokeBrowser();
		
		
	}
	
	@Test
	public void testServicesTabs() throws InterruptedException, IOException {

	
		MethodLibrary lib = new MethodLibrary(driver,log);
		
		
		lib.testServicesAndWarranty();
		lib.testBMWLifeStyle();
		lib.testBMWAccessories();
		lib.testBMWApps();
		
	
	}

	@AfterClass
	public void afterClass() {

		driver.close();
		driver = null;
		log.info("driver closed");
	}

}
