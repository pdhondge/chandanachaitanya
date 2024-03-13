package chandanachaitanyaPackage;



import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Alert extends Xpaths {
	
	
	@Test (enabled=true, priority=1, groups= "Alert")
	public void TC5_1() throws InterruptedException {
		
	driver.findElement(By.xpath(alertBox)).click();
	Thread.sleep(1000);
	driver.switchTo().alert().accept();
		
	}
	
	@Test(enabled=true, priority=2, groups= "Alert")
	public void TC5_2() throws InterruptedException {
		driver.findElement(By.xpath(confirmBox)).click();
		Thread.sleep(1000);
		Assert.assertEquals(driver.switchTo().alert().getText(), "Click 'OK' or 'Cancel'.");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();

	}
	
	@Test(enabled=true, priority=3, groups= "Alert")
	public void TC5_3() throws InterruptedException {
		driver.findElement(By.xpath(confirmBox)).click();
		Thread.sleep(1000);
		Assert.assertEquals(driver.switchTo().alert().getText(), "Click 'OK' or 'Cancel'.");
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();

	}
	
	@Test(enabled=true, priority=4, groups= "Alert")
	public void TC5_4() throws InterruptedException {
		driver.findElement(By.xpath(promptBox)).click();
		Assert.assertEquals(driver.switchTo().alert().getText(), "Which Selenium Tool do you like the most?");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();

	}
	
	@Test(enabled=true, priority=5, groups= "Alert")
	public void TC5_5() throws InterruptedException {
		driver.findElement(By.xpath(promptBox)).click();
		Thread.sleep(1000);
		Assert.assertEquals(driver.switchTo().alert().getText(), "Which Selenium Tool do you like the most?");
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();

	}

}
