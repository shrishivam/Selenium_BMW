package bmw_pageobjects;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeedAnalyzer {

	public WebDriver driver;

	public NeedAnalyzer(WebDriver driver) throws IOException {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//h2[text()[normalize-space()='Lost in the system?']]")
	private WebElement errorMsg;

	public WebElement getErrorMsg() {
		return errorMsg;
	}


}
