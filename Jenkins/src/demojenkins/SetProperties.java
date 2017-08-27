package demojenkins;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SetProperties {
	
  @Test
  
  public void settingProperties()throws IOException {
	  		Properties p=new Properties();
			p.load(new FileReader("d://eclipse//setting.properties"));
			System.setProperty("webdriver.chrome.driver","D://eclipse//chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(p.getProperty("url"));
		    driver.findElement(By.id(p.getProperty("uid"))).sendKeys("testtester");
		    driver.findElement(By.id(p.getProperty("pwd"))).sendKeys("tester");
		    driver.findElement(By.id(p.getProperty("submit"))).click();
  }
}
