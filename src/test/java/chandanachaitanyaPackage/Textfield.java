package chandanachaitanyaPackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Textfield extends Xpaths{
	
	@Test(enabled=true, priority=1, groups="Textfield")
	public void TC6_1() throws InterruptedException {
		
		driver.findElement(By.xpath(Message)).sendKeys("Prathamesh");
		Thread.sleep(1000);
	}
	
	@Test(enabled=true, priority=2, groups="Textfield")
	public void TC6_2() throws InterruptedException {
		
		driver.findElement(By.xpath(Message)).sendKeys("Prathamesh");
		Thread.sleep(1000);
		driver.findElement(By.xpath(Message)).clear();
	}
	
	@Test(enabled=true, priority=3, groups="Textfield")
	public void TC6_3() throws InterruptedException {
		
		driver.findElement(By.xpath(Message)).sendKeys("Prathamesh");
		Thread.sleep(1000);
		driver.findElement(By.xpath(Message)).sendKeys("  Dhondge");
		Thread.sleep(1000);
	}


}
