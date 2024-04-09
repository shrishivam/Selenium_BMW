package bmw_pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCar {

	public WebDriver driver;

	public NewCar(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//img[@class='img-fluid'])[5]")
	private WebElement newCarseries7;

	public WebElement getNewCarseries7() {
		return newCarseries7;
	}
	
	
}
