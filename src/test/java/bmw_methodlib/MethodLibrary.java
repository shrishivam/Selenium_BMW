package bmw_methodlib;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import bmw_pageobjects.AllModels;
import bmw_pageobjects.BMWErrorPage;
import bmw_pageobjects.BMWJoyRewards;
import bmw_pageobjects.BMWJoyRewardsRegistrationPage;
import bmw_pageobjects.BMWLifestyleAndGadgets;
import bmw_pageobjects.BMW_JoyFest;
import bmw_pageobjects.BRIPackageStatus;
import bmw_pageobjects.CarCareProducts;
import bmw_pageobjects.ChooseBMWToBuild;
import bmw_pageobjects.CompareModels;
import bmw_pageobjects.Consumption_Emission;
import bmw_pageobjects.DealerLocatorPage;
import bmw_pageobjects.EMIPage;
import bmw_pageobjects.FeaturesToBuildBMW;
import bmw_pageobjects.Inspire;
import bmw_pageobjects.LandingPage;
import bmw_pageobjects.LeasingPage;
import bmw_pageobjects.LoanPage;
import bmw_pageobjects.NeedAnalyzer;
import bmw_pageobjects.NewCar;
import bmw_pageobjects.NewCarModels;
import bmw_pageobjects.Request_For_Info;
import bmw_pageobjects.SellYourCar;
import bmw_pageobjects.TechnicalData;
import bmw_pageobjects.UsedCars;
import bmw_pageobjects.UsedCarsDetails;
import bmw_utilities.Base;
import bmw_utilities.ReadFromExcel;

import bmw_utilities.WritetoExcel;

/**
 * 
 * @author team01
 *
 * 
 */
public class MethodLibrary extends Base { 

	public WebDriver driver;
	static Logger log;
 
	// *********page objects***************
	LandingPage lp = null;

	WebDriverWait wait;

	Map<String, String> featuresData = new HashMap<String, String>();
	Map<String, String> technicalData = new HashMap<String, String>();
	Map<String, String> needAnalyzerData = new HashMap<String, String>();
	Map<String, String> comparedCarData = new HashMap<String, String>();
	Map<String, String> usedCarData = new HashMap<String, String>();
	Map<String, String> newCarData = new HashMap<String, String>();
	Map<String, String> sellYourCarData = null;

	public MethodLibrary(WebDriver driver, Logger log) {

		this.driver = driver;
		this.log = log;
		lp = new LandingPage(driver);
		wait = new WebDriverWait(driver, 20);

	}

	// **************Module 1 methods***************

	/**
	 * @author Samdras
	 * @throws InterruptedException
	 * @throws IOException
	 *             Home Page Validation Function where we match the Title of the
	 *             homepage
	 */
	public void Home_Page_Validation_Module_TC001() throws InterruptedException, IOException {
		Title_Validation(driver.getTitle(), "en_IN"); // Title validation
		log.info("Landing Page Title Matched: Successfully Run TC_001: BMW_Invoke_Correct_Application"); // Message
																											// after
																											// Testcase
																											// Pass
	}

	/**
	 * @author Samdras
	 * @throws InterruptedException
	 * @throws IOException
	 *             Method to Check the Four option available or not
	 */
	public void Four_Header_option_Library_Module_TC002() throws InterruptedException, IOException {

		lp.Click_on_Model().click();
		getScreenshot("Click_on_Model");
		log.info("Model Option Avialable");
		Thread.sleep(1000);

		lp.Click_on_Services().click();
		getScreenshot("Click_on_Services");
		log.info("Services Option Avialable");
		Thread.sleep(1000);

		lp.Click_on_Finance().click();
		getScreenshot("Click_on_Finance");
		log.info("Finance Option Avialable");
		Thread.sleep(1000);

		lp.Click_on_BMWWorld().click();
		getScreenshot("Click_on_BMWWorld");
		log.info("BMWWorld Option Avialable");
		Thread.sleep(1000);

		log.info("BMWWorld Option Avialable: Successfully Run TC_002: Four_header_Options"); // Message after Testcase
																								// Pass
	}

	/**
	 * @author Samdras
	 * @throws InterruptedException
	 * @throws IOException
	 *             Method to Check the Image Slider available or not
	 */
	public void Image_Slider_Check_Module_TC003() throws InterruptedException, IOException {

		lp.Click_on_Imageslider1().click();
		getScreenshot("Image_Slider_1");
		Thread.sleep(1000);
		lp.Click_on_Imageslider2().click();
		getScreenshot("Image_Slider_2");
		Thread.sleep(1000);
		lp.Click_on_Imageslider3().click();
		getScreenshot("Image_Slider_3");
		Thread.sleep(1000);
		lp.Click_on_Imageslider4().click();
		getScreenshot("Image_Slider_4");
		Thread.sleep(1000);

		log.info(" Images Slider Present: Successfully Run TC_003: Images Slider Present"); // Message after Testcase
																							// Pass
	}

	/**
	 * @author user Samdras
	 * @throws InterruptedException
	 * @throws IOException
	 *             Method to Check the BMW Logo
	 */
	public void BMW_Logo_Check_Module_TC004() throws InterruptedException, IOException {

		lp.Click_on_BMW_Logo().click();
		getScreenshot("BMW_Logo");
		Thread.sleep(1000);

		log.info("BMW Logo Avialable: Successfully Run TC_004: BMW_Logo_Check");
	}

	/**
	 * @author Samdras
	 * @throws InterruptedException
	 * @throws IOException
	 *             Method to Check the Dealer Logo and Enter Dealer Locator
	 */
	public void Dealer_Locator_Logo_Check_Module_TC005() throws InterruptedException, IOException {

		lp.Click_on_Dealer_locator_Logo().click();
		getScreenshot("Dealer_Locator_Logo");
		log.info("Dealer Locator Logo Avialable");
		Thread.sleep(1000);

		Title_Validation(driver.getTitle(), "Find a Dealer"); // Title validation
		log.info("Dealer Locator Page Title Matched");

		DealerLocatorPage dealerLocator = new DealerLocatorPage(driver);

		dealerLocator.Current_location_Delar_Locator().click();
		dealerLocator.Current_location_Delar_Locator().sendKeys(
				"India Gate, Rajpath, India Gate, New Delhi, Delhi, IndiaIndia Gate, Rajpath, India Gate, New Delhi, Delhi, India");
		Thread.sleep(1000);
		dealerLocator.Search_Delar_Locator().click();
		Thread.sleep(2000);

		log.info("Successfully Run TC_005: Dealer_Locator_Logo_Checking"); // Message after Testcase Pass
	}

	/**
	 * @author Samdras
	 * @throws InterruptedException
	 * @throws IOException
	 *             Method to Check the Test Drive Logo
	 */
	public void Test_Drive_Logo_Check_Module_TC006() throws InterruptedException, IOException {

		lp.Click_on_Test_Drive_Logo().click();
		getScreenshot("Test_Drive_Logo");
		log.info("Test Drive Logo Avialable");
		Thread.sleep(1000);

		Title_Validation(driver.getTitle(), "BMW India Test Drive Request"); // Title validation
		log.info("Test Drive Page Title Matched: Successfully Run TC_006: Test_Drive_Logo_Checking"); // Message after
																										// Testcase Pass
	}

	/**
	 * @author Samdras
	 * @throws InterruptedException
	 * @throws IOException
	 *             Method to Check Series available
	 */
	public void Series_Check_Module_TC007() throws InterruptedException, IOException {

		try {
			getAssert(lp.Click_on_Series().isDisplayed(), "series link");
			lp.Click_on_Series().click();
			getScreenshot("Series_Click_Landing_Page");
			log.info("series link found and clicked");
			
		}
		catch(Exception e) {
			
			log.error("series link not found");
		}
		
		

	
	}

	/**
	 * @author Samdras
	 * @throws InterruptedException
	 * @throws IOException
	 *             Method to Check BodyType available
	 */
	public void BodyType_Check_Module_TC008() throws InterruptedException, IOException {

		try {
			getAssert(lp.Click_on_BodyType().isDisplayed(), "series link");
			lp.Click_on_BodyType().click();
			getScreenshot("body_type_Landing_Page");
			log.info("Body type link found and clicked");
			
		}
		catch(Exception e) {
			
			log.error("Body Type link not found");
		}
		
	}

	/**
	 * @author Samdras
	 * @throws InterruptedException
	 * @throws IOException
	 *             Method to Check Image available
	 */
	public void Image_Check_Module_TC009() throws InterruptedException, IOException {

		Thread.sleep(2000);

		new Actions(driver).sendKeys(Keys.PAGE_DOWN).build().perform();
		new Actions(driver).sendKeys(Keys.PAGE_DOWN).build().perform();

		getAssert(lp.Display_Image1().isDisplayed(), "image1");
		getAssert(lp.Display_Image2().isDisplayed(), "image2");
		getAssert(lp.Display_Image3().isDisplayed(), "image3");
		getAssert(lp.Display_Image4().isDisplayed(), "image4");
		log.info("Images are Present");
		getScreenshot("BodyType_Click_Landing_Page");

	}

	/**
	 * @author Samdras
	 * @throws InterruptedException
	 * @throws IOException
	 *             Method to Check Outer Link available
	 */
	public void Outer_link_Check_Module_TC0010() throws InterruptedException, IOException {

		lp.Outerlink_dealer_xpath_Click().click();
		Thread.sleep(1000);
		getScreenshot("Dealer_outer_Link");
		log.info("Dealer outer Link is Working");
		driver.navigate().back();
		Thread.sleep(3000);

		lp.Outerlink_Request_TestDrive_xpath_Click().click();
		Thread.sleep(1000);
		getScreenshot("Request_Dealer_outer_Link");
		log.info("Request dealer outer Link is Working");

		lp.Outerlink_BMW_Excellence_Club_xpath_Click().click();
		Thread.sleep(1000);
		getScreenshot("BMW_Excellence_Club_outer_Link");
		log.info("BMW Excellence Club outer Link is Working");

		lp.Outerlink_Privacy_Policy_xpath_Click().click();
		Thread.sleep(1000);
		getScreenshot("Privacy_Policy_outer_Link");
		log.info("Privacy Policy outer Link is Working");

		log.info("Successfully Run TC_010: Outer Links are Present"); // Message after Testcase Pass
	}

	// *********************Module 2,3,4 Methods*********

	/**
	 * Created By = Shivam Srivastava Description = This method clicks on the Models
	 * tag on Homepage
	 * 
	 * @throws InterruptedException
	 */

	public void clickOnModel() throws InterruptedException {

		Thread.sleep(1000);
		lp.getNavModels().click();
		log.info("Clicked on Models element on Navigation bar");
		Thread.sleep(2000);
	}

	/**
	 * Created By = Shivam Srivastava
	 * 
	 * Description = This method clicks on the Discover All Models in Models tag on
	 * Homepage and also does the validation for title
	 * 
	 * @throws InterruptedException
	 */
	public void clickOnAllModels() throws InterruptedException {

		Thread.sleep(2000);

		Actions action = new Actions(driver);
		action.moveToElement(lp.getAllModels()).build().perform();

		String modelsUrl = lp.getAllModels().getAttribute("href");
		driver.get(modelsUrl);
		// lp.getAllModels().click();

		Thread.sleep(2000);
		log.info("Clicked on discover all models");
		String allModelsTitle = driver.getTitle();
		if (allModelsTitle.contains("All Models")) {

			log.info("We are on all Models page");
		} else {

			log.error("Not on all models page");
		}

	}

	/**
	 * Created By = Shivam Srivastava
	 * 
	 * Description = This method clicks on Series 7 Sedan Model and also validates
	 * the title
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 */

	public void clickOnSeries7() throws InterruptedException, IOException {

		Thread.sleep(2000);
		AllModels am = new AllModels(driver);

		Actions act = new Actions(driver);
		act.moveToElement(am.getSeriesModels());
		am.getSeriesModels().click();
		log.info("Clicked on model 7");

		String series7Title = driver.getTitle();

		if (series7Title.contains("BMW 7")) {

			log.info("We are on series 7 Model");
		} else {

			log.error("not on series 7 page");
		}

	}

	/**
	 * Created By = Shivam Srivastava
	 * 
	 * Description = This method clicks on the Technical Data tag on Inspire page
	 * 
	 * @throws InterruptedException
	 */

	public void clickOnTechData() throws InterruptedException {

		Thread.sleep(3000);
		Inspire ins = new Inspire(driver);

		wait.until(ExpectedConditions.elementToBeClickable(ins.getTechnicalData()));
		ins.getTechnicalData().click();
		log.info("Clicked on technical data");
	}

	/**
	 * Created By = Shivam Srivastava Description = This method fetches the
	 * technical data, i.e. Top Speed, of the Models and also writes the data into
	 * the excel
	 * 
	 * @throws InvalidFormatException
	 * @throws IOException
	 * @throws InterruptedException 
	 */

	public void fetchTopSpeed() throws InvalidFormatException, IOException, InterruptedException {
		
		Thread.sleep(3000);
		TechnicalData td = new TechnicalData(driver);
		new Actions(driver).sendKeys(Keys.PAGE_DOWN).build().perform();
		String topSpeed = td.getTopSpeed().getText();
		log.info("Fetched the top speed");
		System.out.println(topSpeed);

		technicalData.put("Top Speed", topSpeed);

		WritetoExcel.writeToExcel(technicalData, "ModelData");
		log.info("Written top speed in excel file");
	}

	/**
	 * Created By = Shivam Srivastava Description = This method clicks on the Need
	 * Analyzer Link
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void clickOnNeedAnalyzer() throws InterruptedException, IOException {

		Thread.sleep(2000);
		AllModels am = new AllModels(driver);

		Actions action = new Actions(driver);

		action.moveToElement(am.getNeedAnalyzer());

		Thread.sleep(2000);

		getScreenshot("AnalyzerLink");

		am.getNeedAnalyzer().click();

		log.info("Clicked on need analyzer");
	}

	/**
	 * Created By = Shivam Srivastava Description = This method validates the Need
	 * Analyzer page and if its the error page, it writes the error message into the
	 * excel file
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 */

	public void validateNeedAnalyzer() throws InterruptedException, IOException {

		Thread.sleep(8000);
		NeedAnalyzer na = new NeedAnalyzer(driver);

		String needAnalyzerError = na.getErrorMsg().getText();
		System.out.println("result " + na.getErrorMsg().getText());
		if (needAnalyzerError.trim().contains("LOST IN THE SYSTEM")) {

			needAnalyzerData.put("Error Message", needAnalyzerError);

			WritetoExcel.writeToExcel(needAnalyzerData, "NeedAnalyzer");
			log.error("Not loading Need Analyzer page");
			Assert.fail("Not loading Need Analyzer page");

		} else {

			log.info("On Need Analyzer page");
		}

	}

	/**
	 * Created By = Shivam Srivastava Description = This method clicks on the Build
	 * Your BMW in models tag on Home Page
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void clickOnBuildYourBMW() throws InterruptedException, IOException {

		Thread.sleep(2000);
		getScreenshot("BuildYourBMW");
		lp.getBuildYourBMW().click();
		log.info("Clicked on Build Your BMW");
		Thread.sleep(2000);

	}

	/**
	 * Created By = Shivam Srivastava Description = This method selects the BMW
	 * series 7 model to Build
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void selectSeries7ModelToBuild() throws InterruptedException, IOException {

		ChooseBMWToBuild bmwToBuild = new ChooseBMWToBuild(driver);

		getScreenshot("BuildSeries7Sedan");
		bmwToBuild.getBMW7SeriesSedan().click();
		log.info("Clicked on series 7 sedan model to build");
		Thread.sleep(10000);
	}

	/**
	 * Created By = Shivam Srivastava Description = This method selects the Diesel
	 * Engine on Features page
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 */

	public void selectDieselEngine() throws InterruptedException, IOException {

		FeaturesToBuildBMW features = new FeaturesToBuildBMW(driver);

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
		getScreenshot("Features");
		new Actions(driver).sendKeys(Keys.PAGE_DOWN).build().perform();
		features.getDieselEngine().click();
		log.info("Selected diesel engine");
		Thread.sleep(2000);
		getScreenshot("DieselEngine");
		String engineName = features.getDieselEngineName().getText();
		featuresData.put("Diesel Engine Name", engineName);
		log.info("Got the diesel engine name");

	}

	/**
	 * Created By = Shivam Srivastava Description = This method clicks on the
	 * Exterior tag on Features Page
	 * 
	 * 
	 * @throws InterruptedException
	 */
	public void clickOnExterior() throws InterruptedException {

		Thread.sleep(5000);
		FeaturesToBuildBMW features = new FeaturesToBuildBMW(driver);

		features.getExteriors().click();
		log.info("Clicked on exterior");
	}

	/**
	 * Created By = Shivam Srivastava Description = This method selects the Exterior
	 * Paint as BURGUNDY
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void selectExteriorPaint() throws InterruptedException, IOException {

		Thread.sleep(7000);
		FeaturesToBuildBMW features = new FeaturesToBuildBMW(driver);

		features.getExteriorBurgundyPaintImage().click();
		log.info("Selected Burgundy Paint");
		Thread.sleep(5000);
		getScreenshot("Paint");
		String paintName = features.getExteriorBurgundyPaintName().getText();
		log.info("Got the paint name");
		featuresData.put("Exterior Paint Name", paintName);
	}

	/**
	 * Created By = Shivam Srivastava Description = This method selects the RIMS
	 * type
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void selectRims() throws InterruptedException, IOException {

		FeaturesToBuildBMW features = new FeaturesToBuildBMW(driver);

		features.getRims().click();
		log.info("Clicked on rims");
		Thread.sleep(7000);
		getScreenshot("Rims");
		String rimsName = features.getRimsDetails().getText();
		log.info("Got the Rims name");
		featuresData.put("Rims Name", rimsName);

	}

	/**
	 * Created By = Shivam Srivastava Description = This method clicks on the
	 * Interior tag on Features Page
	 * 
	 * @throws InterruptedException
	 */
	public void clickOnInterior() throws InterruptedException {

		FeaturesToBuildBMW features = new FeaturesToBuildBMW(driver);

		features.getInteriors().click();
		log.info("Clicked on Interior");
		Thread.sleep(7000);

	}

	/**
	 * Created By = Shivam Srivastava Description = This method selects the
	 * UpHolstery on Features Page
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void selectUpHolstery() throws InterruptedException, IOException {

		FeaturesToBuildBMW features = new FeaturesToBuildBMW(driver);

		features.getInteriorsUpholsteryImage().click();
		log.info("Clicked on Upholstery");
		Thread.sleep(7000);
		getScreenshot("UpHolstery");
		String upHolsteryName = features.getInteriorsUpholsteryName().getText();
		log.info("Got the UpHolstery name");
		featuresData.put("UpHosltery Name", upHolsteryName);

	}

	/**
	 * Created By = Shivam Srivastava Description = This method selects the Trims on
	 * Features Page and Writes the configurated features data into the excel sheet
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 */

	public void selectTrims() throws InterruptedException, IOException {

		FeaturesToBuildBMW features = new FeaturesToBuildBMW(driver);

		features.getTrims().click();
		log.info("Clicked on trims");
		Thread.sleep(10000);
		getScreenshot("Trims");
		String trimsName = features.getTrimsName().getText();
		log.info("Got the Trims name");
		featuresData.put("Trim Name", trimsName);

		WritetoExcel.writeToExcel(featuresData, "Features");

	}

	/**
	 * Created By = Shivam Srivastava Description = This method clicks on Download
	 * Summary button on Features page
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void clickOnDownloadSummary() throws InterruptedException, IOException {

		FeaturesToBuildBMW features = new FeaturesToBuildBMW(driver);

		Thread.sleep(7000);
		features.getSummary().click();
		Thread.sleep(8000);
		new Actions(driver).moveToElement(features.getDownloadSummary()).build().perform();
		Thread.sleep(2000);
		new Actions(driver).sendKeys(Keys.ARROW_DOWN).build().perform();
		features.getDownloadSummary().click();

		Thread.sleep(15000);
		log.info("Downloaded the Build Summary");
		Thread.sleep(2000);
		getScreenshot("Download");

	}

	/**
	 * Created By = Shivam Srivastava Description = This method clicks the My
	 * configurations link on BUILD Your BMW page
	 * 
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public void clickOnMyConfigurations() throws IOException, InterruptedException {

		Thread.sleep(3000);
		ChooseBMWToBuild bmwToBuild = new ChooseBMWToBuild(driver);

		try {
			bmwToBuild.getMyConfigurations().click();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			log.error("My Configurations Page is not loading");
			Thread.sleep(3000);
			getScreenshot("MyConfigurations");
			Assert.fail("My Configurations Page is not loading");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			log.error("My Configurations Page is not loading");
			Thread.sleep(3000);
			getScreenshot("MyConfigurations");
			Assert.fail("My Configurations Page is not loading");
		} 

	}

	/**
	 * Created By = Shivam Srivastava Description = This method clicks the Compare
	 * link on Build Your BMW page
	 * 
	 * @throws InterruptedException
	 */
	public void clickOnCompare() throws InterruptedException {

		ChooseBMWToBuild bmwToBuild = new ChooseBMWToBuild(driver);

		Thread.sleep(4000);
		try {
			bmwToBuild.getCompare().click();
			log.info("Clicked on Compare");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.error("Compare element not found");
			Assert.fail("Compare link not found");
		}

	}

	/**
	 * Created By = Shivam Srivastava Description = This method adds the series 7
	 * sedan model to compare
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void compareSeries7Sedan() throws InterruptedException, IOException {

		Thread.sleep(3000);
		CompareModels compareModels = new CompareModels(driver);

		getScreenshot("Compare");
		Actions action = new Actions(driver);
		action.moveToElement(compareModels.getCompareSeries7Sedan()).build().perform();
		compareModels.getCompareSeries7Sedan().click();
		log.info("Clicked on Add to comapre for series 7 sedan");

	}

	/**
	 * Created By = Shivam Srivastava Description = This method adds the series M M2
	 * model to compare
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void compareSeriesM2() throws InterruptedException, IOException {

		Thread.sleep(7000);
		CompareModels compareModels = new CompareModels(driver);

		getScreenshot("CompareMenu");
		Actions action = new Actions(driver);
		action.moveToElement(compareModels.getCompareSeriesM2()).build().perform();
		compareModels.getCompareSeriesM2().click();
		log.info("Clicked on Add to compare for series M M2 model");

	}

	/**
	 * Created By = Shivam Srivastava Description = This method clicks the Compare
	 * button on Compare page
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void clickOnCompareButton() throws InterruptedException, IOException {

		Thread.sleep(2000);
		CompareModels compareModels = new CompareModels(driver);

		getScreenshot("CompareMenu2");
		compareModels.getCompareButton().click();
		log.info("Clicked on compare button");

	}

	/**
	 * Created By = Shivam Srivastava Description = This method gets the compared
	 * car 1 name
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void getComparedCar1Name() throws InterruptedException, IOException {

		Thread.sleep(5000);
		CompareModels compareModels = new CompareModels(driver);

		Actions action = new Actions(driver);
		action.moveToElement(compareModels.getCar1ParameterValue()).build().perform();
		Thread.sleep(1000);
		getScreenshot("Comparison");
		String car1Name = compareModels.getComparedCar1Name().getText();
		comparedCarData.put("Car1 Name", car1Name);
	}

	/**
	 * Created By = Shivam Srivastava Description = This method gets the compared
	 * car 2 name
	 * 
	 * @throws InterruptedException
	 */
	public void getComparedCar2Name() throws InterruptedException {

		CompareModels compareModels = new CompareModels(driver);

		String car2Name = compareModels.getComparedCar2Name().getText();
		comparedCarData.put("Car2 Name", car2Name);
	}

	/**
	 * Created By = Shivam Srivastava Description = This method gets the parameter
	 * on which the comparison happened
	 * 
	 * @throws InterruptedException
	 */
	public void getComparedCarParameter() throws InterruptedException {

		CompareModels compareModels = new CompareModels(driver);

		String parameter = compareModels.getCompareParameter().getText();
		comparedCarData.put("Compared on Parameter", parameter);
	}

	/**
	 * Created By = Shivam Srivastava Description = This method gets the parameter
	 * type on which comparison happened
	 * 
	 * @throws InterruptedException
	 */
	public void getComparedCarParameterType() throws InterruptedException {

		CompareModels compareModels = new CompareModels(driver);

		String parameterType = compareModels.getCompareParameterType().getText();
		comparedCarData.put("Parameter Type", parameterType);
	}

	/**
	 * Created By = Shivam Srivastava Description = This method gets the value of
	 * the compared parameter for car 1
	 * 
	 * @throws InterruptedException
	 */
	public void getComparedCar1Value() throws InterruptedException {

		CompareModels compareModels = new CompareModels(driver);

		String car1ParameterValue = compareModels.getCar1ParameterValue().getText();
		comparedCarData.put("Car1 Parameter value", car1ParameterValue);
	}

	/**
	 * Created By = Shivam Srivastava Description = This method gets the value of
	 * the compared parameter for car 2 and checks the value of the parameter. If
	 * its null, then fails the test and writes the data into the excel sheet
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void getComparedCar2Value() throws InterruptedException, IOException {

		CompareModels compareModels = new CompareModels(driver);

		String car2ParameterValue = compareModels.getCar2ParameterValue().getText();
		comparedCarData.put("car2 Parameter value", car2ParameterValue);
		new Actions(driver).sendKeys(Keys.PAGE_DOWN).build().perform();
		getScreenshot("comparisonResult");
		System.out.println(car2ParameterValue);
		WritetoExcel.writeToExcel(comparedCarData, "CompareModels");

		if (car2ParameterValue.equalsIgnoreCase("-")) {

			log.error("Comparison parameter values are not displayed");
			Assert.fail("Comparison parameter values are not displayed");

		} else {

			log.info("Comparison parameter values are displayed");
		}

	}

	/**
	 * Created By = Shivam Srivastava Description = This Methods clicks on the Used
	 * cars tag on Models tab
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 */

	public void clickOnUsedCars() throws InterruptedException, IOException {

		Thread.sleep(2000);

		lp.getUsedCars().click();
		log.info("Clicked on Used Cars ");
	}

	/**
	 * Created By = Shivam Srivastava Description = this method fills the filter
	 * details on used cars page
	 * 
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void fillFilterDetails() throws InterruptedException, IOException {

		Thread.sleep(4000);

		UsedCars usedCars = new UsedCars(driver);

		getScreenshot("UsedCars");
		Map<String, String> data = ReadFromExcel.getExcelData("usedCarsFilter.xlsx");

		usedCars.getClearSearch().click();
		log.info("Clicked on Clear Search");
		WebElement city = usedCars.getSelectCity();
		new Select(city).selectByVisibleText(data.get("City"));
		log.info("Selecetd city");
		Thread.sleep(3000);

		WebElement model = usedCars.getSelectModel();
		new Select(model).selectByVisibleText(data.get("Model"));
		log.info("Selected Model");
		Thread.sleep(3000);

		WebElement fuelType = usedCars.getSelectFuelType();
		new Select(fuelType).selectByVisibleText(data.get("Fuel Type"));
		log.info("Selected Fuel Type");
		Thread.sleep(3000);
	}

	/**
	 * Created By = Shivam Srivastava Description = This function clicks on the
	 * results of the filter function on used cars
	 * 
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void clickOnFilterResult() throws InterruptedException, IOException {

		Thread.sleep(2000);
		UsedCars usedCars = new UsedCars(driver);

		getScreenshot("UsedCarsFilterResult");
		usedCars.getClickOnModelToEnquire().click();
		log.info("Clicked on used cars filter result");
	}

	/**
	 * Created By = Shivam Srivastava Description = This method get the details of
	 * the used car enquired and writes the details in excel file
	 * 
	 * @throws IOException
	 */
	public void getUsedCarDetail() throws IOException {

		UsedCarsDetails usedCarsDetail = new UsedCarsDetails(driver);

		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		getScreenshot("UsedCarDetail");
		String usedCarName = usedCarsDetail.getModelName().getText();
		String usedCarPrice = usedCarsDetail.getModelPrice().getText();

		usedCarData.put("Car Name", usedCarName);
		usedCarData.put("Car Price", usedCarPrice);
		log.info("Got the name and price of used car");

		WritetoExcel.writeToExcel(usedCarData, "UsedCarDetail");
	}

	/**
	 * Created By = Shivam Srivastava
	 * 
	 * Descrption = This method is used to download the Specification Sheet of the
	 * enquired by the user on used car page
	 * 
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public void downloadUsedCarSpecification() throws IOException, InterruptedException {

		UsedCarsDetails usedCarsDetail = new UsedCarsDetails(driver);

		usedCarsDetail.getSpecificationSheet().sendKeys(Keys.PAGE_DOWN);
		getScreenshot("SpecificationSheet");
		usedCarsDetail.getSpecificationSheet().click();

		Thread.sleep(10000);
		log.info("Downloaded Specification sheet of Used Cars");
	}

	/**
	 * Created By = Shivam Srivastava
	 * 
	 * Description = This method Clicks on Sell Your car tag on Used car Page
	 * 
	 * @throws InterruptedException
	 */
	public void clickOnSellYourCar() throws InterruptedException {

		Thread.sleep(2000);
		UsedCars usedCars = new UsedCars(driver);

		usedCars.getSellYourCar().click();
		log.info("Clicked on Sell Your Car tag");
		Thread.sleep(2000);

		new Actions(driver).sendKeys(Keys.PAGE_DOWN).build().perform();

	}

	/**
	 * Created By = Shivam Srivastava
	 * 
	 * Description = This Method fills the name in the name Field of Sell your Car
	 * Form
	 * 
	 * @param fileName
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws TesseractException
	 */
	public void fillSellYourCarName(String fileName) throws InterruptedException, IOException {

		Thread.sleep(2000);

		SellYourCar sellYourCar = new SellYourCar(driver);

		getScreenshot("SellYourCarForm");

		sellYourCarData = ReadFromExcel.getExcelData(fileName);

		sellYourCar.getName().sendKeys(sellYourCarData.get("Name"));
		Thread.sleep(3000);
		log.info("Filled Name");
	}

	/**
	 * Created By = Shivam Srivastava
	 * 
	 * Description = This Method fills the Mobile number in the Mobile Number Field
	 * of Sell your Car Form
	 * 
	 * @param fileName
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void fillSellYourCarMobile(String fileName) throws InterruptedException, IOException {

		SellYourCar sellYourCar = new SellYourCar(driver);

		sellYourCarData = ReadFromExcel.getExcelData(fileName);
		sellYourCar.getMobileNumber().sendKeys(sellYourCarData.get("Mobile"));
		Thread.sleep(2000);
		log.info("Filled Mobile Number");

	}

	/**
	 * Created By = Shivam Srivastava
	 * 
	 * Description = This Method fills the Mobile number in the Mobile Number Field
	 * of Sell your Car Form
	 * 
	 * @param fileName
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void fillSellYourCarMobileValid(String fileName) throws InterruptedException, IOException {

		SellYourCar sellYourCar = new SellYourCar(driver);

		sellYourCarData = ReadFromExcel.getExcelData(fileName);
		sellYourCar.getMobileNumber().sendKeys("9891858574");
		Thread.sleep(2000);
		log.info("Filled Mobile Number");

	}

	/**
	 * Created By = Shivam Srivastava
	 * 
	 * Description = This Method Selects the City in the City Field of Sell your Car
	 * Form
	 * 
	 * @param fileName
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void fillSellYourCarCity(String fileName) throws InterruptedException, IOException {

		SellYourCar sellYourCar = new SellYourCar(driver);

		sellYourCarData = ReadFromExcel.getExcelData(fileName);
		WebElement city = sellYourCar.getCity();
		new Select(city).selectByVisibleText(sellYourCarData.get("City"));
		Thread.sleep(2000);
		log.info("Selected City");

	}

	/**
	 * Created By = Shivam Srivastava
	 * 
	 * Description = This Method fills the Email in the Email Field of Sell your Car
	 * Form
	 * 
	 * @param fileName
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void fillSellYourCarEmail(String fileName) throws InterruptedException, IOException {

		SellYourCar sellYourCar = new SellYourCar(driver);

		sellYourCarData = ReadFromExcel.getExcelData(fileName);
		sellYourCar.getEmail().sendKeys(sellYourCarData.get("Email"));
		Thread.sleep(2000);
		log.info("Filled Email");

	}

	/**
	 * Created By = Shivam Srivastava
	 * 
	 * Description = This Method selects the dealer in the dealer Field of Sell your
	 * Car Form
	 * 
	 * @param fileName
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void fillSellYourCarDealer(String fileName) throws InterruptedException, IOException {

		SellYourCar sellYourCar = new SellYourCar(driver);

		sellYourCarData = ReadFromExcel.getExcelData(fileName);
		WebElement dealer = sellYourCar.getDealer();
		new Select(dealer).selectByVisibleText(sellYourCarData.get("Dealer"));
		log.info("Selected Dealer");

	}

	/**
	 * Created By = Shivam Srivastava
	 * 
	 * Description = This Method clicks on the submit button of Sell your Car Form
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void fillSellYourCarSubmit() throws InterruptedException, IOException {

		Thread.sleep(15000);

		SellYourCar sellYourCar = new SellYourCar(driver);

		// sellYourCar.getCaptcha().click();

		sellYourCar.getSubmit().click();
		log.info("Clicked on Submit Button");
		Thread.sleep(4000);

	}

	/**
	 * Created By = Shivam Srivastava
	 * 
	 * Description = This Method validates the Sell your Car Form submitted
	 * successfully or not
	 * 
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void validateSellYourCarSubmit() throws InterruptedException, IOException {

		Thread.sleep(3000);

		SellYourCar sellYourCar = new SellYourCar(driver);

		new Actions(driver).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(1000);
		getScreenshot("FormSubmitted");
		String sellYourCarSubmittitle = sellYourCar.getValidTitle().getText();
		System.out.println(sellYourCarSubmittitle);
		if (sellYourCarSubmittitle.trim().contains("THANK YOU FOR CONTACTING US!")) {

			log.info("Submitted the form");

		} else {
			log.error("Not submitted the form");
		}

	}

	/**
	 * Created By = Shivam Srivastava
	 * 
	 * Description = This Method validates the name field of Sell your Car Form
	 * 
	 * 
	 */
	public void validateSellYourCarName() {

		SellYourCar sellYourCar = new SellYourCar(driver);

		String regex = sellYourCar.getName().getAttribute("pattern");
		String name = sellYourCar.getName().getAttribute("value");

		if (!name.matches("[" + regex + "]+")) {

			log.warn("Invalid Input: " + name + " not allowed");

		} else {
			log.info("Valid Input");

		}

	}

	/**
	 * Created By = Shivam Srivastava
	 * 
	 * Description = This Method validates the Mobile field of Sell your Car Form
	 * 
	 * 
	 */
	public void validateSellYourCarMobile() {

		SellYourCar sellYourCar = new SellYourCar(driver);

		String regex = sellYourCar.getMobileNumber().getAttribute("pattern");
		String name = sellYourCar.getMobileNumber().getAttribute("value");
		System.out.println(name);

		if (!name.matches("[" + regex + "]+")) {
			log.warn("Invalid Input: " + name + " not allowed");

		} else {
			log.info("Valid Input");

		}

	}

	/**
	 * Created By = Shivam Srivastava
	 * 
	 * Description = This Method validates the email field of Sell your Car Form
	 * 
	 * 
	 */
	public void validateSellYourCarEmail() {

		SellYourCar sellYourCar = new SellYourCar(driver);

		String regex = "\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,}\b";
		String name = sellYourCar.getMobileNumber().getAttribute("value");
		System.out.println(name);

		if (!name.matches("[" + regex + "]+")) {
			log.warn("Invalid Input: " + name + " not allowed");

		} else {
			log.info("Valid Input");

		}

	}

	/**
	 * Created By = Shivam Srivastava
	 * 
	 * Description = This Method validates the city field of Sell your Car Form
	 * 
	 * 
	 */
	public void validateSellYourCarCity() {

		SellYourCar sellYourCar = new SellYourCar(driver);

		String city = "New Delhi";
		Select select = new Select(sellYourCar.getCity());
		java.util.List<WebElement> allOptions = select.getOptions();

		boolean found = false;
		for (int i = 0; i < allOptions.size(); i++) {

			String cityValue = allOptions.get(i).getText().trim();
			if (cityValue.equals(city)) {
				System.out.println(allOptions.get(i).getText());
				found = true;
				break;
			}
		}
		if (found) {
			log.info(city + " Present in select tag");
		} else {

			log.warn(city + " Not Present in select tag");
		}
	}

	/**
	 * Created By = Shivam Srivastava
	 * 
	 * Description = This Method validates the dealer field of Sell your Car Form
	 * 
	 * 
	 */
	public void validateSellYourCarDealer() {

		SellYourCar sellYourCar = new SellYourCar(driver);

		String dealer = "Libra Autohaus, New Delhi";
		Select select = new Select(sellYourCar.getDealer());
		java.util.List<WebElement> allOptions = select.getOptions();

		boolean found = false;
		for (int i = 0; i < allOptions.size(); i++) {

			String dealerValue = allOptions.get(i).getText().trim();
			if (dealerValue.equals(dealer)) {
				System.out.println(allOptions.get(i).getText());
				found = true;
				break;
			}
		}
		if (found) {
			log.info(dealer + " present in select tag");
		} else {
			log.warn(dealer + " not present in select tag");
		}

	}

	/**
	 * Created By = Shivam Srivastava
	 * 
	 * Description = This Method validates the submit button functionality of Sell
	 * your Car Form
	 * 
	 * throws InterruptedException
	 */
	public void validateSellYourCarSubmitButton() throws InterruptedException {

		Thread.sleep(1000);
		SellYourCar sellYourCar = new SellYourCar(driver);

		Boolean submit = sellYourCar.getSubmit().isDisplayed();
		System.out.println(submit);

		if (submit) {
			log.info("Submit button is displayed");
		} else {
			log.warn("Submit button is not displayed");
		}
	}

	/**
	 * Created By = Shivam Srivastava
	 * 
	 * Description = This Method Clicks on the new car tag on Models tag
	 * 
	 * @throws InterruptedException
	 */
	public void clickOnNewCar() throws InterruptedException {

		Thread.sleep(2000);
		UsedCars usedCars = new UsedCars(driver);

		usedCars.getNewCar().click();
		log.info("Clicked on New Car tag");

	}

	/**
	 * Created By = Shivam Srivastava
	 * 
	 * Description = This Method selects the series to buy new car
	 * 
	 * @throws IOException
	 */
	public void selectSeries7NewCar() throws IOException {

		NewCar nc = new NewCar(driver);

		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		getScreenshot("NewCarPage");
		nc.getNewCarseries7().click();
		log.info("Clicked on series 7 to buy");

	}

	/**
	 * Created By = Shivam Srivastava
	 * 
	 * Description = This Method selects the Series's model to buy
	 * 
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void getNewCarSeries7ThirdModelName() throws InterruptedException, IOException {

		Thread.sleep(2000);

		NewCarModels ncm = new NewCarModels(driver);

		new Actions(driver).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(2000);
		getScreenshot("NewCarModel");

		String name = ncm.getNewCarseries7ThirdModelName().getText();
		log.info("Got the name of Third model of series 7");
		newCarData.put("Model Name", name);

	}

	/**
	 * Created By = Shivam Srivastava
	 * 
	 * Description = This Method selects the Series's model price to buy
	 * 
	 * 
	 * @throws InterruptedException
	 * 
	 */
	public void getNewCarSeries7ThirdModelPrice() throws InterruptedException {

		Thread.sleep(2000);

		NewCarModels ncm = new NewCarModels(driver);

		String price = ncm.getNewCarseries7ThirdModelPrice().getText();
		log.info("Got the price of Third model of series 7");
		newCarData.put("Model Price", price);

	}

	/**
	 * Created By = Shivam Srivastava
	 * 
	 * Description = This Method selects the Series's models features to buy
	 * 
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void getNewCarSeries7ThirdModelFeaturesClick() throws InterruptedException, IOException {

		Thread.sleep(1000);

		NewCarModels ncm = new NewCarModels(driver);

		ncm.getNewCarseries7ThirdModelExterior().click();
		log.info("Clicked on exterior features of model 7 to buy");
		Thread.sleep(2000);
		ncm.getNewCarseries7ThirdModelInterior().click();
		log.info("Clicked on interior features of model 7 to buy");
		Thread.sleep(3000);
		getScreenshot("NewCarFeatures");
	}

	/**
	 * Created By = Shivam Srivastava
	 * 
	 * Description = This Method gets the Series's models features to buy
	 * 
	 * 
	 * @throws InterruptedException
	 */
	public void getNewCarSeries7ThirdModelFeatures() throws InterruptedException {

		Thread.sleep(2000);

		NewCarModels ncm = new NewCarModels(driver);

		String exterior = ncm.getNewCarseries7ThirdModelExteriorName().getText();
		String interior = ncm.getNewCarseries7ThirdModelInteriorName().getText();
		newCarData.put("Exterior", exterior);
		newCarData.put("Interior", interior);
	}

	/**
	 * Created By = Shivam Srivastava
	 * 
	 * Description = This Method Clicks on the Check Availability button on buy new
	 * car page
	 * 
	 * 
	 * @throws InterruptedException
	 */
	public void clickOnCheckAvailabilty() throws InterruptedException {

		Thread.sleep(2000);

		NewCarModels ncm = new NewCarModels(driver);

		ncm.getNewCarseries7CheckAvailability().click();
		log.info("Clicked on Check Avalibility");
	}

	/**
	 * Created By = Shivam Srivastava
	 * 
	 * Description = This Method fills the availability form on buy new car page
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void fillNewCarForm() throws InterruptedException, IOException {

		Thread.sleep(2000);

		NewCarModels ncm = new NewCarModels(driver);

		getScreenshot("AvailibilityForm");
		Map<String, String> readNewCarData = ReadFromExcel.getExcelData("newCarData.xlsx");

		ncm.getNewCarPinCode().sendKeys(readNewCarData.get("PinCode"));
		log.info("Entered the Pin Code");
		Thread.sleep(1000);
		WebElement city = ncm.getNewCarCity();
		Select select = new Select(city);
		select.selectByVisibleText("LUCKNOW");
		log.info("Selected the city");
		Thread.sleep(2000);
		getScreenshot("FilledAvailabilityForm");
		ncm.getNewCarOkButton().click();
		log.info("Clicked on OK button on form to check availabilty of new car");

	}

	/**
	 * Created By = Shivam Srivastava
	 * 
	 * Description = This Method gets the availabilty status of the new car
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void getAvailability() throws InterruptedException, IOException {

		Thread.sleep(2000);

		NewCarModels ncm = new NewCarModels(driver);

		getScreenshot("AvailabilityStatus");
		String availability = ncm.getNewCarAvailability().getText();
		newCarData.put("Availability", availability);
		log.info("Got the availiability status");
		WritetoExcel.writeToExcel(newCarData, "newCarDetails");

	}

	// **************Module 5 Methods******************

	/**
	 * Method for testing all the links present in services and warranty tab
	 * 
	 * @author sarthak-pc
	 * @throws IOException
	 * @throws InterruptedException
	 */

	public void testServicesAndWarranty() throws IOException, InterruptedException {

		log.info("clicking the services link ");
		lp.getNavServices().click();
		Thread.sleep(1000); // ***************using thread as load time for taking screenshots*********
		getScreenshot("services_page");

		// ***************checking the services and warranty links***************

		getAssert(lp.getJoyRewards().isEnabled(), "Joy Rewards");
		lp.getJoyRewards().click();
		getScreenshot("joy_rewards");
		getServicesTab(); // navigating back to the home page and clicking the services tab
		
		Thread.sleep(1000);

		getAssert(lp.getWorkshopOffers().isEnabled(), "Workshop offers");
		lp.getWorkshopOffers().click();
		getScreenshot("workshop_offers");
		getServicesTab();
		
		Thread.sleep(1000);

		getAssert(lp.getServiceInclusive().isEnabled(), "Service inclusive");
		lp.getServiceInclusive().click();
		getScreenshot("Service_Inclusive");
		getServicesTab();
		
		Thread.sleep(1000);

		getAssert(lp.getFastLaneService().isEnabled(), "Fast Lane Service");
		lp.getFastLaneService().click();
		getScreenshot("Fast_Lane_service");
		getServicesTab();

		Thread.sleep(1000);
		
		getAssert(lp.getAccidentManagement().isEnabled(), "Accidemt management");
		lp.getAccidentManagement().click();
		getScreenshot("Accident_management");
		getServicesTab();

		Thread.sleep(1000);
		
		getAssert(lp.getBMWOriginalParts().isEnabled(), "BMW Orginal parts");
		lp.getBMWOriginalParts().click();
		getScreenshot("BMW_Orginal_parts");
		getServicesTab();

		Thread.sleep(1000);
		
		getAssert(lp.getRecallInformation().isEnabled(), "Recall information");
		lp.getRecallInformation().click();
		getScreenshot("Recall_information");
		getServicesTab();

		Thread.sleep(1000);
		
		getAssert(lp.getBRIPackageStatus().isEnabled(), "BRI package");
		lp.getBRIPackageStatus().click();
		getScreenshot("BRI_package_status");
		getServicesTab();

		Thread.sleep(2000);

	}

	/**
	 * Method for testing all the links in BMW lifestyle tab
	 * 
	 * @author sarthak-pc
	 * @throws InterruptedException
	 * @throws IOException
	 */

	public void testBMWLifeStyle() throws InterruptedException, IOException {

		try {
			System.out.println(lp.getBmwLifeStyle().isEnabled());
			System.out.println("old");

			lp.getBmwLifeStyle().click();
		} catch (Exception e) {

			log.info(lp.getBmwLifeStyleNew().isDisplayed());
			System.out.println(lp.getBmwLifeStyleNew().isDisplayed());
			new Actions(driver).moveToElement(lp.getBmwLifeStyleNew()).build().perform();
			Thread.sleep(2000);
		}

		Thread.sleep(2000);

		getAssert(lp.getBMWCollection().isEnabled(), "BMW Collection");
		getScreenshot("BMW_Lifestyle");

		getAssert(lp.getBMWMotorSportCollection().isEnabled(), "BMW motor sport Collection");
		getAssert(lp.getBMWiCollection().isEnabled(), "BMW i Collection");
		getAssert(lp.getBMWMCollection().isEnabled(), "BMW m Collection");
		getAssert(lp.getBMWKidsCollection().isEnabled(), "BMW kids Collection");
		getAssert(lp.getBMWSportsCollection().isEnabled(), "BMW sports Collection");
		getAssert(lp.getBMWMiniatures().isEnabled(), "BMW miniatures");
		getAssert(lp.getBMWMobility().isEnabled(), "BMW Mobility");

		Thread.sleep(2000);

	}

	/**
	 * Method for testing all the links in BMW accessories tab
	 * 
	 * @author sarthak-pc
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public void testBMWAccessories() throws IOException, InterruptedException {

		// getAssert(lp.getBmwAccessories().isEnabled(), "BMW Accessories");

		try {
			System.out.println(lp.getBmwAccessories().isEnabled());
			lp.getBmwAccessories().click();
		} catch (Exception e) {

			log.info(lp.getBmwAccessoriesNew().isDisplayed());
			new Actions(driver).moveToElement(lp.getBmwAccessoriesNew()).build().perform();
		}

		getScreenshot("BMW_Accessories");
		getAssert(lp.getBMWAccessoriesOverview().isEnabled(), "BMW accessories overview");
		getAssert(lp.getUniversalAccessories().isEnabled(), "BMW accessories universal");
		getAssert(lp.getBMWWheelsandTyres().isEnabled(), "BMW wheels and tyres");
		getAssert(lp.getTravelandComfortAccessories().isEnabled(), "BMW travel and comfort");
		getAssert(lp.getMPerformanceParts().isEnabled(), "BMW M performance parts");
		getAssert(lp.getCarCareProducts().isEnabled(), "car care products");
		Thread.sleep(2000);
	}

	/**
	 * Method for testing all the links in BMW Apps tab
	 * 
	 * @author sarthak-pc
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public void testBMWApps() throws IOException, InterruptedException {

		try {
			System.out.println(lp.getBmwApps().isEnabled());
			lp.getBmwApps().click();
		} catch (Exception e) {

			new Actions(driver).moveToElement(lp.getBmwAppsNew()).build().perform();
			log.info(lp.getBmwAppsNew().isDisplayed());
		}

		getScreenshot("BMW_Apps");
		getAssert(lp.getOverview().isEnabled(), "overview");
		getAssert(lp.getCatalogueandOwnerGuide().isEnabled(), "BMW accessories universal");
		getAssert(lp.getBMWMandMotorsport().isEnabled(), "BMW M and motor sport");
		getAssert(lp.getDealerServiceandEquipment().isEnabled(), "Dealer Service and Equipment");
		getAssert(lp.getLifestyleandGadgets().isEnabled(), "LifeStyle and gadgets");
		getAssert(lp.getVirtualandAugmentedReality().isEnabled(), "Virtual reality and augmented Reality");
		Thread.sleep(2000);

	}

	/**
	 * Method for testing the joy Rewards Link and rEgister now button
	 * 
	 * @author sarthak-pc
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void testBMWJoyRewards() throws InterruptedException, IOException {

		BMWJoyRewards joyRewards = new BMWJoyRewards(driver);
		log.info("checking the joy rewards registrer now page");

		lp.getNavServices().click();
		log.info("clicking on services tab");
		lp.getJoyRewards().click();
		log.info("cliked on joy rewatds link");
		Thread.sleep(2000);
		new Actions(driver).moveToElement(joyRewards.getRegisterNow()).build().perform();

		getAssert(joyRewards.getRegisterNow().isEnabled(), "joy rewards register now");

		getScreenshot("rewards_register_now");

	}

	/**
	 * Method for getting the Registration page for joy rewards
	 * 
	 * @author sarthak-pc
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public void getRewardsRegistrationPage() throws IOException, InterruptedException {

		BMWJoyRewards joyRewards = new BMWJoyRewards(driver);
		log.info("checking the joy rewards registrer now page");

		lp.getNavServices().click();
		log.info("clicking on services tab");
		Thread.sleep(2000);
		lp.getJoyRewards().click();
		log.info("cliked on joy rewards link");
		Thread.sleep(2000);
		new Actions(driver).moveToElement(joyRewards.getRegisterNow()).build().perform();

		System.out.println(joyRewards.getRegisterNow().isDisplayed());

		joyRewards.getRegisterNow().click();
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		log.info("switching to new tab");
		new Actions(driver).sendKeys(Keys.PAGE_DOWN).build().perform();
		getScreenshot("rewards_register_now_form");
		driver.close();
		log.info("closing the new tab");
		driver.switchTo().window(tabs2.get(0));
		log.info("back to previous window");

	}

	/**
	 * Method for mandatory field validation in rewards form
	 * 
	 * @author sarthak-pc
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public void mandatoryFieldValidation() throws IOException, InterruptedException {

		BMWJoyRewards joyRewards = new BMWJoyRewards(driver);
		log.info("checking the joy rewards registrer now page");

		lp.getNavServices().click();
		log.info("clicking on services tab");
		Thread.sleep(2000);
		lp.getJoyRewards().click();
		Thread.sleep(2000);
		log.info("cliked on joy rewards link");

		new Actions(driver).moveToElement(joyRewards.getRegisterNow()).build().perform();

		System.out.println(joyRewards.getRegisterNow().isDisplayed());

		joyRewards.getRegisterNow().click();
		driver.manage().deleteAllCookies();
		
		Thread.sleep(2000);
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		driver.navigate().refresh();
		driver.manage().deleteAllCookies();
		log.info("switching to new tab");
		new Actions(driver).sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

		log.info("filling the form for mandatory fields");

		BMWJoyRewardsRegistrationPage registrationPage = new BMWJoyRewardsRegistrationPage(driver);

		Map<String, String> data = ReadFromExcel.getExcelData("JoyRewardsTestData.xlsx");

		getSelectValue(registrationPage.getTitle(), data.get("title"));
		Thread.sleep(2000);
		registrationPage.getFirstName().sendKeys(data.get("firstName"));
		Thread.sleep(2000);
		registrationPage.getLastName().sendKeys(data.get("LastName"));
		Thread.sleep(2000);
		registrationPage.getEmail().sendKeys(data.get("email"));
		Thread.sleep(2000);
		registrationPage.getCarPurchaseDate().click();
		Thread.sleep(2000);
		registrationPage.getCarPurchaseDateToday().click();
		Thread.sleep(2000);
		registrationPage.getCarPurchaseDateDone().click();
		Thread.sleep(2000);
		registrationPage.getMobile().sendKeys(data.get("mobile"));
		Thread.sleep(2000);
		registrationPage.getCity().click();
		Thread.sleep(2000);
		getSelectValue(registrationPage.getCity(), data.get("city"));
		Thread.sleep(2000);
		registrationPage.getDealer().click();
		Thread.sleep(2000);
		getSelectValue(registrationPage.getDealer(), data.get("dealer"));
		Thread.sleep(2000);
		registrationPage.getAcceptCheckBox().click();
		Thread.sleep(2000);

		getScreenshot("rewards_register_now_form_filled");
		log.info("form filled");

		registrationPage.getSubmit().click();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);

		log.info(registrationPage.getMessage().getText());
		System.out.println(registrationPage.getMessage().getText());
		getScreenshot("mandatory_validation_rewarads_error_message");

		log.info("closing the new tab");

		driver.switchTo().window(tabs2.get(0));

		log.info("back to previous window");

	}

	/**
	 * Method for null value validation in joy rewards form
	 * 
	 * @author sarthak-pc
	 * @throws InterruptedException
	 * @throws IOException
	 */

	public void nullValueValidation() throws InterruptedException, IOException {

		BMWJoyRewards joyRewards = new BMWJoyRewards(driver);
		log.info("checking the joy rewards registrer now page");

		lp.getNavServices().click();
		log.info("clicking on services tab");
		Thread.sleep(2000);
		lp.getJoyRewards().click();
		Thread.sleep(2000);
		log.info("cliked on joy rewards link");

		new Actions(driver).moveToElement(joyRewards.getRegisterNow()).build().perform();

		System.out.println(joyRewards.getRegisterNow().isDisplayed());

		joyRewards.getRegisterNow().click();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		Thread.sleep(2000);
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		driver.navigate().refresh();
		driver.manage().deleteAllCookies();
		log.info("switching to new tab");
		new Actions(driver).sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

		log.info("filling the form for null fields");

		BMWJoyRewardsRegistrationPage registrationPage = new BMWJoyRewardsRegistrationPage(driver);
		registrationPage.getAcceptCheckBox().click();

		getScreenshot("null_values_validation_rewarads");
		Thread.sleep(2000);
		registrationPage.getSubmit().click();
		Thread.sleep(2000);
		log.info(registrationPage.getWrongMessage().getText());
		System.out.println(registrationPage.getWrongMessage().getText());
		getScreenshot("null_values_validation_rewarads_error_message");
		Thread.sleep(2000);
		log.info("closing the new tab");

		driver.switchTo().window(tabs2.get(0));

		log.info("back to previous window");

	}

	/**
	 * Method for check box validation
	 * 
	 * @author sarthak-pc
	 * @throws InterruptedException
	 */

	public void getcheckBoxValidation() throws InterruptedException {

		BMWJoyRewards joyRewards = new BMWJoyRewards(driver);
		log.info("checking the joy rewards registrer now page");

		lp.getNavServices().click();
		log.info("clicking on services tab");
		Thread.sleep(2000);
		lp.getJoyRewards().click();
		Thread.sleep(2000);
		log.info("cliked on joy rewards link");

		new Actions(driver).moveToElement(joyRewards.getRegisterNow()).build().perform();

		System.out.println(joyRewards.getRegisterNow().isDisplayed());

		joyRewards.getRegisterNow().click();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		Thread.sleep(2000);
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(2000);
		driver.switchTo().window(tabs2.get(1));
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		log.info("switching to new tab");
		new Actions(driver).sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

		log.info("filling the form for null fields");

		BMWJoyRewardsRegistrationPage registrationPage = new BMWJoyRewardsRegistrationPage(driver);

		log.info("clicking the joy rewards check box");
		Thread.sleep(2000);
		getAssert(registrationPage.getJoyRewardsCheckBox().isSelected(), "joy rewards check box");

		log.info("closing the new tab");

		driver.switchTo().window(tabs2.get(0));

		log.info("back to previous window");

	}

	/**
	 * Method for getting car care products
	 * 
	 * @author sarthak-pc
	 * @throws IOException
	 * @throws InterruptedException
	 */

	public void getCarCareProducts() throws IOException, InterruptedException {

		log.info("care care products test case started");
		lp.getNavServices().click();
		Thread.sleep(2000);
		try {
			System.out.println(lp.getBmwAccessories().isEnabled());
			lp.getBmwAccessories().click();
		} catch (Exception e) {

			log.info(lp.getBmwAccessoriesNew().isDisplayed());
			new Actions(driver).moveToElement(lp.getBmwAccessoriesNew()).build().perform();
		}

		Thread.sleep(2000);

		// **********creating map for writing to excel sheet**************

		Map<String, String> map = new HashMap<String, String>();

		lp.getCarCareProducts().click();
		log.info("navigating to car care products");
		Thread.sleep(2000);
		Assert.assertTrue(driver.getTitle().equals("Car Care Products"), "car care products page not found");
		new Actions(driver).sendKeys(Keys.PAGE_DOWN).build().perform();
		new Actions(driver).sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		new Actions(driver).sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		new Actions(driver).sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		new Actions(driver).sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		new Actions(driver).sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		CarCareProducts products = new CarCareProducts(driver);

		getAssert(products.getGlassCleaning().isEnabled(), "glass cleaning");
		System.out.println(products.getGlassCleaningDetails().getText());
		log.info(products.getGlassCleaningDetails().getText());
		map.put("glass cleaning", products.getGlassCleaningDetails().getText());
		Thread.sleep(2000);
		getScreenshot("glass_cleaning");

		getAssert(products.getPaintAndWheel().isEnabled(), "paint and wheel");
		products.getPaintAndWheel().click();
		Thread.sleep(2000);
		System.out.println(products.getPaintandWheelDetails().getText());
		log.info(products.getPaintandWheelDetails().getText());
		map.put("paint and wheel", products.getPaintandWheelDetails().getText());
		Thread.sleep(2000);
		getScreenshot("paint_wheels");

		getAssert(products.getInteriorCare().isEnabled(), "interior care");
		products.getInteriorCare().click();
		Thread.sleep(2000);
		System.out.println(products.getInteriorCareDetails().getText());
		log.info(products.getInteriorCareDetails().getText());
		map.put("interior care", products.getInteriorCareDetails().getText());
		Thread.sleep(2000);
		getScreenshot("interior_care");

		getAssert(products.getSpecialProducts().isEnabled(), "special products");
		products.getSpecialProducts().click();
		Thread.sleep(2000);
		System.out.println(products.getSpecialProductsDetails().getText());
		log.info(products.getSpecialProductsDetails().getText());
		map.put("special products", products.getSpecialProductsDetails().getText());
		Thread.sleep(2000);
		getScreenshot("special_products");

		WritetoExcel.writeToExcel(map, "carCareProducts");// ****************writing to excel*****************

	}

	/**
	 * Method for life style and gadgets
	 * 
	 * @author sarthak-pc
	 * @throws InterruptedException
	 * @throws IOException
	 */

	public void getBMWLifestyleAndGadgets() throws InterruptedException, IOException {

		log.info("BMW lifeStyle and apps test case started");
		lp.getNavServices().click();

		try {
			System.out.println(lp.getBmwApps().isEnabled());
			lp.getBmwApps().click();
		} catch (Exception e) {

			log.info(lp.getBmwAppsNew().isDisplayed());
			new Actions(driver).moveToElement(lp.getBmwAppsNew()).build().perform();
		}

		Thread.sleep(2000);

		lp.getLifestyleandGadgets().click();

		BMWLifestyleAndGadgets lifestyleAndGadgets = new BMWLifestyleAndGadgets(driver);

		getAssert(lifestyleAndGadgets.getPageValidator().getText().equals("LIFESTYLE & GADGETS."), "lifestyle page");

		lifestyleAndGadgets.getMagazine().click();
		Thread.sleep(2000);
		getScreenshot("magazine");

		lifestyleAndGadgets.getSocialConnected().click();
		Thread.sleep(2000);
		getScreenshot("social");

		lifestyleAndGadgets.getWatchFaces().click();
		Thread.sleep(2000);
		getScreenshot("watches");

		lifestyleAndGadgets.getBmwprive().click();
		Thread.sleep(2000);
		getScreenshot("bmwprive");

	}

	/**
	 * Method for null value check in BRI Package status
	 * 
	 * @author sarthak-pc
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void testBriPackageNullValue() throws InterruptedException, IOException {

		lp.getNavServices().click();
		log.info("clicking on services tab");
		Thread.sleep(2000);

		lp.getBRIPackageStatus().click();
		Thread.sleep(2000);

		BRIPackageStatus status = new BRIPackageStatus(driver);

		getAssert(status.getPageValidator().getText().contains("BMW Service and Repair Packages"),
				"BRI package status");

		new Actions(driver).sendKeys(Keys.PAGE_DOWN).build().perform();
		new Actions(driver).moveToElement(status.getSubmit()).build().perform();

		status.getSubmit().click();
		Thread.sleep(3000);
		getScreenshot("null_value_error_BRI");
		Thread.sleep(2000);
		log.info(status.getAlert().getText());

	}

	/**
	 * Test bRI status for invalid value
	 * 
	 * @author sarthak-pc
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void testBriPackageInvalidValue() throws InterruptedException, IOException {

		lp.getNavServices().click();
		log.info("clicking on services tab");
		Thread.sleep(2000);

		lp.getBRIPackageStatus().click();
		Thread.sleep(2000);

		BRIPackageStatus status = new BRIPackageStatus(driver);

		getAssert(status.getPageValidator().getText().contains("BMW Service and Repair Packages"),
				"BRI package status");

		new Actions(driver).sendKeys(Keys.PAGE_DOWN).build().perform();
		new Actions(driver).moveToElement(status.getSubmit()).build().perform();

		status.getSubmit().click();
		Thread.sleep(3000);
		getScreenshot("invalid_value_error_BRI");
		Thread.sleep(2000);
		log.info(status.getAlert().getText());

	}

	/**
	 * Method for wheel set broken link test
	 * 
	 * @author sarthak-pc
	 * @throws InterruptedException
	 * @throws IOException
	 */

	public void testBRIPackageServices() throws InterruptedException, IOException {

		log.info("BRI package services");
		lp.getNavServices().click();
		log.info("clicking on services tab");
		Thread.sleep(2000);

		lp.getBRIPackageStatus().click();
		Thread.sleep(2000);

		BRIPackageStatus status = new BRIPackageStatus(driver);

		status.getServiceButton().click();
		Thread.sleep(1000);
		getScreenshot("bri_services");
		log.info("clicking services");

		status.getBmwAccessoriesButton().click();
		Thread.sleep(1000);
		getScreenshot("bri_accessories");

		status.getCompleteWheelSet().click();
		Thread.sleep(2000);

		getAssert(driver.getTitle().equals("Error Page"), "error page not found");

		BMWErrorPage errorPage = new BMWErrorPage(driver);

		new Actions(driver).sendKeys(Keys.PAGE_DOWN).build().perform();
		getScreenshot("wheelset_error_page");
		log.error("Wheel set page not found");
		log.error(errorPage.getErrorText().getText());
		Thread.sleep(2000);

		Assert.fail("Wheel set page not found");

	}

	// *****************************Module 6 started*********************

	/**
	 * Method Name:clickOnFinance
	 * 
	 * @throws IOException
	 *             Author:Sadiq
	 */
	public void clickOnFinance() throws IOException {
		try {
			lp.getFinance().click();
		} catch (Exception e) {
			lp.getFinanceNew().click();
		}
		getScreenshot("Finance on click");
	}

	/**
	 * Method Name:VerifyAllLink
	 * 
	 * @throws IOException
	 *             Author:Sadiq
	 */
	public void VerifyAllLink() throws IOException {
		List<WebElement> links;
		try {
			links = lp.getAllLinks();
		} catch (Exception e) {
			links = lp.getAllLinksNew();
		}

		for (int i = 0; i < links.size(); i++) {
			Assert.assertTrue(links.get(i).isEnabled(), "The link is not Clickable");
		}
		getScreenshot("VerifyLinks");
	}

	/**
	 * Method Name:clickOnEmi
	 * 
	 * @throws IOException
	 *             Author:Sadiq
	 */
	public void clickOnEmi() throws IOException {
		try {

			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(lp.getEMICalculator()));
			lp.getEMICalculator().click();
		} catch (Exception e) {
			lp.getEMICalculatorNew().click();
		}
	}

	/**
	 * Method Name:CalculateEMI 
	 * 
	 * @throws IOException
	 *             Author:Sadiq
	 */
	public void CalculateEMI() throws InterruptedException, IOException {

		EMIPage emiPage = new EMIPage(driver);
		String prsentHandles = driver.getWindowHandle();// Handles new window
		clickOnEmi();
		getScreenshot("Click on EMI");
		log.info("Clicked On EMI");

		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);

		Set<String> allHandles = driver.getWindowHandles();// Switching new Window handles
		for (String s : allHandles) {
			if (!s.equals(prsentHandles)) {
				driver.switchTo().window(s);
				driver.navigate().refresh();
				log.info("Handles is changed");
				getScreenshot("EMI Calculator");
				break;
			}
		}

		new Actions(driver).moveToElement(emiPage.getSubmit()).build().perform();
		Thread.sleep(3000);

		String actual = driver.getTitle();// Verify Title
		String Expected = "BMW EMI calculator";
		Assert.assertEquals(actual, Expected);

		emiPage.getFuelType().click(); // Clicking on Fuel
		getScreenshot("Clicked on Fuel");
		log.info("Clicked on Fuel");

		Select cars = new Select(emiPage.getSelectCar());// Selecting CarsType
		cars.selectByVisibleText("330i Sport");
		getScreenshot("Clicked on Cars");
		log.info("Clicked on cars");

		emiPage.getPlans().click();// Clicking on plans
		Thread.sleep(1000);
		getScreenshot("Clicked on Plan");
		log.info("Clicked on Plan");

		emiPage.getSubmit().click();// Clicking on submit
		Thread.sleep(1000);
		getScreenshot("Clicked on Submit");
		log.info("Clicked on Submit");

		emiPage.getCalculate().click();// Clicking on Calculate
		Thread.sleep(5000);
		getScreenshot("Clicked on Calculate");
		log.info("Clicked on Calculate");
		Thread.sleep(3000);
		log.info("EMIRecords is generated");

		Map<String, String> emicalculatorData = new HashMap<String, String>();// Generating EMI records
		emicalculatorData.put("MonthlyPayment", emiPage.getMonthlyPayment().getText().substring(1));
		emicalculatorData.put("Deposit", emiPage.getYourDeposit().getText());
		emicalculatorData.put("Terms", emiPage.getTerms().getText());
		emicalculatorData.put("BulletAmount", emiPage.getBulletAmount().getText());
		WritetoExcel.writeToExcel(emicalculatorData, "EMICaluculator"); // writing to excel
		log.info("EMIRecords is Name generated");
		getScreenshot("records");

	}

	/**
	 * Method Name:clickonLoan
	 * 
	 * @throws IOException
	 *             Author:Sadiq
	 */
	public void clickonLoan() throws IOException {
		lp.getLoan().click();
		log.info("Clicked on Loan");
		getScreenshot("Loans");
	}

	/**
	 * Method Name:VerifyLoan
	 * 
	 * @throws IOException
	 *             Author:Sadiq
	 */
	public void VerifyLoan() throws IOException {
		LoanPage loanPage = new LoanPage(driver);
		Map<String, String> loanData = new HashMap<String, String>();
		Assert.assertTrue(loanPage.getLoanFilm().isEnabled());

		loanData.put("PLan1", loanPage.getPlan1().getText());// Generating Loan records
		loanData.put("PLan2", loanPage.getPlan2().getText());
		loanData.put("PLan3", loanPage.getPlan3().getText());
		loanData.put("PLan4", loanPage.getPlan4().getText());
		WritetoExcel.writeToExcel(loanData, "Loan_Plans_Record");// writing to excel
		String actual = driver.getTitle();
		String Expected = "BMW Financial Services: Loan Offers";

		Assert.assertEquals(actual, Expected, "Does not meet Requirement");// verify title
	}

	/**
	 * Method Name:TestLeasing
	 * 
	 * @throws IOException
	 *             Author:Sadiq
	 * @throws InterruptedException
	 */
	public void TestLeasing() throws IOException, InterruptedException {
		LeasingPage leasPage = new LeasingPage(driver);
		try {
			lp.getLeasingNew().click();
			log.info("Clicked on Leasing");
			getScreenshot("Leasing");
		} catch (Exception e) {
			lp.getLeasing().click();
			log.info("Clicked on Leasing");
			getScreenshot("Leasing");
		}
		Thread.sleep(3000);
		String actual = driver.getTitle();
		String Expected = "BMW Financial Services: Leasing Offers";
		Assert.assertEquals(actual, Expected);
		String LeasingData = leasPage.getBmwFinanceLeasing().getText();
		Map<String, String> leasData = new HashMap<String, String>();// Generating Leasing records
		leasData.put("Data", LeasingData);
		WritetoExcel.writeToExcel(leasData, "LeasRecords");// writing to excel
	}

	// *************************Module 7 started*********************************
	/**
	 * BMWModule7TestLinksTC_43 to click on BMW World
	 * 
	 * @author Rasika
	 * @throws IOException
	 */
	public void Click_BMW_World() throws IOException {

		String Actualtitle = driver.getTitle();
		String ExpectedTitle = "en_IN";
		Assert.assertEquals(Actualtitle, ExpectedTitle);
		getScreenshot("landing page");

		lp.Click_on_BMWWorld().click();
		log.info("Clicked Bmw world");

	}

	/**
	 * BMWModule7JoyFestTC_44 to click on BMW Event and BMW JoyFest click on Request
	 * For Info
	 * 
	 * @author Rasika
	 * @throws IOException
	 * @throws InterruptedException
	 */

	public void Click_BMW_JoyFest() throws IOException, InterruptedException {
		String Actualtitle = driver.getTitle();
		String ExpectedTitle = "en_IN";
		Assert.assertEquals(Actualtitle, ExpectedTitle);
		BMW_JoyFest joyFest = new BMW_JoyFest(driver);

		lp.Click_on_BMWWorld().click();
		Thread.sleep(2000);
		log.info("Clicked BMW world");
		Thread.sleep(2000);

		lp.Click_on_BMWFest().click();
		getScreenshot("BMW FEST page");
		log.info("Clicked BMW JoyFest");

		String Actualtitle1 = driver.getTitle();
		String ExpectedTitle1 = "BMW Joyfest";
		Assert.assertEquals(Actualtitle1, ExpectedTitle1);
		joyFest.Click_on_Request().click();
		log.info("Clicked on Request");

		Thread.sleep(2000);
		String Actualtitle2 = driver.getTitle();
		String ExpectedTitle2 = "BMW India | Test Drive";
		Assert.assertEquals(Actualtitle2, ExpectedTitle2);

	}

	/**
	 * BMWModule7ReqForInfoTC_45_TC_55 to fill the Request for Info form
	 * 
	 * @author Rasika
	 * @throws InterruptedException
	 * @throws IOException
	 */

	public void Request_For_Info() throws InterruptedException, IOException {

		String Actualtitle = driver.getTitle();
		String ExpectedTitle = "en_IN";
		Assert.assertEquals(Actualtitle, ExpectedTitle);
		BMW_JoyFest joyFest = new BMW_JoyFest(driver);

		Request_For_Info reqInfo = new Request_For_Info(driver);

		lp.Click_on_BMWWorld().click();
		log.info("Clicked BMW world");

		Thread.sleep(2000);
		lp.Click_on_BMWFest().click();
		getScreenshot("BMW FEST page");
		log.info("Clicked BMW JoyFest");

		String Actualtitle1 = driver.getTitle();
		String ExpectedTitle1 = "BMW Joyfest";
		Assert.assertEquals(Actualtitle1, ExpectedTitle1);
		Thread.sleep(2000);

		joyFest.Click_on_Request().click();
		log.info("Clicked Request");

		String Actualtitle2 = driver.getTitle();
		String ExpectedTitle2 = "BMW India | Test Drive";
		Assert.assertEquals(Actualtitle2, ExpectedTitle2);
		getScreenshot("Requestforinfo page");

		Thread.sleep(2000);
		reqInfo.Dropdown().click();
		reqInfo.Salutaion().click();
		Thread.sleep(1000);
		Map<String, String> map = ReadFromExcel.getExcelData("RequestInformation.xlsx");
		reqInfo.First_Name().sendKeys(map.get("firstname"));
		reqInfo.Last_Name().sendKeys(map.get("lastname"));
		Thread.sleep(1000);

		reqInfo.Pref_model().click();
		reqInfo.Series().click();
		reqInfo.Mobile_Number().sendKeys(map.get("mobile"));
		Thread.sleep(2000);
		reqInfo.Email_ID().sendKeys(map.get("email"));
		reqInfo.Check_Box().click();
		Thread.sleep(2000);
		reqInfo.Submit().click();
		log.info("Filled the Form");

	}

	/**
	 * BMWModule7TechnologyTC_56 to click on BMW World and BMW Technology and
	 * Innovation
	 * 
	 * @author Rasika
	 * @throws IOException
	 * @throws InterruptedException
	 */

	public void BMW_Tech_Innovation() throws IOException, InterruptedException {

		String Actualtitle = driver.getTitle();
		String ExpectedTitle = "en_IN";
		Assert.assertEquals(Actualtitle, ExpectedTitle);
		getScreenshot("Landing page");

		lp.Click_on_BMWWorld().click();
		log.info("Clicked BMW world");

		try {
			lp.Click_on_BMWTech().click();
			System.out.println("old");

		} catch (Exception e) {
			new Actions(driver).moveToElement(lp.getBMWTechnew()).build().perform();
			System.out.println("new");

			Thread.sleep(2000);
		}
		log.info("Clicked BMW Technology & Innovation");

	}

	/**
	 * BMWModule7ConsumptionTC_57 To click on Consumption and Emission
	 * 
	 * @throws IOException
	 * @throws InterruptedException
	 */

	public void BMW_Consumption() throws IOException, InterruptedException {

		String Actualtitle = driver.getTitle();
		String ExpectedTitle = "en_IN";
		Assert.assertEquals(Actualtitle, ExpectedTitle);
		getScreenshot("Landing page");

		lp.Click_on_BMWWorld().click();
		log.info("Clicked BMW world");

		try {
			System.out.println("old");
			lp.Click_on_BMWTech().click();
		} catch (Exception e) {
			System.out.println("new");
			new Actions(driver).moveToElement(lp.getBMWTechnew()).build().perform();
			Thread.sleep(2000);
		}
		log.info("Clicked BMW Technology & Innovation");

		lp.Click_on_Consump_Emmi().click();
		log.info("Clicked Consumption");

		getScreenshot("Consupmtion page");
		Thread.sleep(2000);

		String Actualtitle2 = driver.getTitle();
		String ExpectedTitle2 = "BMW EfficientDynamics: Consumption & Emissions";
		Assert.assertEquals(Actualtitle2, ExpectedTitle2);
	}

	/**
	 * BMWModule7SwitchWLTPTC_58 to Switch between content of who changes over whom
	 * frame
	 * 
	 * @throws IOException
	 * @throws InterruptedException
	 */

	public void BMW_Switch_Content() throws IOException, InterruptedException {

		Consumption_Emission consump = new Consumption_Emission(driver);

		String Actualtitle = driver.getTitle();
		String ExpectedTitle = "en_IN";
		Assert.assertEquals(Actualtitle, ExpectedTitle);

		lp.Click_on_BMWWorld().click();
		log.info(" Clicked BMW world");
		try {
			System.out.println("old");
			lp.Click_on_BMWTech().click();
		} catch (Exception e) {
			System.out.println("new");
			new Actions(driver).moveToElement(lp.getBMWTechnew()).build().perform();
			Thread.sleep(2000);
		}
		log.info("Clicked BMW Technology & Innovation");
		lp.Click_on_Consump_Emmi().click();
		log.info("Clicked Consumption");

		Thread.sleep(5000);

		String Actualtitle2 = driver.getTitle();
		String ExpectedTitle2 = "BMW EfficientDynamics: Consumption & Emissions";
		Assert.assertEquals(Actualtitle2, ExpectedTitle2);
		getScreenshot("Consumptionpage");

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		new Actions(driver).sendKeys(Keys.PAGE_DOWN).build().perform();
		new Actions(driver).sendKeys(Keys.PAGE_DOWN).build().perform();
		new Actions(driver).sendKeys(Keys.PAGE_DOWN).build().perform();
		new Actions(driver).sendKeys(Keys.PAGE_DOWN).build().perform();

		Map<String, String> map = new HashMap<String, String>();

		map.put(consump.getTestequip_table().getText(), consump.getTestequipval_table().getText());
		map.put(consump.getTesttemp_table().getText(), consump.getTesttempval_table().getText());
		map.put(consump.getTestspeed_table().getText(), consump.getTestspeedkm_table().getText());
		map.put(consump.getTestphase_table().getText(), consump.getTesturban_table().getText());
		map.put(consump.getTimespent_table().getText(), consump.getTimespentper_table().getText());
		map.put(consump.getTestdistance_table().getText(), consump.getTestdistancekm_table().getText());
		map.put(consump.getTestduration_table().getText(), consump.getTestdurationMin_table().getText());
		map.put(consump.getProcedure_table().getText(), consump.getNedc_table().getText());

		WritetoExcel.writeToExcel(map, "WltpComparedWithNEDCTable");

		new Actions(driver).moveToElement(consump.getSlider()).build().perform();
		new Actions(driver).sendKeys(Keys.ARROW_DOWN).build().perform();
		new Actions(driver).sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);

		driver.switchTo().frame(consump.getIframe());

		new Actions(driver).sendKeys(Keys.PAGE_DOWN).build().perform();

		Thread.sleep(5000);
		consump.getSep_Xpath_Path().click();
		getScreenshot("WLTPChanges1");

		String txt = consump.getInfo().getText();
		System.out.println("The Switched text is = " + txt);

		Thread.sleep(2000);
		consump.getOct_Xpath_Path().click();
		getScreenshot("WLTPChanges2");

		String txt2 = consump.getInfo2().getText();
		System.out.println("The Switched text is = " + txt2);

		consump.getT2021_Xpath_Path().click();
		getScreenshot("WLTPChanges3");
		String txt3 = consump.getInfo3().getText();
		System.out.println("The Switched text is = " + txt3);

		driver.switchTo().defaultContent();

	}

	/**
	 * BMWModule7MilestoneTC_59 to Switch between content of who changes over whom
	 * frame to switch between the milestone range bar
	 * 
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void BMW_Milestone() throws InterruptedException, IOException {

		Consumption_Emission consump = new Consumption_Emission(driver);

		String Actualtitle = driver.getTitle();
		String ExpectedTitle = "en_IN";
		Assert.assertEquals(Actualtitle, ExpectedTitle);

		lp.Click_on_BMWWorld().click();
		log.info(" Clicked BMW world");
		try {

			lp.Click_on_BMWTech().click();
			System.out.println("old");
		} catch (Exception e) {

			new Actions(driver).moveToElement(lp.getBMWTechnew()).build().perform();
			System.out.println("new");
			Thread.sleep(2000);
		}
		log.info("Clicked BMW Technology & Innovation");
		lp.Click_on_Consump_Emmi().click();
		log.info("Clicked Consumption");

		Thread.sleep(5000);

		String Actualtitle2 = driver.getTitle();
		Thread.sleep(2000);
		String ExpectedTitle2 = "BMW EfficientDynamics: Consumption & Emissions";
		Assert.assertEquals(Actualtitle2, ExpectedTitle2);
		getScreenshot("Consumptionpage");

		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		new Actions(driver).sendKeys(Keys.PAGE_DOWN).build().perform();
		new Actions(driver).sendKeys(Keys.PAGE_DOWN).build().perform();
		new Actions(driver).sendKeys(Keys.PAGE_DOWN).build().perform();
		new Actions(driver).sendKeys(Keys.PAGE_DOWN).build().perform();

		Map<String, String> map = new HashMap<String, String>();

		map.put(consump.getTestequip_table().getText(), consump.getTestequipval_table().getText());
		map.put(consump.getTesttemp_table().getText(), consump.getTesttempval_table().getText());
		map.put(consump.getTestspeed_table().getText(), consump.getTestspeedkm_table().getText());
		map.put(consump.getTestphase_table().getText(), consump.getTesturban_table().getText());
		map.put(consump.getTimespent_table().getText(), consump.getTimespentper_table().getText());
		map.put(consump.getTestdistance_table().getText(), consump.getTestdistancekm_table().getText());
		map.put(consump.getTestduration_table().getText(), consump.getTestdurationMin_table().getText());
		map.put(consump.getProcedure_table().getText(), consump.getNedc_table().getText());

		WritetoExcel.writeToExcel(map, "WltpComparedWithNEDCTable");

		new Actions(driver).moveToElement(consump.getSlider()).build().perform();
		new Actions(driver).sendKeys(Keys.ARROW_DOWN).build().perform();
		new Actions(driver).sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		driver.switchTo().frame(consump.getIframe());

		new Actions(driver).sendKeys(Keys.PAGE_DOWN).build().perform();

		Thread.sleep(5000);
		consump.getSep_Xpath_Path().click();
		getScreenshot("WLTPChanges1");

		String txt = consump.getInfo().getText();
		System.out.println("The Switched text is = " + txt);

		Thread.sleep(2000);
		consump.getOct_Xpath_Path().click();
		getScreenshot("WLTPChanges2");

		String txt2 = consump.getInfo2().getText();
		System.out.println("The Switched text is = " + txt2);

		consump.getT2021_Xpath_Path().click();
		getScreenshot("WLTPChanges3");
		String txt3 = consump.getInfo3().getText();
		System.out.println("The Switched text is = " + txt3);

		driver.switchTo().defaultContent();

		// range bar
		driver.get(
				"https://www.bmw.in/content/dam/bmw/common/topics/offers-and-services/bmw-efficient-dynamics/Update_2016/addons/timeline/index.html?content=/content/dam/bmw/marketIN/bmw_in/Topics/Update_2016/timeline/content_en.json");
		Thread.sleep(2000);

		String nedc = consump.getMilestoneData().getText();
		System.out.println("The one  text is = " + nedc);
		Thread.sleep(2000);

		consump.getTransitionPhase().click();
		String transition = consump.getMilestoneData().getText();
		System.out.println("The 2  text is = " + transition);
		Thread.sleep(2000);

		consump.getWltp().click();
		String wltp = consump.getMilestoneData().getText();
		System.out.println("The  3 text is = " + wltp);
		Thread.sleep(2000);

		consump.getRde().click();
		String rde = consump.getMilestoneData().getText();
		System.out.println("The 4 text is = " + rde);
		Thread.sleep(2000);

		consump.getWltp_rde().click();
		String wltp_rde = consump.getMilestoneData().getText();
		System.out.println("The 5 text is = " + wltp_rde);

	}

	// ********************Utility Methods*****************

	/**
	 * Created By = Shivam Srivastava
	 * 
	 * Description = This method validates the title of Technical Data page
	 * 
	 * @throws InterruptedException
	 */
	public void validateTechDataTitle() throws InterruptedException {

		Thread.sleep(2000);
		String techDataTitle = driver.getTitle();
		if (techDataTitle.contains("Technical Data"))

		{
			log.info("Title matched");
		}

	}

	/**
	 * Created By = Shivam Srivastava Description = This is generic method to switch
	 * to child window handle
	 * 
	 */
	public void switchToChildWindow() {

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> iter = handles.iterator();
		String parentWindow = iter.next();
		String childWindow = iter.next();
		driver.switchTo().window(childWindow);
		log.info("Switched window to child");
	}

	/**
	 * Generic method for assert true and fail with logging
	 * 
	 * @author sarthak
	 * @param flag
	 * @param data
	 * 
	 */
	public void getAssert(boolean flag, String data) {

		try {

			Assert.assertTrue(flag, "Assert failed for the " + data);
			log.info("Assert passed for the " + data);
		} catch (Exception e) {

			log.error("assert failed for the " + data);
			Assert.fail("Assert failed for the " + data);
		}

	}

	/**
	 * Method for navigating back to the homepage and clicking services tab
	 * 
	 * @author sarthak
	 *
	 * 
	 *
	 */
	public void getServicesTab() {

		driver.navigate().back();
		lp.getNavServices().click();
		log.info("going back to services tab");

	}

	/**
	 * Method for handling dropdowns
	 * 
	 * @author sarthak-pc
	 * @param data
	 * @param value
	 */
	public void getSelectValue(WebElement data, String value) {

		Select select = new Select(data);
		select.selectByValue(value);

	}

	/**
	 * Function to Check the Title of the Page
	 * 
	 * @author Samdras
	 * @param Actualtitle
	 * @param ExpectedTitle
	 * 
	 */
	public void Title_Validation(String Actualtitle, String ExpectedTitle) {
		Assert.assertEquals(Actualtitle, ExpectedTitle);
	}

}
