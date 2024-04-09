package bmw_pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SellYourCar {

	public WebDriver driver;

	public SellYourCar(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@name = 'name']")
	private WebElement name;
	
	@FindBy(xpath = "//input[@name = 'mobile']")
	private WebElement mobileNumber;

	@FindBy(xpath = "//input[@name = 'email']")
	private WebElement email;

	@FindBy(xpath = "//select[@name = 'city']")
	private WebElement city;

	@FindBy(xpath = "//select[@name = 'dealerid']")
	private WebElement dealer;
	
	@FindBy(id = "captchaimg_wwyrcarv2")
	private WebElement captchaData;
	
	@FindBy(id = "captcha")
	private WebElement captcha;

	@FindBy(xpath = "//input[@class = 'send_btn']")
	private WebElement submit;
	
	@FindBy(xpath = "//div[@class='new_tanku']//h2[1]")
	private WebElement validTitle;

	public WebElement getValidTitle() {
		return validTitle;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getMobileNumber() {
		return mobileNumber;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getDealer() {
		return dealer;
	}
	
	public WebElement getCaptchaData() {
		return captchaData;
	}


	public WebElement getCaptcha() {
		return captcha;
	}

	public WebElement getSubmit() {
		return submit;
	}

	
}
