package bmw_pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DealerLocatorPage {

	public WebDriver driver;

	public DealerLocatorPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath ="//*[@placeholder='Nearby your current location']")
	private WebElement Input_Current_location_Xpath;

	
	@FindBy(xpath ="//*[@class='button ds2-dlo-search--submit dlo-button ng-binding']")
	private WebElement Search_Delar_Locator_Xpath;
	
	public WebElement Search_Delar_Locator() {
		return Search_Delar_Locator_Xpath;
	}
	
	
	public WebElement Current_location_Delar_Locator() {
		return Input_Current_location_Xpath;
	}
	
	

}
