package com.SeleniumProject.javaprograammes;

public class ReuseEg {

	public static void main(String[] args) 
	{
		MethodsEg m=new MethodsEg();
		
		int res=m.sum(300, 200);
		System.out.println(res);
		
		System.out.println(m.x);
	}

}
