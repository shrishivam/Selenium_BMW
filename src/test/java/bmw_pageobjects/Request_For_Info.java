package bmw_pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Request_For_Info {
	public WebDriver driver;

	public Request_For_Info(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// @FindBy for TC_45 to TC-55 (to Fill the form details)
	@FindBy(id ="bmw_salutation")
	private WebElement Dropdown_ID;
	
	public WebElement Dropdown() {
		return Dropdown_ID;
	}
	@FindBy(xpath ="//*[text()='Ms.']")
	private WebElement  salutation_Xpath_Path;
	
	
	@FindBy(id ="bmw_firstname")
	private WebElement  First_name_ID;
	
	
	@FindBy(id ="bmw_lastname")
	private WebElement Last_name_ID;
	
	
	@FindBy(id ="bmw_series")
	private WebElement model_ID;
	
	
	@FindBy(xpath ="//*[@id=\"bmw_series\"]/option[2]")
	private WebElement Model_Xpath_Path;
	
	
	@FindBy(id ="bmw_mobile1")
	private WebElement Mobile_ID;
	
	
	@FindBy(id ="bmw_email")
	private WebElement Email_ID;
	
	
	@FindBy(id ="tandc")
	private WebElement Check_ID;
	
	
	@FindBy(xpath ="//input[@type='submit']")
	private WebElement Submit_Xpath_Pat;
	
	
	
	public WebElement Salutaion() {
		return salutation_Xpath_Path;
	}
	public WebElement First_Name() {
		return First_name_ID ;
	}
    public WebElement Last_Name() {
		return Last_name_ID ;
	}
	public WebElement Pref_model() {
		return model_ID ;
	}
	public WebElement Series() {
		return Model_Xpath_Path ;
	}
	public WebElement Mobile_Number() {
		return Mobile_ID ;
	}
	public WebElement Email_ID() {
		return Email_ID ;
	}
	public WebElement Check_Box() {
		return Check_ID ;
	}
	public WebElement Submit() {
		return Submit_Xpath_Pat ;
	}
	

}
