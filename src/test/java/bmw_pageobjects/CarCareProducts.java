/**
 *@author sarthak-pc 
 */
package bmw_pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarCareProducts {

	public WebDriver driver;

	public CarCareProducts(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//a[@class='button'])[1]")
	private WebElement glassCleaning;

	@FindBy(xpath = "(//div[contains(@class,'ds2-content-slider--description columns')])[2]")
	private WebElement glassCleaningDetails;
	
	@FindBy(xpath = "(//a[@class='button']//div)[2]")
	private WebElement paintAndWheel;

	@FindBy(xpath = "/html/body/div[5]/main/div[1]/div[6]/div/div/div[3]/div/div/div[3]/div/div[2]")
	private WebElement paintandWheelDetails;
	
	@FindBy(linkText="Interior Care")
	private WebElement interiorCare;

	@FindBy(xpath = "/html/body/div[5]/main/div[1]/div[6]/div/div/div[3]/div/div/div[4]/div/div[2]")
	private WebElement  interiorCareDetails;
	
	
	@FindBy(linkText="Special Products")
	private WebElement specialProducts;

	@FindBy(xpath = "/html/body/div[5]/main/div[1]/div[6]/div/div/div[3]/div/div/div[5]/div/div[2]")
	private WebElement  specialProductsDetails;

	public WebElement getGlassCleaning() {
		return glassCleaning;
	}

	public WebElement getGlassCleaningDetails() {
		return glassCleaningDetails;
	}

	public WebElement getPaintAndWheel() {
		return paintAndWheel;
	}

	public WebElement getPaintandWheelDetails() {
		return paintandWheelDetails;
	}

	public WebElement getInteriorCare() {
		return interiorCare;
	}

	public WebElement getInteriorCareDetails() {
		return interiorCareDetails;
	}

	public WebElement getSpecialProducts() {
		return specialProducts;
	}

	public WebElement getSpecialProductsDetails() {
		return specialProductsDetails;
	}
	
	
	


}
