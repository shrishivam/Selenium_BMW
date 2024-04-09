/**
 *@author sarthak-pc 
 */
package bmw_pageobjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BMWLifestyleAndGadgets {

	public WebDriver driver;

	public BMWLifestyleAndGadgets(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(tagName = "h1")
	private WebElement pageValidator;

	@FindBy(linkText = "magazine")
	private WebElement magazine;

	@FindBy(linkText = "socialconnected")
	private WebElement socialConnected;

	@FindBy(linkText = "watchfaces")
	private WebElement watchFaces;

	@FindBy(linkText = "bmwprive")
	private WebElement bmwprive;

	public WebElement getPageValidator() {
		return pageValidator;
	}

	public WebElement getMagazine() {
		return magazine;
	}

	public WebElement getSocialConnected() {
		return socialConnected;
	}

	public WebElement getWatchFaces() {
		return watchFaces;
	}

	public WebElement getBmwprive() {
		return bmwprive;
	}

}
