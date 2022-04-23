package pomPages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.BaseClass;

public class ReviewBookingPage extends BaseClass{
	
	@FindBy(xpath="//span[text()='GUEST DETAILS']")
	private WebElement guestDetails;
	
	
	@FindBy(id="fName")
	private WebElement firstName;
	
	@FindBy(id="lName")
	private WebElement lastName;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="mNo")
	private WebElement mobNO;
	
	@FindBy(xpath="(//a[contains(text(),'Book')])[2]")
	private WebElement bookBTN;
	
	public ReviewBookingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getGuestDetails() {
		return guestDetails;
	}
	
	public void enterFName() throws IOException {
		firstName.sendKeys(pfdata.getPropertyFileData("guestFName"));
	}
	public void enterLName() throws IOException {
		lastName.sendKeys(pfdata.getPropertyFileData("guestLName"));
	}
	public void enterMobNO() throws IOException {
		mobNO.sendKeys(pfdata.getPropertyFileData("guestMobNO"));
	}
	public void enterEmail() throws IOException {
		email.sendKeys(pfdata.getPropertyFileData("guestEmail"));
	}
	public void clickBookBTN() {
		bookBTN.click();
	}
}
