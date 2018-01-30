package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MethodsEg {

	public WebDriver driver;
	public static void main(String[] args) 
	{
		function1();
		String res=function2();
		System.out.println(res);
		
		MethodsEg m=new MethodsEg();
		m.function3();
		
		boolean flag=m.function4();
		System.out.println(flag);
		
		int c=m.sum(60,40);
		System.out.println(c);
	}
	
	//Static Method without returning anyvalue
	public static void function1()
	{
		System.out.println("This is Function1 code");
	}
	//Static Method with returning value
	public static String function2()
	{
		System.out.println("This is Function2 code");
		return "Pass";
	}
	//Nonstatic Method without returning anyvalue
	public void function3()
	{
		System.out.println("This is Function3 code");
	}
	//Nonstatic methods with returning value
	public boolean function4()
	{
		System.out.println("This is Function4 code");
		return true;
	}
	
	
	public int sum(int a, int b)
	{
		int c=a+b;
		return c;
	}
	
	public void Br_Launch(String br)
	{
		if (br.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if (br.equalsIgnoreCase("Chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Cdownloads/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (br.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "F:\\Cdownloads\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
	}
	
	
	
}
