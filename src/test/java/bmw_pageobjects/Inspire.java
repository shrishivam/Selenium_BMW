package bmw_pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Inspire {
	
	public WebDriver driver;

	public Inspire(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//a[@title='View Brochure']")
	private WebElement viewBrochure;
	
	@FindBy(xpath = "(//a[contains(@href,  'technical-data')])[2]")
	private WebElement technicalData;

	public WebElement getViewBrochure() {
		return viewBrochure;
	}
	
	public WebElement getTechnicalData() {
		return technicalData;
	}

}
