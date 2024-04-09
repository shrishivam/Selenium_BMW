package bmw_pageobjects;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllModels {
	
	public WebDriver driver;

	public WebElement getNeedAnalyzer() {
		return needAnalyzer;
	}
	
	@FindBy(xpath = "//div[@data-series = '7']")
	private WebElement seriesModels;
	
	@FindBy(tagName = "h1")
	private WebElement findYourBMW;
	
	@FindBy(xpath = "(//span[@class='ds2-button--responsive-line'])[2]")
	private WebElement needAnalyzer; 

	public WebElement getFindYourBMW() {
		return findYourBMW;
	}
	
	public AllModels(WebDriver driver) throws IOException {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getSeriesModels() {
		return seriesModels;
	}
	
}
