package bmw_scripts;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import bmw_methodlib.MethodLibrary;
import bmw_utilities.Base;



public class BMWModule2NeedAnalyzer {
	static WebDriver driver;
	public static Logger log = LogManager.getLogger(BMWModule2NeedAnalyzer.class.getName());
	MethodLibrary ml = null;
	Base base = null;
	
	@BeforeClass
	public void beforeClass() throws IOException {

		log.info("driver is initialised");
 
		base = new Base();
		driver = base.invokeBrowser();
		ml = new MethodLibrary(driver, log);
		
		//WritetoExcel.logData("driver is initialised",0,0);  //Writing result to excel sheet.
	}

	@Test
	public void needAnalyzer() throws InterruptedException, IOException, InvalidFormatException {
		
		ml.clickOnModel();
		
		ml.clickOnAllModels();
		
		ml.clickOnNeedAnalyzer();
		
		ml.validateNeedAnalyzer();
		
	}

	@AfterClass
	public void afterClass() {

		driver.quit();
		driver = null;
		log.info("driver closed");
	}


}
