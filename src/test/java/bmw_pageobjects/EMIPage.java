/****************************************
Method Description: This class is responsible for returning WebElements  of the 'EMI page' of the WebAplication
Date Of Creation: 20/4/2020
Author Name:Sadiq Mehmood Ansari
Employee ID:855396
*******************************************/
package bmw_pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EMIPage {

	public WebDriver driver;

	public EMIPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(xpath = "(//input[@data-model-index='0-0-234@'])[1]")
	private WebElement FuelType;
	
	@FindBy(xpath = "(//select[@data-shop-model-range='3'])[2]")
	private WebElement SelectCar;
	
	@FindBy(id="plan2")
	private WebElement Plans;
	
	@FindBy(xpath = "(//a[@class='circle_btn'])[1]")
	private WebElement submit;

	@FindBy(xpath = "(//div[@class='slider-track-high'])[1]")
	private WebElement Sliders;
	
	@FindBy(xpath = "(//a[text()='Calculate'])[2]")
	private WebElement Calculate;
	
	@FindBy(xpath = "//li[@class='first']//h2")
	private WebElement MonthlyPayment;
	
	@FindBy(xpath = "//li[@class='second']//h2")
	private WebElement YourDeposit;
	
	@FindBy(xpath = "//li[@class='third']//h2")
	private WebElement Terms;
	
	@FindBy(xpath = "//li[@class='fourth']//h2")
	private WebElement BulletAmount;
	
	
	public WebElement getSliders() {
		return Sliders;
	}

	public WebElement getCalculate() {
		return Calculate;
	}
	public WebElement getMonthlyPayment() {
		return MonthlyPayment;
	}

	public WebElement getYourDeposit() {
		return YourDeposit;
	}

	public WebElement getTerms() {
		return Terms;
	}


	public WebElement getBulletAmount() {
		return BulletAmount;
	}


	public WebElement getFuelType() {
		return FuelType;
	}

	public WebElement getSelectCar() {
		return SelectCar;
	}

	public WebElement getPlans() {
		return Plans;
	}

	public WebElement getSubmit() {
		return submit;
	}

	

}
