package chandanachaitanyaPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class RadioButton extends Xpaths{

	@Test(groups="RadioButton")
	public void TC2_1() throws InterruptedException {
		
		driver.findElement(By.xpath(Magazines)).click();
		Thread.sleep(1000);
		Assert.assertTrue(driver.findElement(By.xpath(Magazines)).isSelected());
		
		
//		Window handle
//		Set <String> wh=driver.getWindowHandles();
//		Iterator <String> iter = wh.iterator();
//		String parent=iter.next();
//		String child =iter.next();
//		driver.switchTo().window(child);
		
//		Fluentwait 
//		Wait <WebDriver>  wait=new FluentWait<WebDriver>(driver)
//				.withTimeout(Duration.ofSeconds(10))
//				.pollingEvery(Duration.ofSeconds(2))
//				.ignoring(NoSuchElementException.class);
//				
//		wait.utils(ExpectedConditions.visisblityofelement(xpath));
		
	
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
