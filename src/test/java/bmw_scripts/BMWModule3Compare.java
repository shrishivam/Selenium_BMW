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

public class BMWModule3Compare {
	
	static WebDriver driver;
	public static Logger log = LogManager.getLogger(BMWModule3BuildYourBMW.class.getName());
	MethodLibrary ml = null;
	Base base = null;
	
	@BeforeClass
	public void beforeClass() throws IOException {

		//log.info("driver is initialised");
 
		base = new Base();
		driver = base.invokeBrowser();
		ml = new MethodLibrary(driver, log);
		
		//WritetoExcel.logData("driver is initialised",0,0);  //Writing result to excel sheet.
	}
	
	@Test
	public void compare() throws IOException, InterruptedException {
		
		ml.clickOnModel();
		ml.clickOnBuildYourBMW();
		ml.clickOnCompare();
		ml.compareSeries7Sedan();
		ml.compareSeriesM2();
		ml.clickOnCompareButton();
		ml.getComparedCarParameter();
		ml.getComparedCarParameterType();
		ml.getComparedCar1Name();
		ml.getComparedCar1Value();
		ml.getComparedCar2Name();
		ml.getComparedCar2Value();
		
	}
	
	
	
	
	
	@AfterClass
	public void afterClass() {

		driver.quit();
		driver = null;
		log.info("driver closed");
	}

	

}
