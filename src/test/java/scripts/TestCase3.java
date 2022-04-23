package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pomPages.MMTHotelsPage;
import pomPages.MMTLoginPage;
import pomPages.ReviewBookingPage;

public class TestCase3 extends BaseClass{

	@Test
	public void hotelBooking() throws IOException {
		MMTLoginPage mlp=new MMTLoginPage(driver);
		mlp.closeLanguageCard();
		mlp.clickOnHeader();
		mlp.clickOnHotelIcon();
		mlp.clickOnCityAreaHotel();
		mlp.enterCityAreaHotel();
		//mlp.clickOnCheckIn();
		mlp.selectCheckInDate();
		mlp.selectCheckOutDate();
		mlp.clickOnRoomsAndGuest();
		mlp.selectNoOfAdults();
		mlp.clickOnApplyButton();
		mlp.clickOnFilters();
		mlp.selectBreakfastAvailable();
		mlp.selectPricePerNight();
		mlp.selectPropertyType();
		mlp.clickOnApplyFilterBTN();
		mlp.clickOnSearchHotelsButton();
		
		MMTHotelsPage mhp=new MMTHotelsPage(driver);
		mhp.selectHotel();
		mhp.clickBookThisNow();
		driverUtilities.switchChildTab(driver);
		ReviewBookingPage rbp=new ReviewBookingPage(driver);
		
		WebElement ele=rbp.getGuestDetails();
		Point p=ele.getLocation();
		int x=p.getX();
		int y=p.getY();
		driverUtilities.scrollBar(driver, x, y);
		
		rbp.enterFName();
		rbp.enterLName();
		rbp.enterEmail();
		rbp.enterMobNO();
		rbp.clickBookBTN();
	}
}
