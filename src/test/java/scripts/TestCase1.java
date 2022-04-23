package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pomPages.MMTLoginPage;

public class TestCase1 extends BaseClass{
	@Test
	public void loggingIn() throws IOException, InterruptedException {
		MMTLoginPage mlp=new MMTLoginPage(driver);
		mlp.closeLanguageCard();
		mlp.clickOnLoginByEmailOrPhone();
		mlp.enterUsername();
		mlp.clickOnContinueButton();
		Thread.sleep(4000);
		mlp.enterPassword();
		mlp.clickOnLoginBTN();
		Thread.sleep(40000);
	}
}
