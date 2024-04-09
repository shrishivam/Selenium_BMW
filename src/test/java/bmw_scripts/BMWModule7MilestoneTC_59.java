package bmw_scripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import bmw_methodlib.MethodLibrary;
import bmw_utilities.Base;




public class BMWModule7MilestoneTC_59 {
	static WebDriver driver;
	MethodLibrary methodLibrary_object;
	public static Logger log = LogManager.getLogger(BMWModule7MilestoneTC_59.class.getName());

	@BeforeClass
	public void beforeClass() throws IOException {

		log.info("driver is initialised");

		Base base = new Base();
		driver = base.invokeBrowser();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		methodLibrary_object=new MethodLibrary(driver, log);
		
	}

	@Test
	public void testMilestonesValues() throws InterruptedException, IOException {

		//Method Lib fun
		methodLibrary_object.BMW_Milestone();
		
		log.info("test successfull");
	}
	
	@AfterClass
	public void afterClass() {

		driver.close();
		driver = null;
		log.info("driver closed");
	}

}
