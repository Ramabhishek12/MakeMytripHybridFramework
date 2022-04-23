package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.BaseClass;

public class FlightsPage extends BaseClass{
	@FindBy(xpath="(//span[contains(text(),'View')])[7]")
	private WebElement vistaraFlight;
	
	@FindBy(xpath="(//button[contains(text(),'Book')])[2]")
	private WebElement bookNow;
	
	
	
	public FlightsPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void selectVistaraFlight() {
		vistaraFlight.click();
	}
	public void clickOnBookNow() {
		bookNow.click();
	}
	
}
