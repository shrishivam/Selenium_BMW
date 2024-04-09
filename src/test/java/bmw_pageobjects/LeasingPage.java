/****************************************
Method Description: This class is responsible for returning WebElements  of the 'Leasing page' of the WebAplication
Date Of Creation: 20/4/2020
Author Name:Sadiq Mehmood Ansari
Employee ID:855396
*******************************************/
package bmw_pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeasingPage {
	public WebDriver driver;

	public LeasingPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath = "//h3[text()='BMW Finance Leasing.']")
	private WebElement bmwFinanceLeasing;

	public WebElement getBmwFinanceLeasing() {
		return bmwFinanceLeasing;
	}
	
}
