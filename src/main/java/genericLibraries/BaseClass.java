package genericLibraries;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	public PropertyFile pfdata=new PropertyFile();
	public WebDriverUtilities driverUtilities=new WebDriverUtilities();
	
	
	@BeforeMethod
	public void openApplication() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pfdata.getPropertyFileData("url"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeApplication(ITestResult res) throws IOException {
		int status=res.getStatus();
		String name=res.getName();
		if(status==2) {
			ScreenShot ss=new ScreenShot();
			ss.getScreenShot(driver, name);
		}
		driver.quit();
	}

}
