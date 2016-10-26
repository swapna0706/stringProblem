package stringhandling;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testclass {
  @Test
  public void TestStringWithCharacters() 
  {
	  Assert.assertEquals("Heo", check("Hello",'l'));
  }
  @Test
  public void TestStringWithSplchars() 
  {
	  Assert.assertEquals("Heo", check("//* *\\",'l'));
  }
  
  @Test
  public void TestStringWithNums() 
  {
	  Assert.assertEquals("Heo", check("58226",'l'));
  }
  @Test
  public void TestNull() 
  {
	  try{
		  check(,'l');  
	  }
	  catch(NullPointerException)
	  {
		  System.out.println("Null pointer caught");
	  }
	  
  }
  
}
