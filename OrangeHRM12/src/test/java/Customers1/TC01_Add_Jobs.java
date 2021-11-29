package Customers1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Add_Jobs {
	
	WebDriver driver;
	
	//Step1
	String TestURL="https://opensource-demo.orangehrmlive.com/";
	String UserName="Admin",password="admin123";
	String JobTitle="Sales7",JobDescr="Sales7 descr",JobNote="Sales7 Note";
	
	
  @Test
  public void Add_Jobs()throws Exception {
	  
	
	  TC01_Add_Jobs T2=new TC01_Add_Jobs();
	  
	  T2.OpenChromeBrowser();
	  T2.OpenOrangeHRM(TestURL); //step2
	  T2.Login(UserName,password);//step2
	  T2.AddJobs(JobTitle,JobDescr,JobNote);//step2
	  //T2.CloseBrowser();

		
	  
  }
  
  
  
	 public  WebElement findElement(By by) throws Exception 
		{
	
			WebElement elem = driver.findElement(by);  
			
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		 
			}
			return elem;
		}

  
	 
	 public void OpenChromeBrowser() throws Exception
	 {
		  	//Launch Browser
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.manage().window().maximize() ;
		 
	 }
	 
	 public void OpenOrangeHRM(String TestURL1) throws Exception
	 {
			//Open Orange HRM
			driver.get(TestURL1);
	 }
	 
	 
	 public void Login(String UNAME,String PWD) throws Exception
	 {
			
			//Login
			findElement(By.id("txtUsername")).sendKeys(UNAME);
			findElement(By.id("txtPassword")).sendKeys(PWD);
			findElement(By.id("btnLogin")).click();
		 
	 }
	 
	 
	 
	 public void AddJobs(String JOBTITLE,String JOBDESC,String JOBNOTE) throws Exception
	 {
			
			//AddJobs
			findElement(By.id("menu_admin_viewAdminModule")).click();
			findElement(By.id("menu_admin_Job")).click();
			findElement(By.id("menu_admin_viewJobTitleList")).click();
			findElement(By.id("btnAdd")).click();
			findElement(By.id("jobTitle_jobTitle")).sendKeys(JOBTITLE);
			findElement(By.id("jobTitle_jobDescription")).sendKeys(JOBDESC);
			findElement(By.id("jobTitle_note")).sendKeys(JOBNOTE);
			findElement(By.id("btnSave")).click();
	 }
	 
	 
	 public void CloseBrowser() throws Exception
	 {
		 driver.quit();
	 }
	 
  
  
}
