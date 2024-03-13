package chandanachaitanyaPackage;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class MultiSelect extends Xpaths {
	
	@Test(groups="MultiSelect")
	public void TC4_1() throws InterruptedException {
		Select Multi=new Select(driver.findElement(By.xpath(selenium_suite)));
		Multi.selectByValue("IDE");
		Thread.sleep(1000);
		
		Multi.selectByValue("WebDriver");
		Thread.sleep(1000);
		
		Multi.selectByValue("RC");
		Thread.sleep(1000);
		
		Multi.selectByValue("Grid");
		Thread.sleep(1000);
		
		Multi.selectByValue("Adv");
		Thread.sleep(1000);
		
		Multi.selectByValue("Limitations");
		Thread.sleep(1000);
		
		// Deselect
		
		Multi.deselectByValue("IDE");
		Thread.sleep(1000);
		
		Multi.deselectByValue("RC");
		
	}

	@Test(groups="MultiSelect")
	public void TC4_2() throws InterruptedException {
		
		Select Multi=new Select(driver.findElement(By.xpath(selenium_suite)));
		
		Multi.selectByValue("IDE");
		Thread.sleep(1000);
		
		Multi.selectByValue("WebDriver");
		Thread.sleep(1000);
		
		Multi.selectByValue("RC");
		Thread.sleep(1000);
		
		Multi.selectByValue("Grid");
		Thread.sleep(1000);
		
		Multi.selectByValue("Adv");
		Thread.sleep(1000);
		
		Multi.selectByValue("Limitations");
		Thread.sleep(1000);
		
		//Deselect All
		
		Multi.deselectAll();
		Thread.sleep(2000);
		
		
	}
	
}
