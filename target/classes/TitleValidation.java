package bmw_utilities;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TitleValidation {
 
public WebDriver driver;
	public void Landing_Page_Title(WebDriver driver) {
		
		String Actualtitle=driver.getTitle();
		String ExpectedTitle= "BMW India";
		Assert.assertEquals(Actualtitle, ExpectedTitle);
	}
	public void Dealer_Locator_Page_Title(WebDriver driver) {
		
		String Actualtitle=driver.getTitle();
		String ExpectedTitle= "Find a Dealer";
		Assert.assertEquals(Actualtitle, ExpectedTitle);
	}
	public void Test_Drive_Page_Title(WebDriver driver) {
		
		String Actualtitle=driver.getTitle();
		String ExpectedTitle= "BMW India Test Drive Request";
		Assert.assertEquals(Actualtitle, ExpectedTitle);
	}  
}
