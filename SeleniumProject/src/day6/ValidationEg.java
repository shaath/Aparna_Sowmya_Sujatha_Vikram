package day6;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidationEg {

	public static void main(String[] args) throws IOException 
	{
		String expval="gmail";
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");

		String actval=driver.getTitle();
		
		if (expval.equals(actval)) 
		{
			System.out.println("Pass");
		}
		else
		{
			File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("F:\\Aprna Recordings\\WorkSpace\\SeleniumProject\\src\\screenshots\\gmailexception.bmp"));

			System.out.println("Fail");
		}
	}

}
