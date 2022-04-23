package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MMTHotelsPage {
	@FindBy(xpath="//span[text()='Off Day Inn Hotel']")
	private WebElement hotelName;
	@FindBy(xpath="//span[@class='bookNowBtn ']")
	private WebElement bookThisNowBTN;
	
	
	public MMTHotelsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void selectHotel() {
		hotelName.click();
	}
	public void clickBookThisNow() {
		bookThisNowBTN.click();
	}
}
