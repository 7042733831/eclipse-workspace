package Advanced_Selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Selenium_Grid {
	@Test
	public void GridTest() throws MalformedURLException
	{
		String baseURL="http://www-tst.horizonhobby.com";
		String nodeURL="http://172.16.0.165:5566/wd/hub";
		
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		WebDriver driver = new RemoteWebDriver(new URL(nodeURL),cap);
		driver.get(baseURL);
		

		driver.quit();

}
}
