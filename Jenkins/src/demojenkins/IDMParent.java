package demojenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
* Example to demonstrate TestNG inherited dependency method execution
*
* @author Saibabu K
* @version 1.0
*/

public class IDMParent {
private WebDriver driver;
	
	@BeforeMethod
	public void printBrowserUsed() {
		
		Reporter.log("=====Browser Session Started=====", true);
		//Create a instance of ChromeOptions class
		ChromeOptions options=new ChromeOptions();
		//Add browser switch to disable notification - "--disable-notifications"
		options.addArguments("--disable-notifications");
		//web driver path
		System.setProperty("webdriver.chrome.driver","D://eclipse//chromedriver.exe");
		//initiate the web driver		
		driver=new ChromeDriver(options);		
		// maximize the browser
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void BaseClass() {
		
		Reporter.log("=====Application Started=====", true);
		//launch the browser and open the application url's
		driver.get("http://www.adactin.com/HotelAppBuild2/index.php");
		//defining the elements and perform actions such as click on it
		driver.findElement(By.id("username")).sendKeys("testtester");
		driver.findElement(By.id("password")).sendKeys("tester");
		driver.findElement(By.id("login")).click();
		Reporter.log("=====Successfully logged in=====", true);
	}
	
	
	//@AfterMethod
	//public void quitDriver() throws Exception {
	//driver.quit();
	//Reporter.log("=====Browser Session End=====", true);
 //}	
}