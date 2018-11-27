package Tower_Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class controls {

	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.horizonhobby.com");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"SimpleSearchForm_SearchTerm\"]")).sendKeys("p_");
		//driver.findElement(By.className("//*[@id=\"SimpleSearchForm_SearchTerm\"]")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//*[@id=\"search_submit\"]/i")).click();
		
		
		driver.findElement(By.className("product_name")).click();
		driver.findElement(By.id("add2CartBtn")).click();
		//driver.findElement(By.xpath("//*[@id=\"GotoCartButton2\"]")).click();
		driver.findElement(By.className("subtotal")).click();
		
		driver.findElement(By.xpath("//*[@id=\"orderItemDisplay\"]/h1")).getAttribute("class");
		
		
		
		/*List tableData = (driver.findElements(By.xpath("//*[@id=\"order_total\"]/tbody]")));
		
		System.out.println(tableData.size());*/
						
				 
		/*System.out.print(data.size());
		
		for(int i=1;i<data.size();i++)
		{
			System.out.println(data.get(i).getText());
		}*/
		
	}
}
