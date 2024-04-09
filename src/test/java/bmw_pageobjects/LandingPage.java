/**
 *@author sarthak-pc 
 */
package bmw_pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author sarthak-pc
 *
 */
public class LandingPage {

	public WebDriver driver;

	public LandingPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	/**
	 * @author samdras
	 */
	// ***********Landing Page elements for module 1***************
	// @FindBy for TC_002 (to check all the four Options Models, Services, Finance,
	// BMW World)
	@FindBy(linkText = "Models")
	private WebElement Model_Xpath_Path;

	@FindBy(linkText = "Services")
	private WebElement Services_Xpath_Path;

	@FindBy(linkText = "BMW World")
	private WebElement BMWWorld_Xpath_Path;

	@FindBy(linkText = "Finance")
	private WebElement Finance_Xpath_Path;

	// End @FindBy for TC_003 (to check Image Slider)

	@FindBy(xpath = "(//*[@class='is-active'])[1]")
	private WebElement Imageslider1;

	@FindBy(xpath = "(//*[@class='is-active'])[2]")
	private WebElement Imageslider2;

	@FindBy(xpath = "(//*[@class='is-active'])[3]")
	private WebElement Imageslider3;

	@FindBy(xpath = "(//*[@class='is-active'])[4]")
	private WebElement Imageslider4;

	// @FindBy for TC_004 (to check BMW Logo)

	@FindBy(xpath = "(//img[@alt='BMW Logo'])[2]")
	private WebElement BMW_Logo;

	// @FindBy for TC_005 (to check Dealear Locator Logo)

	// @FindBy(xpath ="(//*[@class='tw-text-800 icon-dealer-locator'])[1]")
	@FindBy(xpath = "(//*[@title='Dealer Locator'])[1]")
	private WebElement Dealer_locator_Logo;

	// @FindBy for TC_006 (to check Test Drive Logo)
	@FindBy(xpath = "(//*[@title='Test drive'])[1]")
	private WebElement Test_Drive_Logo;

	// @FindBy for TC_007 (to check Series Option available)
	@FindBy(linkText = "Series")
	private WebElement Series_xpath;

	// @FindBy for TC_008 (to check Body Type available)
	@FindBy(linkText = "Body types")
	private WebElement BodyType_xpath;

	// @FindBy for TC_009 (to check Images Are present or not)
	@FindBy(xpath = "(//img[@alt='BPS'])[1]")
	private WebElement Image_xpath1;

	@FindBy(xpath = "//*[@src='/content/dam/bmw/marketIN/bmw_in/teaserimages/Covid-19-medium-teaser.jpg']")
	private WebElement Image_xpath2;

	@FindBy(xpath = "//*[@src='/content/dam/bmw/marketIN/bmw_in/teaserimages/fs-homepage-890x500.jpg']")
	private WebElement Image_xpath3;

	@FindBy(xpath = "//*[@src='/content/dam/bmw/marketIN/bmw_in/teaserimages/vision-m-next.png']")
	private WebElement Image_xpath4;

	// @FindBy for TC_010 (to check the outer Link here i check only four link out
	// of all the links)
	@FindBy(linkText = "Find a Dealer")
	private WebElement Outerlink_dealer_xpath;

	@FindBy(linkText = "Request a Test Drive")
	private WebElement Outerlink_Request_dealer_xpath;

	@FindBy(linkText = "BMW Excellence Club")
	private WebElement Outerlink_BMW_Excellence_Club_xpath;

	@FindBy(linkText = "Privacy Policy")
	private WebElement Outerlink_Privacy_Policy_xpath;

	//******************Module 2,3,4************
	
	

	@FindBy(xpath = "(//a[@class='all-models-button'])[1]")
	private WebElement allModels;

	@FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div[3]/div[2]/div/a[1]/span[2]")
	private WebElement buildYourBMW;

	@FindBy(xpath = "(//span[text()='Used cars'])[2]")
	private WebElement usedCars;
	
	
	
	/**
	 * 
	 */

	// ************Landing page elements for module 5**************

	@FindBy(linkText = "Models")
	private WebElement navModels;

	@FindBy(linkText = "Services")
	private WebElement navServices;

	@FindBy(xpath = "//a[text()=' Service and Warranty ']")
	private WebElement servicesAndWarranty;

	@FindBy(xpath = "//span[@class='lg:tw-w-3/4 tw-pl-400']")
	private List<WebElement> tabList;

	// *************services and warranty tabs ************************

	@FindBy(linkText = "BMW Joy Rewards")
	private WebElement JoyRewards;

	@FindBy(linkText = "Workshop Offers")
	private WebElement WorkshopOffers;

	@FindBy(linkText = "Service Inclusive")
	private WebElement ServiceInclusive;

	@FindBy(linkText = "Fast Lane Service")
	private WebElement FastLaneService;

	@FindBy(linkText = "Accident Management")
	private WebElement AccidentManagement;

	@FindBy(linkText = "BMW Original Parts")
	private WebElement BMWOriginalParts;

	@FindBy(linkText = "Recall Information")
	private WebElement RecallInformation;

	@FindBy(linkText = "BSI BRI Package Status Check")
	private WebElement BRIPackageStatus;

	// **************BMW lifestyle tab*****************

	@FindBy(linkText = "BMW Lifestyle")
	private WebElement bmwLifeStyle;

	@FindBy(xpath = "(//span[@class='ds2-first-level-label'])[2]")
	private WebElement bmwLifeStyleNew;

	// *************BMW Lifestyle Elements***********

	@FindBy(linkText = "BMW Collection")
	private WebElement BMWCollection;

	@FindBy(linkText = "BMW Motorsport Collection")
	private WebElement BMWMotorSportCollection;

	@FindBy(linkText = "BMW i Collection")
	private WebElement BMWiCollection;

	@FindBy(linkText = "BMW M Collection")
	private WebElement BMWMCollection;

	@FindBy(linkText = "BMW Kids Collection")
	private WebElement BMWKidsCollection;

	@FindBy(linkText = "BMW Sports Collection")
	private WebElement BMWSportsCollection;

	@FindBy(linkText = "BMW Miniatures")
	private WebElement BMWMiniatures;

	@FindBy(linkText = "BMW Mobility")
	private WebElement BMWMobility;

	// ****************BMW Accessories tab******************
	@FindBy(linkText = "BMW Accessories")
	private WebElement bmwAccessories;

	@FindBy(xpath = "(//span[@class='ds2-first-level-label'])[3]")
	private WebElement bmwAccessoriesNew;

	@FindBy(linkText = "BMW Accessories Overview")
	private WebElement BMWAccessoriesOverview;

	@FindBy(linkText = "Universal Accessories")
	private WebElement UniversalAccessories;

	@FindBy(linkText = "BMW Wheels and Tyres")
	private WebElement BMWWheelsandTyres;

	@FindBy(linkText = "Travel and Comfort Accessories")
	private WebElement TravelandComfortAccessories;

	@FindBy(linkText = "M Performance Parts")
	private WebElement MPerformanceParts;

	@FindBy(linkText = "Car Care Products")
	private WebElement CarCareProducts;

	// ***********BMW APPS Tab********************

	@FindBy(linkText = "BMW Apps")
	private WebElement bmwApps;

	@FindBy(xpath = "(//span[@class='ds2-first-level-label'])[4]")
	private WebElement bmwAppsNew;

	@FindBy(linkText = "Overview")
	private WebElement Overview;

	@FindBy(linkText = "Catalogue and Owner's guide")
	private WebElement CatalogueandOwnerGuide;

	@FindBy(linkText = "BMW M and Motorsport")
	private WebElement BMWMandMotorsport;

	@FindBy(linkText = "Dealer Service and Equipment")
	private WebElement DealerServiceandEquipment;

	@FindBy(linkText = "Lifestyle and Gadgets")
	private WebElement LifestyleandGadgets;

	@FindBy(linkText = "Virtual and Augmented Reality")
	private WebElement VirtualandAugmentedReality;

	@FindBy(xpath = "(//a[@href='/en/all-models.html'])[1]")
	private WebElement discover;

	// ***************Module 6 started*************
	/**
	 * @author sadiq
	 */

	@FindBy(xpath = "//div[@class = 'tw-flex tw-items-start tw-flex-wrap md:tw-mt-300 tw-flex-row']/div[2]/div/div['data-v-652ad255']")
	private List<WebElement> AllLinks;

	@FindBy(xpath = "(//div[@class='ds2-second-level-container ds2-second-level-container_active'])[2]//span[@class='ds2-second-level-label']")
	private List<WebElement> AllLinksNew;

	@FindBy(xpath = "//span[text()='Finance']")
	private WebElement FinanceNew;

	@FindBy(xpath = "(//div[@class='tw-cursor-pointer'])[3]")
	private WebElement Finance;

	// OverView webElement
	@FindBy(xpath = "//span[text()=' Overview ']")
	private WebElement OverView;

	// Loan WebElement
	@FindBy(linkText="Loan")
	private WebElement Loan;

	@FindBy(xpath = "//span[text()='Loan']")
	private WebElement LoanNew;

	// Leasing WebElement
	@FindBy(xpath = "//span[text()=' Leasing ']")
	private WebElement Leasing;

	@FindBy(xpath = "//span[text()='Leasing']")
	private WebElement LeasingNew;

	// FAQ WebElement
	@FindBy(xpath = "(//span[@class='lg:tw-w-3/4 tw-pl-400'])[5]")
	private WebElement FAQ;

	// SpecialOffer WebElement
	@FindBy(xpath = "(//span[@class='lg:tw-w-3/4 tw-pl-400'])[6]")
	private WebElement SpecialOffer;

	// EMICalculator WebElement
	@FindBy(xpath = "//span[text()=' EMI Calculator ']")
	private WebElement EMICalculator;

	@FindBy(xpath = "(//a[@title='EMI Calculator']//span)[1]")
	private WebElement EMICalculatorNew;

	/**
	 * @author rasika
	 */
	// *************Page Factory WebElements for module 7

	@FindBy(linkText = "BMW JoyFest")
	private WebElement BMWEFest_Xpath_Path;

	@FindBy(linkText = "BMW Technology and Innovation")
	private WebElement BMWTech_Xpath_Path;
					
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div[4]/div/div[1]/div[4]/span[1]")
	private WebElement BMWTechnew;

	@FindBy(xpath = "//span[text() = 'Consumption and Emission']")
	private WebElement BMWConsumption_Xpath_Path;

	// ********Page factory get methods module 1***********

	public WebElement Click_on_Model() {
		return Model_Xpath_Path;
	}

	public WebElement Click_on_Services() {
		return Services_Xpath_Path;
	}

	public WebElement Click_on_Finance() {
		return Finance_Xpath_Path;
	}

	public WebElement Click_on_BMWWorld() {
		return BMWWorld_Xpath_Path;
	}

	public WebElement Click_on_Imageslider1() {
		return Imageslider1;
	}

	public WebElement Click_on_Imageslider2() {
		return Imageslider2;
	}

	public WebElement Click_on_Imageslider3() {
		return Imageslider3;
	}

	public WebElement Click_on_Imageslider4() {
		return Imageslider4;
	}

	public WebElement Click_on_BMW_Logo() {
		return BMW_Logo;
	}

	public WebElement Click_on_Dealer_locator_Logo() {
		return Dealer_locator_Logo;
	}

	public WebElement Click_on_Test_Drive_Logo() {
		return Test_Drive_Logo;
	}

	public WebElement Click_on_Series() {
		return Series_xpath;
	}

	public WebElement Click_on_BodyType() {
		return BodyType_xpath;
	}

	public WebElement Display_Image1() {
		return Image_xpath1;
	}

	public WebElement Display_Image2() {
		return Image_xpath2;
	}

	public WebElement Display_Image3() {
		return Image_xpath3;
	}

	public WebElement Display_Image4() {
		return Image_xpath4;
	}

	public WebElement Outerlink_dealer_xpath_Click() {
		return Outerlink_dealer_xpath;
	}

	public WebElement Outerlink_Request_TestDrive_xpath_Click() {
		return Outerlink_Request_dealer_xpath;
	}

	public WebElement Outerlink_BMW_Excellence_Club_xpath_Click() {
		return Outerlink_BMW_Excellence_Club_xpath;
	}

	public WebElement Outerlink_Privacy_Policy_xpath_Click() {
		return Outerlink_Privacy_Policy_xpath;
	}

	//*************Page factory Methods for Module 2,3,4*************
	
	public WebElement getUsedCars() {
		return usedCars;
	}

	public WebElement getAllModels() {
		return allModels;
	}

	public WebElement getBuildYourBMW() {
		return buildYourBMW;
	}
	
	
	
	/**
	 * @author sarthak-pc
	 */
	// **************Page factory methods for Module 5************
	public WebElement getNavModels() {
		return navModels;
	}

	public WebElement getNavServices() {
		return navServices;
	}

	public WebElement getServicesAndWarranty() {
		return servicesAndWarranty;
	}

	public WebElement getBmwLifeStyle() {
		return bmwLifeStyle;
	}

	public WebElement getBmwAccessories() {
		return bmwAccessories;
	}

	public WebElement getBmwApps() {
		return bmwApps;
	}

	public WebElement getJoyRewards() {
		return JoyRewards;
	}

	public WebElement getWorkshopOffers() {
		return WorkshopOffers;
	}

	public WebElement getServiceInclusive() {
		return ServiceInclusive;
	}

	public WebElement getFastLaneService() {
		return FastLaneService;
	}

	public WebElement getAccidentManagement() {
		return AccidentManagement;
	}

	public WebElement getBMWOriginalParts() {
		return BMWOriginalParts;
	}

	public WebElement getRecallInformation() {
		return RecallInformation;
	}

	public WebElement getBRIPackageStatus() {
		return BRIPackageStatus;
	}

	public WebElement getBMWCollection() {
		return BMWCollection;
	}

	public WebElement getBMWMotorSportCollection() {
		return BMWMotorSportCollection;
	}

	public WebElement getBMWiCollection() {
		return BMWiCollection;
	}

	public WebElement getBMWMCollection() {
		return BMWMCollection;
	}

	public WebElement getBMWKidsCollection() {
		return BMWKidsCollection;
	}

	public WebElement getBMWSportsCollection() {
		return BMWSportsCollection;
	}

	public WebElement getBMWMiniatures() {
		return BMWMiniatures;
	}

	public WebElement getBMWMobility() {
		return BMWMobility;
	}

	public WebElement getBMWAccessoriesOverview() {
		return BMWAccessoriesOverview;
	}

	public WebElement getUniversalAccessories() {
		return UniversalAccessories;
	}

	public WebElement getBMWWheelsandTyres() {
		return BMWWheelsandTyres;
	}

	public WebElement getTravelandComfortAccessories() {
		return TravelandComfortAccessories;
	}

	public WebElement getMPerformanceParts() {
		return MPerformanceParts;
	}

	public WebElement getCarCareProducts() {
		return CarCareProducts;
	}

	public WebElement getOverview() {
		return Overview;
	}

	public WebElement getCatalogueandOwnerGuide() {
		return CatalogueandOwnerGuide;
	}

	public WebElement getBMWMandMotorsport() {
		return BMWMandMotorsport;
	}

	public WebElement getDealerServiceandEquipment() {
		return DealerServiceandEquipment;
	}

	public WebElement getLifestyleandGadgets() {
		return LifestyleandGadgets;
	}

	public WebElement getVirtualandAugmentedReality() {
		return VirtualandAugmentedReality;
	}

	public List<WebElement> getTabList() {
		return tabList;
	}

	public WebElement getBmwLifeStyleNew() {
		return bmwLifeStyleNew;
	}

	public WebElement getBmwAccessoriesNew() {
		return bmwAccessoriesNew;
	}

	public WebElement getBmwAppsNew() {
		return bmwAppsNew;
	}

	public WebElement getDiscover() {
		return discover;
	}

	// ***********page factory methods for module 6

	public List<WebElement> getAllLinksNew() {
		return AllLinksNew;
	}

	public WebElement getFinance() {
		return Finance;
	}

	public WebElement getFinanceNew() {
		return FinanceNew;
	}

	public List<WebElement> getAllLinks() {
		return AllLinks;
	}

	public WebElement getOverView() {
		return OverView;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLoanNew() {
		return LoanNew;
	}

	public WebElement getLeasingNew() {
		return LeasingNew;
	}

	public WebElement getEMICalculator() {
		return EMICalculator;
	}

	public WebElement getEMICalculatorNew() {
		return EMICalculatorNew;
	}

	public WebElement getLoan() {
		return Loan;
	}

	public WebElement getLeasing() {
		return Leasing;
	}

	public WebElement getFAQ() {
		return FAQ;
	}

	public WebElement getSpecialOffer() {
		return SpecialOffer;
	}

	/**
	 * @author rasika
	 */

	// *************Page Factory methods for module 7*************

	public WebElement Click_on_BMWFest() {
		return BMWEFest_Xpath_Path;
	}

	public WebElement Click_on_BMWTech() {
		return BMWTech_Xpath_Path;
	}

	public WebElement Click_on_Consump_Emmi() {
		return BMWConsumption_Xpath_Path;
	}

	public WebElement getBMWTechnew() {
		return BMWTechnew;
	}

}
