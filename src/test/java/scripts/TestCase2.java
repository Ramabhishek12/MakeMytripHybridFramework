package scripts;


import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pomPages.CompleteYourBooking;
import pomPages.FlightsPage;
import pomPages.MMTLoginPage;

public class TestCase2 extends BaseClass{
	@Test
	public void searchFlight() throws IOException, InterruptedException {
		MMTLoginPage mlp=new MMTLoginPage(driver);
		mlp.closeLanguageCard();
		mlp.clickOnHeader();
		//mlp.selectRoundTrip();
		mlp.enterFromCity();
		mlp.enterToCity();
		mlp.selectDepartureDate();
		//mlp.selectReturnDate();
		mlp.selectTravellerAndClass();
		mlp.searchFlights();
		
		FlightsPage fp=new FlightsPage(driver);
		fp.selectVistaraFlight();
		fp.clickOnBookNow();
		
		driverUtilities.switchChildTab(driver);
		
		CompleteYourBooking cyb=new CompleteYourBooking(driver);
		WebElement ele=cyb.getTravellerDetails();
		Point p=ele.getLocation();
		int x=p.getX();
		int y=p.getY();
		driverUtilities.scrollBar(driver, x, y);
		
		cyb.clickOnAddNewAdult();
		cyb.enterAdultsDetails();
		
		cyb.clickOnAddNewChild();
		cyb.enterChildDetails();
		
		cyb.clickOnaddNewInfants();
		cyb.enterInfantsDetails();
		
		cyb.enterMobileNumber();
		
		cyb.enterEmailID();
		
		cyb.clickOther();
		
		cyb.enterGSTDetails();
		
		cyb.clickOnContinueBTN();
		
		cyb.cliclOnLogin();
		
		mlp.enterUsername();
		mlp.clickOnContinueButton();
		
		mlp.enterPassword();
		mlp.clickOnLoginBTN();
		
		cyb.clickOnContinueBTN();
		
		Thread.sleep(50000);
	}
}
