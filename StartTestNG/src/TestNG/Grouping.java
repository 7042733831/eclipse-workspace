package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Grouping {
  @Test(groups= {"Group1"})
  public void signIn() 
  {
	  System.out.println("Sign Test MEtho dis executed");
  }
  
  @Test(groups= {"Group2"},priority = 1)
 
  public void myAccount()
  {
	  System.out.println("myAccount TestMEthod is exceuted");
  }
  
  @BeforeTest
  public void Checkout() 
  {
	System.out.println("Before Methof is executed");  
  }
  
  @AfterMethod
  public void shoppingCart()
  {
	  System.out.println("After Method is executed");
  }
  
  @Test(groups= {"Group2"},priority = 0)
  public void User()
  {
	  System.out.println("User Is executed");
  }
}
