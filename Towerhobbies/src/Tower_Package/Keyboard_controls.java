package Tower_Package;

import java.awt.event.MouseEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Mouse;

public class Keyboard_controls {
	
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www-tst.horizonhobby.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		 //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		//driver.findElement(By.id("j-close")).click();
		driver.findElement(By.xpath("//*[@id=\"j-close\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"SimpleSearchForm_SearchTerm\"]")).sendKeys("rtf");
		
		Actions action = new Actions(driver);
		
		action.sendKeys(Keys.ENTER).build().perform();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  
	   //	driver.findElement(By.xpath("//*[@id=\"searchBasedNavigation_widget\"]/form/div/div/div/div/div[3]/div/div[6]/div[4]/div[2]/div[1]/a")).click();
	   	//js.executeScript("alert('hello world')");
		
	   	js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//*[@id=\"searchBasedNavigation_widget\"]/form/div/div/div/div/div[3]/div/div[7]/div[3]/div[2]/div[1]/a")));
		driver.findElement(By.xpath("//*[@id=\"searchBasedNavigation_widget\"]/form/div/div/div/div/div[3]/div/div[7]/div[3]/div[2]/div[1]/a")).click();
		
		driver.findElement(By.cssSelector("#add2CartBtn")).click();
		
		//driver.findElement(By.id("GotoCartButton2")).click();
		//driver.findElement(By.xpath("//*[@id=\"GotoCartButton2\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"minishopcart_subtotal_text\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"minishopcart_subtotal\"]")).click();
		
		driver.navigate().back();
		//driver.findElement(By.cssSelector("#add2CartBtn")).click();
		//driver.findElement(By.xpath("//*[@id=\"minishopcart_subtotal\"]")).click();
		
		action.sendKeys(Keys.ENTER);
		
	}
}
