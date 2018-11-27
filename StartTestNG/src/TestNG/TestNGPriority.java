package TestNG;

import org.testng.annotations.Test;

public class TestNGPriority {
  @Test
  public void Checkouts() 
  {
	  System.out.println("Checkouts ");
  }
  
  @Test(priority = 0)
  public void aHomepage()
  {
	  System.out.println("Homepage");
  }
  
  
  @Test
  public void signIn()
  {
	  System.out.println("signIn");
  }
  
 
  
  
}
