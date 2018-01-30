package com.SeleniumProject.javaprograammes;

public class DynamicArrayEg1 {

	public static void main(String[] args) 
	{
		Object[] x=new Object[5];

		System.out.println(x.length);
		
		//Writing the data into an array
		x[2]=60000;
		x[4]="Selenium";
//		x[5]=50000;
		//Reading the data from an array
		for (int i = 0; i < x.length; i++) 
		{
			System.out.println(x[i]);
		}
	}

}
