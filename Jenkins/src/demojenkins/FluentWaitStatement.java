package demojenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class FluentWaitStatement {
	
  @Test
  
  public void SampleFluentWait() {
	  
WebDriver driver;
	  
	  System.setProperty("webdriver.chrome.driver","D:\\eclipse\\chromedriver.exe");
	  	driver=new ChromeDriver();
	  	driver.manage().window().maximize();
	    driver.navigate().to("http://google.com");
	    FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	            .withTimeout(20, TimeUnit.SECONDS)
	            .pollingEvery(5, TimeUnit.SECONDS)
	             // We need to ignore this
	            .ignoring(NoSuchElementException.class);
	    driver.get("http://gmail.com");
	    driver.findElement(By.id("identifierId")).sendKeys("saibabukm");
	    WebElement Next= wait.until(new Function<WebDriver, WebElement>() {
	    	public WebElement apply(WebDriver driver) {
	    	return driver.findElement(By.id("identifierNext"));	    	
	    
	    	}
	    	
	    });

	    Next.click();
	    driver.quit();
	    
	    
}
  }