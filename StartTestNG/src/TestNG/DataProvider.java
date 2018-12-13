package TestNG;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import org.testng.annotations.DataProvider;

//import TestNG.ExcelUtils;
public class dataprovider {
	
	@Test
	public void testExcel()
	{
	System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
  		
  		WebDriver driver = new ChromeDriver();
     	driver.get("https://www.gmx.com");
  		
  		ExcelUtils excel = new ExcelUtils();
  		
  		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
  		
		driver.manage().window().maximize();
  		
        driver.findElement(By.id("signup-button")).click();
  		driver.findElement(By.id("28baf9c0-fdcf-11e8-ad66-472a8a5e210e")).sendKeys(excel.ExcelData(1,1));
  		
  		driver.findElement(By.id("28bb20d0-fdcf-11e8-ad66-472a8a5e210e")).sendKeys(excel.ExcelData(1, 2));
  		
  		System.out.println(excel.ExcelData(1, 0));
  		System.out.println(excel.ExcelData(1, 1));
  		System.out.println(excel.ExcelData(1, 2));
		
		
	}
  
  	 

// @Test(dataProvider = "Registration")
    public void Register(String firstName, String lastName, String userName,String Password )
    {

  		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
  		
  		WebDriver driver = new ChromeDriver();
  		driver.get("https://www.gmx.com");
  		
  		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
  		
  		driver.manage().window().maximize();
  		
  		driver.findElement(By.id("signup-button")).click();
  		driver.findElement(By.id("ida")).sendKeys(firstName);
  		
  		driver.findElement(By.id("idc")).sendKeys(lastName);
  		
  		Select options = new Select(driver.findElement(By.id("ide")));
  		options.selectByIndex(1);
  		
  		Select month = new Select(driver.findElement(By.id("id13")));
  		month.selectByIndex(5);
  		
  		Select day = new Select(driver.findElement(By.id("id10")));
  		day.selectByIndex(22);
  		
  		Select year = new Select(driver.findElement(By.id("id14")));
  		year.selectByIndex(19);
  		
  		driver.findElement(By.id("id1d")).sendKeys(userName);
  		driver.findElement(By.id("id27")).sendKeys(Password);
  		driver.findElement(By.id("id2a")).sendKeys(Password);
  		
  		Select question = new Select(driver.findElement(By.id("id36")));
  		question.selectByIndex(1);
    }

/*
  @DataProvider(name = "Registration")
  public Object[][] data() throws Exception
  {
      Object[][] testObjArray = ExcelUtils.getTableArray("C:\\Users\\ankur.rana\\Desktop\\GmxData.xlxs","GmxData",1);
      return (testObjArray);
  
  }*/
}
