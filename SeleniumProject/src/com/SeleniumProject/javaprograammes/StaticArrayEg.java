package com.SeleniumProject.javaprograammes;

public class StaticArrayEg {

	public static void main(String[] args) 
	{
		int[] Salary={20000,30000,40000,50000,60000};

		
		System.out.println(Salary.length);
//		System.out.println(Salary[2]);
		
//		for (int i = 0; i < Salary.length; i++) 
//		{
//			System.out.println(Salary[i]);
//		}
		
		for (int data : Salary) 
		{
			System.out.println(data);
		}
	}

}
