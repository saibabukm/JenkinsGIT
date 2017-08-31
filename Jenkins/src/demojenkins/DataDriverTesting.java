package demojenkins;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class DataDriverTesting {
	
  @Test
  
  public void LoginVerify() throws Exception, IOException {
	
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver","D://eclipse//chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://opensource.demo.orangehrmlive.com/");
	  
	  String filePath = "d:\\eclipse\\data.xls";
	  FileInputStream file = new FileInputStream(filePath);
	  
	  Workbook workBook = Workbook.getWorkbook(file);
	  Sheet sheet = workBook.getSheet(0);
	  
	  //get row count
	  int rowcount = sheet.getRows();
	  for(int i=0; i<rowcount; i++)
	  {
		  String userName = sheet.getCell(0,i).getContents();
		  String password = sheet.getCell(1,i).getContents();
	      
		  driver.findElement(By.name("txtUsername")).clear(); 		  
		  driver.findElement(By.name("txtUsername")).sendKeys(userName);
		  
		  driver.findElement(By.name("txtPassword")).clear();
		  driver.findElement(By.name("txtPassword")).sendKeys(password);
		  driver.findElement(By.name("Submit")).click();
		  
		  if(driver.getTitle().equals("OrangeHRM"))
		  {
			  System.out.println("Login Sucess");
		  }else{
			  System.out.println("Login Failed");
		  
			  continue;			  
		  }			  
			  driver.findElement(By.id("welcome")).click();
			  WebDriverWait wait = new WebDriverWait(driver,20);
			  WebElement Logout;
			  Logout= wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));
			  Logout.click();	  

	}
	  
  driver.close();
  workBook.close();

  }	  
	  }
	  