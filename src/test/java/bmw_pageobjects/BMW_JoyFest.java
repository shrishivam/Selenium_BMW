package bmw_pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BMW_JoyFest {
	public WebDriver driver;

	public BMW_JoyFest(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// @FindBy for TC_44 (t0 click request for more info)
	@FindBy(xpath ="(//a[@class='ds2-quickactions-link-js ds2-tracking-js--event'])[3]")
	private WebElement Request_Xpath_Path;
	
	public WebElement Click_on_Request() {
		return Request_Xpath_Path;
	}


}
