package com.apple.test.stringhandling;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.apple.stringhandling.StringHandler;

public class TestCases {
		
  @Test
  public void TestStringWithCharacters() 
  {
	  Assert.assertEquals("Heo", StringHandler.check("Hello",'l'));
  }
  @Test
  public void TestStringWithSplchars() 
  {
	  Assert.assertEquals("//* *\\", StringHandler.check("//* *\\",'l'));
  }
  
  @Test
  public void TestStringWithNums() 
  {
	  Assert.assertEquals("58226", StringHandler.check("58226",'l'));
  }
  @Test
  public void TestNull() 
  {
	  try{
		  StringHandler.check(null,'l');  
	  }
	  catch(NullPointerException e)
	  {
		  
		  System.out.println("Null pointer caught");
	  }
	  
  }
  @Test
  public void TestStringWithCharStringFunc() 
  {
	  Assert.assertEquals("Heo", StringHandler.strRep("Hello","l"));
  }
  
}
