package com.SeleniumProject.javaprograammes;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args)
	{
		ArrayList<Object> x=new ArrayList<Object>();
		System.out.println(x.size());
		//Writing the data into arrayist
		x.add("Selenium");
		x.add(true);
		x.add(50000);
		x.add('M');
		x.add(2, "UFT");
		System.out.println(x.size());
		
		for (int i = 0; i < x.size(); i++) 
		{
			System.out.println(x.get(i));
		}
	}

}
