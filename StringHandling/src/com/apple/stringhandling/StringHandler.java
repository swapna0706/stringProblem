package com.apple.stringhandling;

public class StringHandler 
{
	public static String check(String word,char ch) 
	{
		StringBuilder sb = new StringBuilder();
		
		char[] letters = word.toCharArray(); 
		
		for(char c : letters)
		{
			if(c != ch )
			{ 
				sb.append(c); 
			}
		}
		//System.out.println(sb.toString());
		return sb.toString();
				
		}
	public static String strRep(String word,String ch)
	{
			
		String a =word.replaceAll(ch,"");
		
		return(a);
		
	}
		
	

}
