package chandanachaitanyaPackage;

import org.testng.Assert;
import org.testng.annotations.Test;


import org.openqa.selenium.By;


public class RadioButton extends Xpaths{

	@Test(groups="RadioButton")
	public void TC2_1() throws InterruptedException {
		
		driver.findElement(By.xpath(Magazines)).click();
		Thread.sleep(1000);
		Assert.assertTrue(driver.findElement(By.xpath(Magazines)).isSelected());
		
	}
	
	@Test(groups="RadioButton")
	public void TC2_2() throws InterruptedException {
		
		driver.findElement(By.xpath(Self_help_books)).click();
		Thread.sleep(1000);
		Assert.assertTrue(driver.findElement(By.xpath(Self_help_books)).isSelected());
	}
	
	@Test(groups="RadioButton")
	public void TC2_3() throws InterruptedException {
		
		driver.findElement(By.xpath(Novels)).click();
		Thread.sleep(1000);
		Assert.assertTrue(driver.findElement(By.xpath(Novels)).isSelected());
	}
	
}
