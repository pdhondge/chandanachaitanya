package chandanachaitanyaPackage;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class Listfield extends Xpaths{
	
	
	@Test(groups="Listfield")
	public void TC3_1() throws InterruptedException {
		
		Select java=new Select(driver.findElement(By.xpath(programming_languages)));
		java.selectByValue("Java");
		Thread.sleep(1000);
		
	}
	
	@Test(groups="Listfield")
	public void TC3_2() throws InterruptedException {
		
		Select Cplus = new Select(driver.findElement(By.xpath(programming_languages)));
		Cplus.selectByValue("C++");
		Thread.sleep(1000);
		
	}
	
	@Test(groups="Listfield")
	public void TC3_3() {
		
		Select Csharp= new Select(driver.findElement(By.xpath(programming_languages)));
		Csharp.selectByValue("C#");
	}
	
	@Test(groups="Listfield")
	public void TC3_4() {
		Select JavaScript=new Select(driver.findElement(By.xpath(programming_languages)));
		JavaScript.selectByValue("JavaScript");	
	}
	
	@Test(groups="Listfield")
	public void TC3_5() {
		Select Python=new Select(driver.findElement(By.xpath(programming_languages)));
		Python.selectByValue("Python");
	}
	
	@Test(groups="Listfield")
	public void TC3_6() {
		Select PHP=new Select(driver.findElement(By.xpath(programming_languages)));
		PHP.selectByValue("Python");
	}
	
}
