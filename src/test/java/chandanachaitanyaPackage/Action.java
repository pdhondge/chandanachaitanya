package chandanachaitanyaPackage;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Action extends Xpaths{

	@Test(enabled=true, priority=1, groups="Action")
	public void TC7_1() throws InterruptedException {
	
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(2000);
		
		Actions acr=new Actions(driver);
		acr.dragAndDrop(driver.findElement(By.xpath(findElement)), driver.findElement(By.xpath(sendKeys))).build().perform();
		Thread.sleep(2000);
		
	}
	
	
	@Test(enabled=true, priority=2, groups="Action")
	public void TC7_2() throws InterruptedException {
		JavascriptExecutor jr=(JavascriptExecutor)driver;
		jr.executeScript("window.scrollBy(0, 550)", "");
		Thread.sleep(2000);
		
		Actions acr=new Actions(driver);
		acr.dragAndDrop(driver.findElement(By.xpath(clickAndHold)), driver.findElement(By.xpath(click))).build().perform();
		Thread.sleep(2000);
	}
}
