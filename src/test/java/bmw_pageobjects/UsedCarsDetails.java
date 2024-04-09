package bmw_pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsedCarsDetails {

	public WebDriver driver;

	public UsedCarsDetails(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div[@class='tit_otr']//h1[1]")
	private WebElement modelName;

	@FindBy(xpath = "(//h2[@class='m-pg-title']//span)[1]")
	private WebElement modelPrice;

	@FindBy(xpath = "//input[@class='savePDF icon-download-white']")
	private WebElement specificationSheet;

	public WebElement getModelName() {
		return modelName;
	}

	public WebElement getModelPrice() {
		return modelPrice;
	}

	public WebElement getSpecificationSheet() {
		return specificationSheet;
	}

	
}
