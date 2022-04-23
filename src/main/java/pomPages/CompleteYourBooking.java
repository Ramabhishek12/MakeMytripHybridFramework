package pomPages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.BaseClass;

public class CompleteYourBooking extends BaseClass{
	@FindBy(xpath="//h2[text()='Traveller Details']")
	private WebElement travellerDetails;
	
	@FindBy(xpath="//button[contains(text(),'ADD NEW ADULT')]")
	private WebElement newAdult;
	
	@FindBy(xpath="(//input[@class='tvlrInput '])[1]")
	private WebElement ad1FName;
	@FindBy(xpath="(//input[@class='tvlrInput '])[2]")
	private WebElement ad1LName;
	@FindBy(xpath="(//label[@tabindex='0'])[1]")
	private WebElement ad1MaleGender;
	@FindBy(xpath="(//input[@class='tvlrInput '])[4]")
	private WebElement ad2FName;
	@FindBy(xpath="(//input[@class='tvlrInput '])[5]")
	private WebElement ad2LName;
	@FindBy(xpath="(//label[@tabindex='1'])[2]")
	private WebElement ad2FemaleGender;
	
	@FindBy(xpath="//button[contains(text(),'ADD NEW CHILD')]")
	private WebElement newChild;
	@FindBy(xpath="(//input[@class='tvlrInput '])[7]")
	private WebElement ch1FName;
	@FindBy(xpath="(//input[@class='tvlrInput '])[8]")
	private WebElement ch1LName;
	@FindBy(xpath="(//label[@tabindex='0'])[3]")
	private WebElement ch1MaleGender;
	@FindBy(xpath="(//input[@class='tvlrInput '])[10]")
	private WebElement ch2FName;
	@FindBy(xpath="(//input[@class='tvlrInput '])[11]")
	private WebElement ch2LName;
	@FindBy(xpath="(//label[@tabindex='1'])[4]")
	private WebElement ch2FemaleGender;
	
	@FindBy(xpath="//button[contains(text(),'ADD NEW INFANT')]")
	private WebElement newInfants;
	@FindBy(xpath="(//input[@class='tvlrInput '])[13]")
	private WebElement in1FName;
	@FindBy(xpath="(//input[@class='tvlrInput '])[14]")
	private WebElement in1LName;
	@FindBy(xpath="(//label[@tabindex='0'])[5]")
	private WebElement in1MaleGender;
	@FindBy(xpath="(//input[@class='tvlrInput '])[16]")
	private WebElement in2FName;
	@FindBy(xpath="(//input[@class='tvlrInput '])[17]")
	private WebElement in2LName;
	@FindBy(xpath="(//label[@tabindex='1'])[6]")
	private WebElement in2FemaleGender;
	
	@FindBy(xpath="//div[@class='dropdown__value-container dropdown__value-container--has-value css-1hwfws3']")
	private WebElement countryCode;
	@FindBy(xpath="//div[text()='India(91)']")
	private WebElement indiaCountryCode;
	
	@FindBy(xpath="//input[@placeholder='Mobile No']")
	private WebElement mobileNumber;
	
	@FindBy(xpath="//input[@placeholder='Email']")
	private WebElement email;
	
	@FindBy(xpath="//div[@id='contactDetails']")
	private WebElement other;
	
	@FindBy(xpath="//font[contains(text(),'I have')]")
	private WebElement gstCheckBox;
	@FindBy(xpath="(//input[@class='tvlrInput '])[14]")
	private WebElement comName;
	@FindBy(xpath="(//input[@class='tvlrInput '])[15]")
	private WebElement gstNO;
	
	@FindBy(xpath="//button[text()='Continue']")
	private WebElement continueBTN;
	
	@FindBy(xpath="//button[contains(text(),'LOGIN')]")
	private WebElement loginNow;
	
	public CompleteYourBooking(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getTravellerDetails() {
		return travellerDetails;
	}
	
	public void clickOnAddNewAdult() {
		newAdult.click();
	}
	
	
	public void enterAdultsDetails() throws IOException {
		ad1FName.sendKeys(pfdata.getPropertyFileData("ad1FName"));
		ad1LName.sendKeys(pfdata.getPropertyFileData("ad1LName"));
		ad1MaleGender.click();
		clickOnAddNewAdult();
		ad2FName.sendKeys(pfdata.getPropertyFileData("ad2FName"));
		ad2LName.sendKeys(pfdata.getPropertyFileData("ad2LName"));
		ad2FemaleGender.click();
	}
	
	public void clickOnAddNewChild() {
		newChild.click();
	}
	
	public void enterChildDetails() throws IOException {
		ch1FName.sendKeys(pfdata.getPropertyFileData("ch1FName"));
		ch1LName.sendKeys(pfdata.getPropertyFileData("ch1LName"));
		ch1MaleGender.click();
		clickOnAddNewChild();
		ch2FName.sendKeys(pfdata.getPropertyFileData("ch2FName"));
		ch2LName.sendKeys(pfdata.getPropertyFileData("ch2LName"));
		ch2FemaleGender.click();
	}
	
	public void clickOnaddNewInfants() {
		newInfants.click();
	}
	
	public void enterInfantsDetails() throws IOException {
		in1FName.sendKeys(pfdata.getPropertyFileData("in1FName"));
		in1LName.sendKeys(pfdata.getPropertyFileData("in1LName"));
		in1MaleGender.click();
		clickOnaddNewInfants();
		in2FName.sendKeys(pfdata.getPropertyFileData("in2FName"));
		in2LName.sendKeys(pfdata.getPropertyFileData("in2LName"));
		in2FemaleGender.click();
	}
	
	public void enterMobileNumber() throws IOException {
		mobileNumber.sendKeys(pfdata.getPropertyFileData("mobNO"));
	}
	
	public void enterEmailID() throws IOException {
		email.sendKeys(pfdata.getPropertyFileData("emailID"));
	}
	
	public void clickOther() {
		other.click();
	}
	
	public void enterGSTDetails() throws IOException {
		gstCheckBox.click();
		comName.sendKeys(pfdata.getPropertyFileData("comName"));
		gstNO.sendKeys(pfdata.getPropertyFileData("gstRegNo"));
	}
	
	public void clickOnContinueBTN() {
		continueBTN.click();
	}
	
	public void cliclOnLogin() {
		loginNow.click();
	}
	
}
