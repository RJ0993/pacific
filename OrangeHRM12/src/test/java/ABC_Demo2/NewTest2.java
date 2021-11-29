package ABC_Demo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest2 {
	static WebDriver driver;
	
	@DataProvider(name="data1")
	
	public static Object[][] Test1()throws Exception{
		
		return new Object[][] {
				
				{"https://opensource-demo.orangehrmlive.com/","Admin","admin123","Indians127"}
				};
		
		
		
		
		
	}
  @Test(dataProvider="data1")
  public void test1(String url,String username,String password,String nation) {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	 	driver =new ChromeDriver();
	 	driver.manage().window().maximize();	  
	 	
	 	driver.get(url);
	 	
	 	driver.findElement(By.id("txtUsername")).sendKeys(username);
	 	driver.findElement(By.id("txtPassword")).sendKeys(password);
	 	driver.findElement(By.id("btnLogin")).click();
	 	//driver.findElement(By.id("nationality_name")).sendKeys(nation);
	  
  }
}
