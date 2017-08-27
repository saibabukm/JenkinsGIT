package demojenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait {
	
  @Test
  
  public void sampleExplictWait() {
WebDriver driver;
	  
	  System.setProperty("webdriver.chrome.driver","D:\\eclipse\\chromedriver.exe");
	  	driver=new ChromeDriver();
	  	driver.manage().window().maximize();
	    driver.navigate().to("http://google.com");
	    //To wait for element visible
	    WebDriverWait wait = new WebDriverWait(driver,20);
	    WebElement Gmail;
	    Gmail= wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Gmail")));
	    Gmail.click();;
	    driver.quit();
	  
  }
}
