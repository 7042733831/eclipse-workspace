package TestNG;

import javax.swing.JOptionPane;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StartTestNG {
	
	
	  @AfterTest
	  public void afterTest()
	  {
		  JOptionPane.showMessageDialog(null, "After the test");
		 
	  }
	  
	   
	  @Test
	  public void CreditCard()
	  {
		    System.setProperty("webdriver.gecko.driver", "D:\\Drivers\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.google.com");
			driver.manage().window().fullscreen();
						
	  }
	  
	  @Test
	  public void AffirmCheckout()
	  {
		    System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://www.horizonhobby.com");
		    driver.manage().window().maximize();
	  }
	  
	  @Test
	  public void PayPalCheckout()
	  {
		    System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		    driver.get("https://www.towerhobbies.de");
		    driver.manage().window().maximize();
		  
	  }
	  
	  @BeforeTest
	  public void beforeTest()
	  {
		  JOptionPane.showConfirmDialog(null, "Run before the test");
		  
	  }
	  
	}