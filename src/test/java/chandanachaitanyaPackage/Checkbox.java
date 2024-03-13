package chandanachaitanyaPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import org.openqa.selenium.By;



public class Checkbox extends Xpaths {
	

	
	// CheckBox Testcase TC1
	@Test(groups="CheckBox")
	public void TC1_1() throws InterruptedException {
		
		driver.findElement(By.xpath(Bicycle)).click();
		Assert.assertTrue(driver.findElement(By.xpath(Bicycle)).isSelected());
		
	}
	
	@Test(groups="CheckBox")
	public void TC1_2() {
		driver.findElement(By.xpath(Bike)).click();
		Assert.assertTrue(driver.findElement(By.xpath(Bike)).isSelected());
	}
	
	@Test(groups="CheckBox")
	public void TC1_3() {
		driver.findElement(By.xpath(Hatchback)).click();
		Assert.assertTrue(driver.findElement(By.xpath(Hatchback)).isSelected());
	}
	
	@Test(groups="CheckBox")
	public void TC1_4() {
		driver.findElement(By.xpath(Sedan)).click();
		Assert.assertTrue(driver.findElement(By.xpath(Sedan)).isSelected());
	}
	
	@Test(groups="CheckBox")
	public void TC1_5() {
		driver.findElement(By.xpath(Van)).click();
		Assert.assertTrue(driver.findElement(By.xpath(Van)).isSelected());
	}
	
	@Test(groups="CheckBox")
	public void TC1_6() {
		driver.findElement(By.xpath(Truck)).click();
		Assert.assertTrue(driver.findElement(By.xpath(Truck)).isSelected());
	}
	
	@Test(groups="CheckBox")
	public void TC1_7() {
		driver.findElement(By.xpath(Tricycle)).click();
		Assert.assertTrue(driver.findElement(By.xpath(Tricycle)).isSelected());
	}
	

}
