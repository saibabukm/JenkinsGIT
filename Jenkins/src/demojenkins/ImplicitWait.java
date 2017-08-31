package demojenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitWait {
	
  @Test
  
  public void sampleImplictWait() {
	  WebDriver driver;
	  
	  System.setProperty("webdriver.chrome.driver","D:\\eclipse\\chromedriver.exe");
	  	driver=new ChromeDriver();
	  	driver.manage().window().maximize();	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.navigate().to("http://google.com");
	    driver.quit();
  }
}
