package pomPages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.BaseClass;

public class MMTLoginPage extends BaseClass{
	
	@FindBy(xpath="//span[@class='langCardClose']")
	private WebElement closeLangCard;
	
	@FindBy(xpath="//label[contains(text(),'Login')]")
	private WebElement loginByEmailOrPhone;
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(xpath="//span[text()='Continue']")
	private WebElement continueBTN;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath="//button[@data-cy='login']")
	private WebElement loginBTN;
	
	@FindBy(xpath="//li[contains(text(),'Round Trip')]")
	private WebElement roundTrip;
	
	@FindBy(xpath="//div[@data-cy='landingContainer']")
	private WebElement header;
	
	@FindBy(id="fromCity")
	private WebElement fromTF;
	@FindBy(xpath="//input[@placeholder='From']")
	private WebElement fromSB;
	@FindBy(xpath="//p[contains(text(),'Patna')]")
	private WebElement selectPatna;
	
	@FindBy(id="toCity")
	private WebElement toTF;
	@FindBy(xpath="//input[@placeholder='To']")
	private WebElement toSB;
	@FindBy(xpath="//p[contains(text(),'Delhi')]")
	private WebElement selectDelhi;
	
	@FindBy(xpath="(//div[@class='dateInnerCell'])[40]")
	private WebElement departureDate;
	
	@FindBy(xpath="(//span[@role='button'])[2]")
	private WebElement nextArrow;
	@FindBy(xpath="(//div[@class='dateInnerCell'])[40]")
	private WebElement returnDate;
	
	@FindBy(xpath="//label[@for='travellers']")
	private WebElement travellersAndClass;
	@FindBy(xpath="//li[@data-cy='adults-2']")
	private WebElement adults;
	@FindBy(xpath="//li[@data-cy='children-2']")
	private WebElement children;
	@FindBy(xpath="//li[@data-cy='infants-2']")
	private WebElement infants;
	@FindBy(xpath="//li[@data-cy='travelClass-2']")
	private WebElement travelClass;
	@FindBy(xpath="//button[@data-cy='travellerApplyBtn']")
	private WebElement applyBTN;
	
	@FindBy(xpath="//a[text()='Search']")
	private WebElement searchBTN;
	
	@FindBy(xpath="(//span[text()='Hotels'])[1]")
	private WebElement hotelIcon;
	
	@FindBy(id="city")
	private WebElement cityAreaHotel;
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement cityAreaHotelTF;
	@FindBy(xpath="//p[contains(text(),'Male City')]")
	private WebElement maleCity;
	@FindBy(xpath="//label[@for='checkin']")
	private WebElement checkIN;
	@FindBy(xpath="(//div[text()='23'])[2]")
	private WebElement checkInDate;
	@FindBy(xpath="(//div[text()='30'])[3]")
	private WebElement checkOutDate;
	@FindBy(xpath="//label[@for='guest']")
	private WebElement roomsAndGuest;
	@FindBy(xpath="//li[@data-cy='adults-1']")
	private WebElement noOfAdults;
	@FindBy(xpath="//button[@data-cy='submitGuest']")
	private WebElement applyButton;
	@FindBy(xpath="//label[@for='appliedFilter']")
	private WebElement filters;
	@FindBy(xpath="//li[text()='Breakfast Available']")
	private WebElement breakfast;
	@FindBy(xpath="//label[@for='2500-5000']")
	private WebElement pricePerNight;
	@FindBy(xpath="//label[@for='Hotel']")
	private WebElement propertyType;
	@FindBy(xpath="//a[text()='Apply']")
	private WebElement applyFilterBTN;
	@FindBy(xpath="//button[text()='Search']")
	private WebElement searchHotelsBTN;
	
	@FindBy(xpath="//span[text()='Trains']")
	private WebElement trainsTab;
	@FindBy(xpath="//label[@for='fromCity']")
	private WebElement fromCity;
	@FindBy(xpath="//input[@placeholder='From']")
	private WebElement fromCityTF;
	@FindBy(xpath="(//div[@class='makeFlex'])[1]")
	private WebElement fromCityPNBE;
	@FindBy(xpath="//input[@placeholder='To']")
	private WebElement toCityTF;
	@FindBy(xpath="(//div[@class='makeFlex'])[2]")
	private WebElement toCityBLR;
	@FindBy(xpath="(//div[text()='8'])[1]")
	private WebElement travelDate;
	@FindBy(xpath="//ul[@class='travelForPopup']")
	private WebElement selectClass;
	@FindBy(xpath="//li[text()='Third AC']")
	private WebElement trainClass;
	@FindBy(xpath="//a[text()='Search']")
	private WebElement searchTrain;
	
	public MMTLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void closeLanguageCard() {
		closeLangCard.click();
	}
	public void clickOnLoginByEmailOrPhone() {
		loginByEmailOrPhone.click();
	}
	public void enterUsername() throws IOException {
		username.sendKeys(pfdata.getPropertyFileData("username"));
	}
	public void clickOnContinueButton() {
		continueBTN.click();
	}
	public void enterPassword() throws IOException {
		password.sendKeys(pfdata.getPropertyFileData("password"));
	}
	public void clickOnLoginBTN() {
		loginBTN.click();
	}
	
	public void selectRoundTrip() {
		roundTrip.click();
	}
	
	public void clickOnHeader() {
		header.click();
	}
	
	public void enterFromCity() throws IOException {
		fromTF.click();
		fromSB.sendKeys(pfdata.getPropertyFileData("fromCity"));
		selectPatna.click();
	}
	public void enterToCity() throws IOException {
		//toTF.click();
		toSB.sendKeys(pfdata.getPropertyFileData("toCity"));
		selectDelhi.click();
	}
	public void selectDepartureDate() {
		departureDate.click();
	}
	public void selectReturnDate() {
		nextArrow.click();
		returnDate.click();
	}
	public void selecttravellersAndClass() {
		travellersAndClass.click();
	}
	public void selectTravellerAndClass() {
		travellersAndClass.click();
		adults.click();
		children.click();
		infants.click();
		travelClass.click();
		applyBTN.click();
	}
	public void searchFlights() {
		searchBTN.click();
	}
	
	public void clickOnHotelIcon() {
		hotelIcon.click();
	}
	
	public void clickOnCityAreaHotel() {
		cityAreaHotel.click();
	}
	
	public void enterCityAreaHotel() throws IOException {
		cityAreaHotelTF.sendKeys(pfdata.getPropertyFileData("cityDestination"));
	}
	
	public void selectCityAreaHotel() {
		maleCity.click();
	}
	
	public void clickOnCheckIn() {
		checkIN.click();
	}
	
	public void selectCheckInDate() {
		checkInDate.click();
	}
	
	public void selectCheckOutDate() {
		checkOutDate.click();
	}
	
	public void clickOnRoomsAndGuest() {
		roomsAndGuest.click();
	}
	public void selectNoOfAdults() {
		noOfAdults.click();
	}
	public void clickOnApplyButton() {
		applyButton.click();
	}
	public void clickOnFilters() {
		filters.click();
	}
	public void selectBreakfastAvailable() {
		breakfast.click();
	}
	public void selectPricePerNight() {
		pricePerNight.click();
	}
	public void selectPropertyType() {
		propertyType.click();
	}
	public void clickOnApplyFilterBTN() {
		applyFilterBTN.click();
	}
	public void clickOnSearchHotelsButton() {
		searchHotelsBTN.click();
	}
	public void clickOnTrainsTab() {
		trainsTab.click();
	}
	public void clickOnFromCity() {
		fromCity.click();
	}
	public void enterFromTrainCity() throws IOException {
		fromCityTF.sendKeys(pfdata.getPropertyFileData("fromCity"));
	}
	public void selectFromCity() {
		fromCityPNBE.click();
	}
	public void enterToTrainCity() throws IOException {
		toCityTF.sendKeys(pfdata.getPropertyFileData("toCity"));
	}
	public void selectToCity() {
		toCityBLR.click();
	}
	public void selectTravelDate() {
		travelDate.click();
	}
	public WebElement getSelectClass() {
		return selectClass;
	}
	public void selectClass() {
		trainClass.click();
	}
	public void clickOnSearchTrain() {
		searchTrain.click();
	}
}
