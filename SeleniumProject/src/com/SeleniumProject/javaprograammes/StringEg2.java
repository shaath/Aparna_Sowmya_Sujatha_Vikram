package com.SeleniumProject.javaprograammes;

public class StringEg2 {

	public static void main(String[] args) 
	{
		String x="malayalam";// muineles
		String y="";
		//madam----->madam
		//malayalam--->malayalam
		int len=x.length();
//		for (int i = 0; i < len; i++) 
//		{
//			System.out.println(x.charAt(i));
//		}
		
		for (int i = len-1; i >= 0; i--)
		{
//			System.out.print(x.charAt(i));
			y=y+x.charAt(i);
		}
		if (x.equals(y)) 
		{
			System.out.println("The given is palindrome");
		}
		else
		{
			System.out.println("The given string is not a palindrome");
		}
	}

}
