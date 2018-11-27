package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
  @Test
  public void StartAssertion()
  {
	  
	  SoftAssert softAssert = new SoftAssert();
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.horizonhobby.com");
	  
	  driver.manage().window().maximize();
	  
	   
	  Assert.assertEquals(driver.getTitle(), "RC Airplanes, Multirotors, Cars, Trucks and Helicopters | HorizonHobby");
	  
	  System.out.println("Title is correct");
	  
	  softAssert.assertEquals(driver.findElement(By.id("MyRewardLink")).getText(), "Horizon RC Clu","Label name is not correct");
	     System.out.println("Name is okay");	  
	  }
  
}
