package demojenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WaitSelenium {
	
  @Test
  
  public void WaitinSelenium() {
WebDriver driver;
	  
	  System.setProperty("webdriver.chrome.driver","D:\\eclipse\\chromedriver.exe");
	  	driver=new ChromeDriver();
	  	driver.manage().window().maximize();
	    driver.navigate().to("https://demos.subrion.org/?demo=core&admin=1");
	    driver.findElement(By.id("username")).clear(); 		  
		driver.findElement(By.id("username")).sendKeys("admin");	    
		driver.findElement(By.id("password")).clear(); 		  
		driver.findElement(By.id("password")).sendKeys("admin");	    	  
  }
}
