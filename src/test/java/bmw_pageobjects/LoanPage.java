/****************************************
Method Description: This class is responsible for returning WebElements  of the 'Loan page' of the WebAplication
Date Of Creation: 20/4/2020
Author Name:Sadiq Mehmood Ansari
Employee ID:855396
*******************************************/
package bmw_pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoanPage {

	public WebDriver driver;

	public LoanPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(xpath = "(//span[@class='ds2-button--responsive-line'])[2]")
	private WebElement LoanFilm;

	
	@FindBy(xpath = "(//span[@class='ds2-content-slider--nav-description-inline'])[1]")
	private WebElement Plan1;

	@FindBy(xpath = "//span[text()='BMW STANDARD LOAN']")
	private WebElement Plan2;
	
	@FindBy(xpath = "//span[text()='BMW BULLET PLAN']")
	private WebElement Plan3;
	
	@FindBy(xpath = "//span[text()='BMW BALLOON PLAN']")
	private WebElement Plan4;

	public WebElement getLoanFilm() {
		return LoanFilm;
	}

	

	public WebElement getPlan1() {
		return Plan1;
	}

	
	public WebElement getPlan2() {
		return Plan2;
	}

	

	public WebElement getPlan3() {
		return Plan3;
	}

	

	public WebElement getPlan4() {
		return Plan4;
	}

	
}
