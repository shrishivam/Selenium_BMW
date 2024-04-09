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
public class BMWModule1InvokeBrowserTC_001 {
	
	public MethodLibrary Method_Library_object;
	static WebDriver driver;
	public static Logger log = LogManager.getLogger(BMWModule1InvokeBrowserTC_001.class.getName());

	@BeforeClass
	public void beforeClass() throws IOException {

		log.info("driver is initialised");
		Base base = new Base();
		driver = base.invokeBrowser();
		Method_Library_object = new MethodLibrary(driver,log);
	}
	
	@Test
	public void BMW_Invoke_Correct_Application() throws InterruptedException, IOException {

		Method_Library_object.Home_Page_Validation_Module_TC001();		
	}
	@AfterClass
	public void afterClass() {

		driver.close();
		driver = null;
		log.info("driver closed");
	}
}
