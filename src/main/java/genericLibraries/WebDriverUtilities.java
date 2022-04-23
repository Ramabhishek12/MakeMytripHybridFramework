package genericLibraries;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
	
	public void rightClick(WebDriver driver,WebElement ele) {
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
	}
	
	public void mouseHower(WebDriver driver,WebElement ele) {
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
	}

	public void doubleClick(WebDriver driver,WebElement ele) {
		Actions act=new Actions(driver);
		act.doubleClick(ele).perform();
	}

	public void dragAndDrop(WebDriver driver,WebElement src,WebElement dest) {
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dest).perform();
	}

	public void dropDown(WebElement ele,String text) {
		Select sel=new Select(ele);
		sel.deselectByVisibleText(text);
	}

	public void scrollBar(WebDriver driver,int x,int y) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+x+","+y+")");
	}

	public void switchChildTab(WebDriver driver) {
		Set<String> childs=driver.getWindowHandles();
		for(String itr:childs) {
			driver.switchTo().window(itr);
		}
	}

	public void switchToZeroThFrame(WebDriver driver) {
		driver.switchTo().frame(0);
	}
	public void switchBackToOriginalFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	public void acceptAlertPopup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public void dismissAlertPopup(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
}
