package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class Constants 
{
	public static WebDriver driver=new FirefoxDriver();
	
	public static LoginPge lp=PageFactory.initElements(driver, LoginPge.class);
	
	public static Homepage p=PageFactory.initElements(driver, Homepage.class);
}
