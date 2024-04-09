package bmw_pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FeaturesToBuildBMW {

	public WebDriver driver;

	public FeaturesToBuildBMW(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//span[@class='h5vco-icon-new h5vco-icon-radio'])[2]")
	private WebElement DieselEngine;
	
	@FindBy(xpath = "(//span[contains(@class,'h5vco-h2 h5vco-user-selectable')])[2]")
	private WebElement DieselEngineName;
	

	@FindBy(xpath = "//div[text()='Exterior']")
	private WebElement exteriors;

	@FindBy(xpath = "(//img[@class='h5vco-feature-image'])[4]")
	private WebElement exteriorBurgundyPaintImage;
	
	@FindBy(xpath = "(//strong[contains(@class,'h5vco-feature-description h5vco-user-selectable')])[4]")
	private WebElement exteriorBurgundyPaintName;
	
	@FindBy(xpath = "//div[text()='Rims']")
	private WebElement rims;
	
	@FindBy(xpath = "//strong[contains(@class,'h5vco-feature-description h5vco-user-selectable')]")
	private WebElement rimsDetails;

	@FindBy(xpath = "//div[text()='Interior']")
	private WebElement interiors;

	@FindBy(xpath = "(//img[@class='h5vco-feature-image'])[3]")
	private WebElement interiorsUpholsteryImage;

	@FindBy(xpath = "(//strong[contains(@class,'h5vco-feature-description h5vco-user-selectable')])[3]")
	private WebElement interiorsUpholsteryName;
	
	@FindBy(xpath = "//div[text()='Trims']")
	private WebElement trims;
	
	@FindBy(xpath = "//strong[contains(@class,'h5vco-feature-description h5vco-user-selectable')]")
	private WebElement trimsName;
	
	@FindBy(xpath = "//div[text()='Summary']")
	private WebElement summary;
	
	@FindBy(xpath = "//a[contains(@class,'h5vco-button ng-scope')]//span[1]")
	private WebElement downloadSummary;

	public WebElement getDieselEngine() {
		return DieselEngine;
	}

	public WebElement getExteriors() {
		return exteriors;
	}
	
	

	public WebElement getDieselEngineName() {
		return DieselEngineName;
	}

	public WebElement getExteriorBurgundyPaintImage() {
		return exteriorBurgundyPaintImage;
	}

	public WebElement getExteriorBurgundyPaintName() {
		return exteriorBurgundyPaintName;
	}

	public WebElement getRims() {
		return rims;
	}

	public WebElement getRimsDetails() {
		return rimsDetails;
	}

	public WebElement getInteriors() {
		return interiors;
	}

	public WebElement getInteriorsUpholsteryImage() {
		return interiorsUpholsteryImage;
	}

	public WebElement getInteriorsUpholsteryName() {
		return interiorsUpholsteryName;
	}

	public WebElement getTrims() {
		return trims;
	}

	public WebElement getTrimsName() {
		return trimsName;
	}
	
	public WebElement getSummary() {
		return summary;
	}

	public WebElement getDownloadSummary() {
		return downloadSummary;
	}
	
}
