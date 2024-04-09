/**
 *@author sarthak-pc 
 */
package bmw_pageobjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BMWErrorPage {

	public WebDriver driver;

	public BMWErrorPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//div[@class='ds2-cms-output']//p)[2]")
	private WebElement errorText;

	public WebElement getErrorText() {
		return errorText;
	}

}
