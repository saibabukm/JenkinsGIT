package demojenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JenkinsJobs {
	private WebDriver driver;
	
	@BeforeMethod
	public void printBrowserUsed() {
		//Create a instance of ChromeOptions class
		ChromeOptions options=new ChromeOptions();
		//Add browser switch to disable notification - "--disable-notifications"
		options.addArguments("--disable-notifications");
		//web driver path
		System.setProperty("webdriver.chrome.driver","D://eclipse//chromedriver.exe");
		//initiate the web driver		
		driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// maximize the browser
		driver.manage().window().maximize();
				
	}
	
	@BeforeTest
	public void doBeforeTest() {
		System.out.println("Welcome to Jenkins");
	}

	@Test
	public void StagingServer() {
		//launch the browser and open the application url's
		driver.get("http://www.adactin.com/HotelAppBuild2/index.php");
		//defining the elements and perform actions such as click on it
		driver.findElement(By.id("username")).sendKeys("testtester");
		driver.findElement(By.id("password")).sendKeys("tester");
		driver.findElement(By.id("login")).click();
		new Select(driver.findElement(By.id("location"))).selectByVisibleText("Sydney");
		new Select(driver.findElement(By.id("hotels"))).selectByVisibleText("Hotel Creek");
		new Select(driver.findElement(By.id("room_type"))).selectByVisibleText("Standard");
		driver.findElement(By.id("datepick_in")).clear();
		driver.findElement(By.id("datepick_in")).sendKeys("25/08/2017");
		driver.findElement(By.id("datepick_out")).clear();
		driver.findElement(By.id("datepick_out")).sendKeys("27/08/2017");
		new Select(driver.findElement(By.id("adult_room"))).selectByVisibleText("1 - One");
		new Select(driver.findElement(By.id("child_room"))).selectByVisibleText("1 - One");
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("first_name")).sendKeys("Saibabu");
		driver.findElement(By.id("last_name")).sendKeys("kamatham");
		driver.findElement(By.id("address")).sendKeys("Guntur 522006");
		driver.findElement(By.id("cc_num")).sendKeys("8278070700051954");
		new Select(driver.findElement(By.id("cc_type"))).selectByVisibleText("VISA");
		new Select(driver.findElement(By.id("cc_exp_month"))).selectByVisibleText("June");
		new Select(driver.findElement(By.id("cc_exp_year"))).selectByVisibleText("2018");
		driver.findElement(By.id("cc_cvv")).sendKeys("123");
		driver.findElement(By.id("book_now")).click();
		
	}
	
	@AfterTest
	public void doAfterTest() {
		System.out.println("Test Case Pass");
	}
	
	@AfterSuite
	public void quitDriver() throws Exception {
		driver.quit();
	}
}