package bmw_pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCarModels {

	public WebDriver driver;

	public NewCarModels(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//h5[@class='font_bold'])[3]")
	private WebElement newCarseries7ThirdModelName;
	
	@FindBy(xpath = "(//h4[contains(@class,'ex-price mb-1')])[3]")
	private WebElement newCarseries7ThirdModelPrice;
	
	@FindBy(xpath = "//img[@title='Royal Burgundy Red Brilliant Effect']")
	private WebElement newCarseries7ThirdModelExterior;
	
	@FindBy(xpath = "(//div[@class='ng-star-inserted']//img)[3]")
	private WebElement newCarseries7ThirdModelInterior;
	
	@FindBy(xpath = "(//h6[@class='chkbox-text ng-star-inserted'])[1]")
	private WebElement newCarseries7ThirdModelExteriorName;
	
	@FindBy(xpath = "(//h6[@class='chkbox-text ng-star-inserted'])[2]")
	private WebElement newCarseries7ThirdModelInteriorName;
	
	@FindBy(xpath = "(//button[contains(@class,'mt-2 btn')])[3]")
	private WebElement newCarseries7CheckAvailability;
	
	@FindBy(xpath = "//input[@formcontrolname='pincode']")
	private WebElement newCarPinCode;
	
	@FindBy(xpath = "(//select[contains(@class,'form-control custom-select')])[4]")
	private WebElement newCarCity;
	
	@FindBy(xpath = "//button[contains(@class,'mt-3 btn')]")
	private WebElement newCarOkButton;
	
	@FindBy(xpath = "//h5[@class='mt-3']")
	private WebElement newCarAvailability;

	public WebElement getNewCarseries7ThirdModelName() {
		return newCarseries7ThirdModelName;
	}

	public WebElement getNewCarseries7ThirdModelPrice() {
		return newCarseries7ThirdModelPrice;
	}

	public WebElement getNewCarseries7ThirdModelExterior() {
		return newCarseries7ThirdModelExterior;
	}

	public WebElement getNewCarseries7ThirdModelInterior() {
		return newCarseries7ThirdModelInterior;
	}

	public WebElement getNewCarseries7ThirdModelExteriorName() {
		return newCarseries7ThirdModelExteriorName;
	}

	public WebElement getNewCarseries7ThirdModelInteriorName() {
		return newCarseries7ThirdModelInteriorName;
	}

	public WebElement getNewCarseries7CheckAvailability() {
		return newCarseries7CheckAvailability;
	}

	public WebElement getNewCarPinCode() {
		return newCarPinCode;
	}

	public WebElement getNewCarCity() {
		return newCarCity;
	}

	public WebElement getNewCarOkButton() {
		return newCarOkButton;
	}

	public WebElement getNewCarAvailability() {
		return newCarAvailability;
	}
	
	
	
}
