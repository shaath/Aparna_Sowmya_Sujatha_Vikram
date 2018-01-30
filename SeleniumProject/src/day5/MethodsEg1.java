package day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MethodsEg1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		
//		System.out.println(driver.getTitle());
		
//		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getPageSource());

	}

}
