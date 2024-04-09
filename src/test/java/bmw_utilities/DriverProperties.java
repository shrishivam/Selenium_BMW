package bmw_utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Reading WebDriver Properties
 * 
 * @author sarthak-pc
 *
 */
public class DriverProperties {

	private String url;
	private String webdriver;
	private String driverpath;
	private String browser;

	public String getUrl() {
		return url;
	}

	public String getWebdriver() {
		return webdriver;
	}

	public String getDriverpath() {
		return driverpath;
	}

	public String getBrowser() {
		return browser;
	}

	public DriverProperties() throws IOException {

		FileReader file = new FileReader("src/test/resources/property_files/WebDriver.properties");
		Properties prop = new Properties();

		prop.load(file);

		url = prop.getProperty("Url");
		driverpath = prop.getProperty("driverpath");
		webdriver = prop.getProperty("webdriver");
		browser = prop.getProperty("browser");

	}

}
