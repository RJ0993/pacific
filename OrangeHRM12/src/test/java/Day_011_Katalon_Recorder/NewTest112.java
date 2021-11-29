package Day_011_Katalon_Recorder;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;

public class NewTest112 {
	WebDriver driver;
	Reporter1 R1;
	
	
	public void TC01_Report_Test() throws Exception {
		
		   driver.get("https://opensource-demo.orangehrmlive.com/");
		    driver.findElement(By.id("txtUsername")).sendKeys("Admin");

		    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		    driver.findElement(By.id("btnLogin")).click();
		    
	}
	
		  
		  
	
  @Test
  public void testNewTest112() throws Exception {
	  driver = TestBrowser.OpenChromeBrowser();
	   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	    driver.findElement(By.id("txtUsername")).click();
	    driver.findElement(By.id("txtUsername")).clear();
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("frmLogin")).click();
	    driver.findElement(By.id("txtPassword")).click();
	    driver.findElement(By.id("txtPassword")).clear();
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']/b")).click();
	    driver.findElement(By.id("menu_admin_Qualifications")).click();
	    driver.findElement(By.id("menu_admin_viewSkills")).click();
	    driver.findElement(By.id("btnAdd")).click();
	    driver.findElement(By.id("skill_name")).click();
	    driver.findElement(By.id("skill_name")).clear();
	    driver.findElement(By.id("skill_name")).sendKeys("Java5");
	    driver.findElement(By.id("skill_description")).click();
	    driver.findElement(By.id("skill_description")).clear();
	    driver.findElement(By.id("skill_description")).sendKeys("java5dec");
	    driver.findElement(By.id("btnSave")).click();
	  
  driver.quit();
}


// Draws a red border around the found element. Does not set it back anyhow.
public  WebElement findElement(By by) throws Exception 
{
			
	 WebElement elem = driver.findElement(by);    	    
	// draw a border around the found element
	 
	if (driver instanceof JavascriptExecutor) 
	{
	 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);

	}
	
	return elem;
}
		
  }

