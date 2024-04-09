package bmw_pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompareModels {
	
	public WebDriver driver;

	public CompareModels(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "(//span[text()='Add to comparison'])[5]")
	private WebElement compareSeries7Sedan;
	
	@FindBy(xpath = "//div[@id='h5vco-model-finder-widget']/section[7]/div[2]/div[3]/a[1]/span[2]")
	private WebElement compareSeriesM2;

	@FindBy(xpath = "(//button[contains(@class,'h5vco-s2-button h5vco-s2-button-corp-blue')])[2]")
	private WebElement compareButton;

	@FindBy(xpath = "(//h3[contains(@class,'h5vco-s2-h3 h5vco-vehicle-name')])[1]")
	private WebElement comparedCar1Name;
	
	@FindBy(xpath = "(//h3[contains(@class,'h5vco-s2-h3 h5vco-vehicle-name')])[2]")
	private WebElement comparedCar2Name;
	
	@FindBy(xpath = "(//div[contains(@class,'h5vco-compare-tab-cell ng-binding')])[1]")
	private WebElement compareParameter;
	
	@FindBy(xpath = "(//div[contains(@class,'h5vco-compare-tab-cell ng-binding')])[2]")
	private WebElement compareParameterType;
	
	@FindBy(xpath = "(//div[text()='- '])[1]")
	private WebElement car1ParameterValue;
	
	@FindBy(xpath = "(//div[text()='- '])[2]")
	private WebElement car2ParameterValue;
	
	public WebElement getCompareSeries7Sedan() {
		return compareSeries7Sedan;
	}

	public WebElement getCompareSeriesM2() {
		return compareSeriesM2;
	}
	
	public WebElement getCompareButton() {
		return compareButton;
	}

	public WebElement getComparedCar1Name() {
		return comparedCar1Name;
	}

	public WebElement getComparedCar2Name() {
		return comparedCar2Name;
	}

	public WebElement getCompareParameter() {
		return compareParameter;
	}

	public WebElement getCompareParameterType() {
		return compareParameterType;
	}

	public WebElement getCar1ParameterValue() {
		return car1ParameterValue;
	}

	public WebElement getCar2ParameterValue() {
		return car2ParameterValue;
	}
	
	

}
