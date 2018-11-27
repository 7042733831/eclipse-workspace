package Tower_Package;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Control_Operations {

	public static void main(String[] args) 
	
	{
        System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.horizonhobby.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("SignInLink")).click();
		
	    driver.findElement(By.linkText("Register")).click();
	    
	   
		   
		  
	   
	    //InputBox
	    driver.findElement(By.name("logonId")).sendKeys("ankur.rana@ondemandaility.com");
	    
	    System.out.println(driver.findElement(By.name("logonId")).getAttribute("value"));
	    
	    driver.findElement(By.name("logonId")).clear();
	    
	    //DropDown
	    Select year= new Select(driver.findElement(By.id("hobby_years")));
	    
	   // year.selectByIndex(2);
	    
	    year.selectByVisibleText("1-3 years");
	    	        
	    year.selectByValue("3");
	    
	    //driver.findElement(By.className("WC_UserRegistrationUpdateForm_FormInput_enrollInRewards_In_Register_1")).click();	 
	    
	    //CheckBox
		driver.findElement(By.name("enrollInRewards")).click();
		
		System.out.println(driver.findElement(By.name("enrollInRewards")).isSelected());
		
		driver.findElement(By.name("enrollInRewards")).click();
		
		System.out.println(driver.findElement(By.name("enrollInRewards")).isSelected());
		
	    //Buttons
		driver.findElement(By.linkText("Submit")).click();
		
		//HyperLink		
		driver.findElement(By.linkText("Privacy Policy")).click();
		
		//driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		String parentWindow = driver.getWindowHandle();
		Set<String> handles =  driver.getWindowHandles();
		   for(String windowHandle  : handles)
		       {
		       if(!windowHandle.equals(parentWindow))
		          {
		          driver.switchTo().window(windowHandle);
   		         driver.close(); //closing child window
		         driver.switchTo().window(parentWindow); //cntrl to parent window
		          }
		       }
						
	    driver.navigate().to("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		//Radio Button
	    driver.findElement(By.xpath("//*[@value='Female']")).click();
	    
	    java.util.List<WebElement> buttons = driver.findElements(By.cssSelector("input[name='exp']"));
		buttons.get(5).click();
		
		//Mutiple Selection dropDown
		Select comm = new Select(driver.findElement(By.name("selenium_commands")));
		comm.selectByIndex(1);
		comm.selectByVisibleText("Switch Commands");
		
	
		
	
	}

}
