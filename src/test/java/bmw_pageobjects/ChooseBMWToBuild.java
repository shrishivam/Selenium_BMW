package bmw_pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChooseBMWToBuild {

	public WebDriver driver;

	public ChooseBMWToBuild(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[text()='Filter']")
	private WebElement filterMenu;
	
	@FindBy(xpath = "//label[text()='7']")
	private WebElement filter;

	@FindBy(xpath = "//span[text()='Hide Filter']")
	private WebElement hideFilter;

	@FindBy(xpath = "(//img[contains(@class,'h5vco-model-range-image h5vco-faded-out')])[5]")
	private WebElement BMW7SeriesSedan;
	
	@FindBy(xpath = "//span[text()='My Configurations']")
	private WebElement myConfigurations;

	@FindBy(xpath = "//span[text()='Compare']")
	private WebElement compare;

	public WebElement getFilter() {
		return filter;
	}

	public WebElement getHideFilter() {
		return hideFilter;
	}

	public WebElement getBMW7SeriesSedan() {
		return BMW7SeriesSedan;
	}

	public WebElement getMyConfigurations() {
		return myConfigurations;
	}

	public WebElement getCompare() {
		return compare; 
	}
	
	public WebElement getFilterMenu() {
		return filterMenu;
	}
	
}
