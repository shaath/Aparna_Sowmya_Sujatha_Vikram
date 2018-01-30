package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class GmailLoginEg {

	public static void main(String[] args) 
	{
		
		//Launch the firefox browser
		FirefoxDriver driver=new FirefoxDriver();
		//Launching the app
		driver.get("http://gmail.com");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//Identifying the textbox
		WebElement email=driver.findElement(By.id("identifierId"));
		
		//Send text into email textbox
		email.sendKeys("testingtoolstrainer449");

//		email.clear();
		//Clicking on next button
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		
//		Sleeper.sleepTightInSeconds(10);
		
		//Entering text into password textbox
		driver.findElement(By.name("password")).sendKeys("123456789");
		//clicking on next button
		driver.findElement(By.cssSelector(".RveJvd.snByac")).click();
		
	}

}
