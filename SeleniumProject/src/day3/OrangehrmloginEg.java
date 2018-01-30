package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class OrangehrmloginEg {

	public static void main(String[] args) 
	{
		//Launch the firefox browser
		WebDriver driver=new FirefoxDriver();
		//OrangeHRm app launch
		driver.get("http://opensource.demo.orangehrmlive.com/");
//		Sleeper.sleepTightInSeconds(5000);
		//Entering the username into username field
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//entering password into password field
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		//Clicking on login button
		driver.findElement(By.id("btnLogin")).click();
		Sleeper.sleepTightInSeconds(5);
		//clicking welcome admin link
		driver.findElement(By.partialLinkText("Welcome")).click();
		//clicking on logout link
		driver.findElement(By.linkText("Logout")).click();
		
		//Close the browser
		driver.close();
	}

}
