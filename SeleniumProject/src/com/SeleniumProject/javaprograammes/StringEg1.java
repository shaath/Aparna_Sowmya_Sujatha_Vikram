package com.SeleniumProject.javaprograammes;

public class StringEg1 {

	public static void main(String[] args) 
	{
		String course="selenium";
		int len=course.length();
		System.out.println("The length of the String is "+len);
		
		System.out.println(course.charAt(5));
		
		System.out.println(course.substring(2, 6));
		
		System.out.println(course.replace('e', 'a'));

		String x="My name is Sharath";
		
//		x.split(" ");// My, name, is, sharath
		
		
	}

}
