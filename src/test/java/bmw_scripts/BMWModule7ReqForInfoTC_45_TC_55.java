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



public class BMWModule7ReqForInfoTC_45_TC_55 {
	static WebDriver driver;
	MethodLibrary methodLibrary_object;
	public static Logger log = LogManager.getLogger(BMWModule7ReqForInfoTC_45_TC_55.class.getName());

	@BeforeClass
	public void beforeClass() throws IOException, InterruptedException {

		log.info("driver is initialised");

		Base base = new Base();
		driver = base.invokeBrowser();

		methodLibrary_object=new MethodLibrary(driver, log);
		Thread.sleep(2000);
		
	}

	@Test
	public void Request_For_Info() throws InterruptedException, IOException {

		//Method Lib fun
		methodLibrary_object.Request_For_Info();
		log.info("test successfull");
	}
	
	@AfterClass
	public void afterClass() {

		driver.close();
		driver = null;
		log.info("driver closed");
	}

}
