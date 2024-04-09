/**
 *@author sarthak-pc 
 */
package bmw_pageobjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BRIPackageStatus {

	public WebDriver driver;

	public BRIPackageStatus(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "/html/body/div[5]/h2")
	private WebElement pageValidator;

	@FindBy(xpath = "//input[@class='form-control']")
	private WebElement number;

	@FindBy(xpath="//*[@id=\"form1_btn\"]")
	private WebElement submit;
	
	@FindBy(xpath="//p[text()='Please enter a valid VIN.']")
	private WebElement alert;
	
	@FindBy(id="service_btn")
	private WebElement serviceButton;
	
	@FindBy(id="bmw_a_btn")
	private WebElement bmwAccessoriesButton;
	
	@FindBy(linkText="Complete Wheel Sets")
	private WebElement completeWheelSet;

	public WebElement getPageValidator() {
		return pageValidator;
	}

	public WebElement getNumber() {
		return number;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getAlert() {
		return alert;
	}

	public WebElement getServiceButton() {
		return serviceButton;
	}

	public WebElement getBmwAccessoriesButton() {
		return bmwAccessoriesButton;
	}

	public WebElement getCompleteWheelSet() {
		return completeWheelSet;
	}

	
	
	
}
