package com.SeleniumProject.javaprograammes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEg {

	public static void main(String[] args) 
	{
		Set<Object> s=new HashSet<Object>();
		
		//Writing the data 
		s.add("Selenium");
		s.add(60000);
		s.add("UFT");
		s.add('M');
		s.add("Apple");
		s.add("Boll");
		s.add("Apple");
		
		Iterator<Object> it=s.iterator();
		
		while (it.hasNext()) 
		{
			Object x=it.next();
			System.out.println(x);
		}
	}

}
