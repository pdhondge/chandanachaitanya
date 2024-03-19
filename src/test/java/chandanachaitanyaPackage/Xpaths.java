package chandanachaitanyaPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v119.domsnapshot.model.DocumentSnapshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Xpaths {

	WebDriver driver;
	
	
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void Beforemethod() {
		
		
		 driver=new ChromeDriver();
		 driver.get(URL);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
	}
	
	
	@AfterMethod
	public void aftermethod() throws IOException {
		
		TakesScreenshot ss=(TakesScreenshot)driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File("/home/prathamesh/eclipse-workspace/chandanachaitanya/Screenshots/Testcasefailed.png");
		FileUtils.copyFile(src, dest);
		
		
		driver.close();
	}
	
	
	String	URL ="https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=";
 
	
	@findby
	
	
	// checkbox xapths

	String Bicycle = "//input[@id='bicycle-checkbox']";
	String Tricycle = "//input[@id='tricycle-checkbox']";
	String Bike = "//input[@id='bike-checkbox']";
	String Hatchback = "//input[@id='hatchback-checkbox']";
	String Sedan = "//input[@id='sedan-checkbox']";
	String Van = "//input[@id='van-checkbox']";
	String SUV = "//input[@id='suv-checkbox']";
	String Truck = "//input[@id='truck-checkbox']";
	
	
	
	// Radio Buttons Xpaths
	
	String Magazines = "//input[@id='magazines-radio-btn']";
	String Novels = "//input[@id='novels-radio-btn']";
	String Self_help_books = "//input[@id='self-help-radio-btn']";
	
	
	// Listfield (Dropdown) xpaths
	
	String programming_languages = "//select[@id='programming-languages']";
	
	// Multi slect Xpaths
	
	String selenium_suite = "//select[@id='selenium_suite']";
	
	// Window Handle Xpaths
	
	String alertBox ="//button[@id = 'alertBox']";
	String confirmBox = "//button[@id = 'confirmBox']";
	String promptBox = "//button[@id = 'promptBox']";
	
	
	// Textfield Xpaths
	
	String Message = "//input[@id = 'enterText']";	
	
	
	// Actions Xpaths
	
	String sendKeys = "//li[contains(text(),'sendKeys')]";
	String click = "//li[contains(text(),'click')]";
	String findElement = "//li[contains(text(),'findElement')]";
	String clickAndHold = "//li[contains(text(),'clickAndHold')]";

}

