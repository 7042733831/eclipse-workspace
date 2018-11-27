package Tower_Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Open the site
		driver.get("http://www.newtours.demoaut.com/");
		
        //window maximize
		driver.manage().window().maximize();
		
		//Entering User and Password
		driver.findElement(By.name("userName")).sendKeys("abcd");
		driver.findElement(By.name("password")).sendKeys("abcd");
		
		//click Sign In 
		driver.findElement(By.name("login")).click();
		//driver.findElement(By.tagName("Sign-In")).click();
		
		//Departure from London
		Select london = new Select(driver.findElement(By.name("fromPort")));
		london.selectByIndex(2);
		
		//Selecting month Oct
		Select month = new Select(driver.findElement(By.name("fromMonth")));
		month.selectByIndex(9);
		
		//Selecting day 26 
		Select date = new Select(driver.findElement(By.name("fromDay")));
		date.selectByIndex(25);
		
		//Selecting arriving port
		Select arriving = new Select(driver.findElement(By.name("toPort")));
		arriving.selectByIndex(4);
		
		//Selecting return month
		Select returning = new Select(driver.findElement(By.name("toMonth")));
		returning.selectByIndex(11);
		
		//Select business Radiobutton
		driver.findElement(By.cssSelector("input[name ='servClass'][value ='Business']")).click();
		
		//Selecting airline
		Select airplane = new Select(driver.findElement(By.name("airline")));
		airplane.selectByIndex(1);
		
		//Click continue
		driver.findElement(By.name("findFlights")).click();
		
		//Click again continue
		driver.findElement(By.name("reserveFlights")).click();
		
		//Enter the name of paassenger
		driver.findElement(By.name("passFirst0")).sendKeys("Thomas");
		driver.findElement(By.name("passLast0")).sendKeys("Cook");
		
		//Calorie
		Select cal = new Select(driver.findElement(By.name("pass.0.meal")));
		cal.selectByIndex(5);
		
		//Selecting card type
		Select cards = new Select(driver.findElement(By.name("creditCard")));
		cards.selectByIndex(3);
		
		//Input card number
		driver.findElement(By.xpath("//input[@name ='creditnumber']")).sendKeys("6000000011111117");
		
		//Expiry date of card
		Select exp = new Select(driver.findElement(By.name("cc_exp_dt_mn")));
		exp.selectByIndex(2);
		Select exp2 = new Select(driver.findElement(By.name("cc_exp_dt_yr")));
		exp2.selectByIndex(10);
		
		//Enter name details 
		driver.findElement(By.xpath("//input[@name='cc_frst_name']")).sendKeys("Thomas");
		driver.findElement(By.xpath("//input[@name='cc_mid_name']")).sendKeys("Cook");
		
		//Address
		driver.findElement(By.name("billAddress1")).sendKeys("SCO 43,");
		driver.findElement(By.name("billAddress2")).sendKeys("old Judicial Complex,");
		driver.findElement(By.name("billCity")).sendKeys("Champaign");
		driver.findElement(By.xpath("//input[@name='billState']")).clear();
		driver.findElement(By.xpath("//input[@name='billState']")).sendKeys("Illinois");
		driver.findElement(By.name("billZip")).clear();
		driver.findElement(By.name("billZip")).sendKeys("80001");
		
		/*//Selecting country
		Select count = new Select(driver.findElement(By.name("billCountry")));
		List countries = (driver.findElements(By.name("billCountry")));
		//count.selectByIndex((215));
		
		count.selectByValue("UNITED KINGDOM");*/
		
		//click final
	    driver.findElement(By.name("buyFlights")).click();
		//driver.findElement(By.xpath("//input[src=\"/images/forms/purchase.gif\"]")).click();
		
        /*List tableData = (driver.findElements(By.xpath("//*[@id=\"order_total\"]/tbody]")));
		
		System.out.println(tableData.size());*/
		
		/*List tableData = (driver.findElements(By.xpath("/html/body/div/table")));
		
		System.out.println(tableData.size());
	  
	    for(int i=1;i<tableData.size();i++)
		{
			System.out.println(((WebElement) tableData.get(i)).getText());
		}
		*/
	  //span[contains(text(), 'Assign Rate')
	  /*  
	    String data = driver.findElements(By.xpath("//td[contains(text(),'Confirmation '")).toString();
	    System.out.println(data);
	    
	   */
	    System.out.println(driver.findElement(By.className("frame_header_info")).getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
