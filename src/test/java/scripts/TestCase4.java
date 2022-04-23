package scripts;

import java.io.IOException;


import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pomPages.MMTLoginPage;

public class TestCase4 extends BaseClass{
	@Test
	public void searchTrains() throws IOException, InterruptedException {
		MMTLoginPage mlp=new MMTLoginPage(driver);
		mlp.closeLanguageCard();
		mlp.clickOnHeader();
		mlp.clickOnTrainsTab();
		mlp.clickOnFromCity();
		mlp.enterFromTrainCity();
		mlp.selectFromCity();
		mlp.enterToTrainCity();
		mlp.selectToCity();
		mlp.selectTravelDate();
		//WebElement ele=mlp.getSelectClass();
		//driverUtilities.dropDown(ele, pfdata.getPropertyFileData("trainClass"));
		mlp.selectClass();
		mlp.clickOnSearchTrain();
		Thread.sleep(50000);
	}
}
