package bmw_pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Consumption_Emission {
	public WebDriver driver;

	public Consumption_Emission(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// @FindBy for BMWModule7SwitchWLTPTC_58(to switch)

	@FindBy(xpath = "//*[@id=\"iframepar__iframeadaptive\"]")
	private WebElement iframe;

	@FindBy(xpath="(//h4[@class='ds2-no-uppercase'])[3]")
	private WebElement slider;
	
	@FindBy(xpath = "//div[text()='from September 2018']")
	private WebElement sep_Xpath_Path;

	@FindBy(xpath = "(//div[contains(@class,'timeline__container timeline__container-horizontal')]//div)[1]")
	private WebElement info;

	@FindBy(xpath = "//div[text()='October 2018']")
	private WebElement oct_Xpath_Path;

	@FindBy(xpath = "/html/body/main/section/div[1]/div[1]/div[1]/div[2]/div/div/div/p")
	private WebElement info2;

	@FindBy(xpath = "//div[text()='2021']")
	private WebElement t2021_Xpath_Path;

	@FindBy(xpath = "/html/body/main/section/div[1]/div[1]/div[1]/div[3]/div/div/div/p[1]")
	private WebElement info3;

	// to write WLTP COMPARED WITH NEDC to excel sheet

	@FindBy(xpath = "//table[2]/thead/tr/th[1]/div/div")
	private WebElement procedure_table;

	@FindBy(xpath = "//table[2]/thead/tr/th[3]/div/div")
	private WebElement nedc_table;

	@FindBy(xpath = "//table[2]/tbody/tr/td/div")
	private WebElement testduration_table;

	@FindBy(xpath = "//table[2]/tbody/tr/td[3]/div")
	private WebElement testdurationMin_table;

	@FindBy(xpath = "//table[2]/tbody/tr[2]/td/div")
	private WebElement testdistance_table;

	@FindBy(xpath = "//table[2]/tbody/tr[2]/td[3]/div")
	private WebElement testdistancekm_table;

	@FindBy(xpath = "//table[2]/tbody/tr[3]/td/div")
	private WebElement timespent_table;

	@FindBy(xpath = "//table[2]/tbody/tr[3]/td[3]/div")
	private WebElement timespentper_table;

	@FindBy(xpath = "//table[2]/tbody/tr[4]/td/div")
	private WebElement testphase_table;

	@FindBy(xpath = "//table[2]/tbody/tr[4]/td[3]/div")
	private WebElement testurban_table;

	@FindBy(xpath = "//table[2]/tbody/tr[5]/td/div")
	private WebElement testspeed_table;

	@FindBy(xpath = "//table[2]/tbody/tr[5]/td[3]/div")
	private WebElement testspeedkm_table;

	@FindBy(xpath = "//table[2]/tbody/tr[6]/td/div")
	private WebElement testtemp_table;

	@FindBy(xpath = "//table[2]/tbody/tr[6]/td[3]/div")
	private WebElement testtempval_table;

	@FindBy(xpath = "//table[2]/tbody/tr[7]/td/div")
	private WebElement testequip_table;

	@FindBy(xpath = "//table[2]/tbody/tr[7]/td[3]/div")
	private WebElement testequipval_table;

	// @FindBy for BMWModule7MilestoneTC_59(to switch the milestone)
	
	@FindBy(xpath = "//div[@class='milestone active']")
	private WebElement milestoneData;

	@FindBy(xpath = "(//div[@class='milestone'])[1]")
	private WebElement transitionPhase;

	@FindBy(xpath = "(//div[@class='milestone'])[2]")
	private WebElement wltp;

	@FindBy(xpath = "(//div[@class='milestone'])[3]")
	private WebElement rde;

	@FindBy(xpath = "(//div[@class='milestone'])[4]")
	private WebElement wltp_rde;

	
	
	public WebElement getTestdistance_table() {
		return testdistance_table;
	}

	public WebElement getTestdistancekm_table() {
		return testdistancekm_table;
	}

	public WebElement getTimespent_table() {
		return timespent_table;
	}

	public WebElement getTimespentper_table() {
		return timespentper_table;
	}

	public WebElement getTestphase_table() {
		return testphase_table;
	}

	public WebElement getTesturban_table() {
		return testurban_table;
	}

	public WebElement getTestspeed_table() {
		return testspeed_table;
	}

	public WebElement getTestspeedkm_table() {
		return testspeedkm_table;
	}

	public WebElement getTesttemp_table() {
		return testtemp_table;
	}

	public WebElement getTesttempval_table() {
		return testtempval_table;
	}

	public WebElement getTestequip_table() {
		return testequip_table;
	}

	public WebElement getTestequipval_table() {
		return testequipval_table;
	}

	public WebElement getIframe() {
		return iframe;
	}

	public WebElement getInfo() {
		return info;
	}

	public WebElement getSep_Xpath_Path() {
		return sep_Xpath_Path;
	}

	public WebElement getOct_Xpath_Path() {
		return oct_Xpath_Path;
	}

	public WebElement getT2021_Xpath_Path() {
		return t2021_Xpath_Path;
	}

	public WebElement getInfo2() {
		return info2;
	}

	public WebElement getInfo3() {
		return info3;
	}

	public WebElement getProcedure_table() {
		return procedure_table;
	}

	public WebElement getNedc_table() {
		return nedc_table;
	}

	public WebElement getTestduration_table() {
		return testduration_table;
	}

	public WebElement getTestdurationMin_table() {
		return testdurationMin_table;
	}

	public WebElement getMilestoneData() {
		return milestoneData;
	}

	public WebElement getTransitionPhase() {
		return transitionPhase;
	}

	public WebElement getWltp() {
		return wltp;
	}

	public WebElement getRde() {
		return rde;
	}

	public WebElement getWltp_rde() {
		return wltp_rde;
	}

	public WebElement getSlider() {
		return slider;
	}
	
	

}
