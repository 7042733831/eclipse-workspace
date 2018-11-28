package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvider {
@Test//(dataProvider="Registraion")
  public void Register()
  {

		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmx.com");
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("signup-button")).click();
		driver.findElement(By.id("ida")).sendKeys("firstName");
		
		driver.findElement(By.name("z1736211896")).sendKeys("lastName");
		
		//driver.findElement(by)
  }
}
