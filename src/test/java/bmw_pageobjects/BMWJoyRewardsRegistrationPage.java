/**
 *@author sarthak-pc 
 */
package bmw_pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BMWJoyRewardsRegistrationPage {

	public WebDriver driver;

	public BMWJoyRewardsRegistrationPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//h2[text()='BMW JOY REWARDS.']")
	private WebElement pageValidator;

	@FindBy(id = "bmw_salutation")
	private WebElement title;

	@FindBy(id = "bmw_firstname")
	private WebElement firstName;

	@FindBy(id = "bmw_lastname")
	private WebElement lastName;

	@FindBy(id = "bmw_email")
	private WebElement email;

	@FindBy(id = "car_date")
	private WebElement carPurchaseDate;

	@FindBy(className = "ui-datepicker-month")
	private WebElement carPurchaseDateMonth;

	@FindBy(className = "ui-datepicker-year")
	private WebElement carPurchaseDateYear;

	@FindBy(xpath = "(//button[@data-event='click'])[1]")
	private WebElement carPurchaseDateToday;

	@FindBy(xpath = "(//button[@data-event='click'])[2]")
	private WebElement carPurchaseDateDone;

	@FindBy(id = "bmw_mobile1")
	private WebElement mobile;

	@FindBy(id = "bmw_cityid")
	private WebElement city;

	@FindBy(id = "bmw_dealer")
	private WebElement dealer;

	@FindBy(id = "tandc")
	private WebElement acceptCheckBox;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;

	@FindBy(id = "msg")
	private WebElement message;
	
	
	@FindBy(id = "wrongmsg")
	private WebElement wrongMessage;
	
	@FindBy(name = "Joy Rewards")
	private WebElement JoyRewardsCheckBox;

	@FindBy(name = "Extended Care")
	private WebElement ExtendedCare;

	@FindBy(name = "Extended Care Plus")
	private WebElement ExtendedCarePlus;

	

	public WebElement getPageValidator() {
		return pageValidator;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getCarPurchaseDate() {
		return carPurchaseDate;
	}

	public WebElement getCarPurchaseDateMonth() {
		return carPurchaseDateMonth;
	}

	public WebElement getCarPurchaseDateYear() {
		return carPurchaseDateYear;
	}

	public WebElement getCarPurchaseDateToday() {
		return carPurchaseDateToday;
	}

	public WebElement getCarPurchaseDateDone() {
		return carPurchaseDateDone;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getDealer() {
		return dealer;
	}

	public WebElement getAcceptCheckBox() {
		return acceptCheckBox;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getMessage() {
		return message;
	}

	public WebElement getWrongMessage() {
		return wrongMessage;
	}

	public WebElement getJoyRewardsCheckBox() {
		return JoyRewardsCheckBox;
	}

	public WebElement getExtendedCare() {
		return ExtendedCare;
	}

	public WebElement getExtendedCarePlus() {
		return ExtendedCarePlus;
	}

	
	
}
