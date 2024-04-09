package bmw_pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsedCars {

	public WebDriver driver;

	public UsedCars(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@href='/we-want-your-car']")
	private WebElement sellYourCar;
	
	@FindBy(xpath = "//a[@class = 'clear-search']")
	private WebElement clearSearch;

	@FindBy(xpath = "//select[@name = 'city']")
	private WebElement selectCity;

	@FindBy(xpath = "//select[@name = 'model']")
	private WebElement selectModel;

	@FindBy(xpath = "//select[@name = 'fuel']")
	private WebElement selectFuelType;
	
	@FindBy(xpath = "//a[@class='dtlscta pull-left']")
	private WebElement clickOnModelToEnquire;

	@FindBy(xpath = "//a[text() = 'New Cars']")
	private WebElement newCar;
	
	
	public WebElement getNewCar() {
		return newCar;
	}

	public WebElement getClearSearch() {
		return clearSearch;
	}

	public WebElement getSelectCity() {
		return selectCity;
	}

	public WebElement getSelectModel() {
		return selectModel;
	}

	public WebElement getSelectFuelType() {
		return selectFuelType;
	}

	public WebElement getClickOnModelToEnquire() {
		return clickOnModelToEnquire;
	}
	
	public WebElement getSellYourCar() {
		return sellYourCar;
	}

	
}
