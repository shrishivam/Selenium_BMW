package bmw_pageobjects;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TechnicalData {

	public WebDriver driver;

	public TechnicalData(WebDriver driver) throws IOException {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//h2[contains(@class,'ds2-technical-data--title ds2-no-uppercase')]")
	private WebElement techData;

	@FindBy(xpath = "(//table[contains(@class,'ds2-component ds2-tracking-aware')]/following::table)[5]")
	private WebElement topSpeed;

	public WebElement getTopSpeed() {
		return topSpeed;
	}

	public WebElement getTechData() {
		return techData;
	}

}
