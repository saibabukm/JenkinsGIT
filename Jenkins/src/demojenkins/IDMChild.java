package demojenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class IDMChild extends IDMParent {
	
	private WebDriver driver; 
  
  @Test
  public void BaseClass() {
	  
	    new Select(driver.findElement(By.id("location"))).selectByVisibleText("Sydney");
		new Select(driver.findElement(By.id("hotels"))).selectByVisibleText("Hotel Creek");
		new Select(driver.findElement(By.id("room_type"))).selectByVisibleText("Standard");
		driver.findElement(By.id("datepick_in")).clear();
		driver.findElement(By.id("datepick_in")).sendKeys("27/08/2017");
		driver.findElement(By.id("datepick_out")).clear();
		driver.findElement(By.id("datepick_out")).sendKeys("29/08/2017");
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
}
