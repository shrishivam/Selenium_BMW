/**
 *@author sarthak-pc 
 */
package bmw_pageobjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BMWJoyRewards {

	public WebDriver driver;

	public BMWJoyRewards(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//span[@class='ds2-button--responsive-line'])[3]")
	private WebElement registerNow;

	public WebElement getRegisterNow() {
		return registerNow;
	}

}
