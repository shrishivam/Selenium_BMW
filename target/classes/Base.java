package bmw_utilities;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;




/**
 * 
 * @author sarthak-pc
 *
 */
public class Base {

	
	static WebDriver driver;
	public DriverProperties prop;

	public WebDriver invokeBrowser() throws IOException {
		
		
		//********************* Setting new download directory path***************
		Map<String, Object> prefs = new HashMap<String, Object>();
		
		//********* Use File.separator as it will work on any OS************
		prefs.put("download.default_directory",
				System.getProperty("user.dir") + File.separator + "fileUtilities" + File.separator + "reports");
		
		//**************Adding capabilities to ChromeOptions*******************
		ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);

		prop = new DriverProperties();

		System.setProperty(prop.getWebdriver(), prop.getDriverpath()); 

		if (prop.getBrowser().equals("chrome")) {

			driver = new ChromeDriver(options);
		}

		else if (prop.getBrowser().equals("firefox")) {

			driver = new FirefoxDriver();
		}

		else {
			driver = new ChromeDriver();

		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getUrl());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;
	}

	
	public void getScreenshot( String screenshotId) throws IOException {

		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File DestFile = new File("./fileUtilities/screenshots/" + screenshotId + ".jpg");
		// Copy file at destination
		Files.copy(file, DestFile);

		// System.out.println(screenshot);
	}
}
