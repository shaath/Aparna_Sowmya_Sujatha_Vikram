package day11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class AlertsEg {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.irctc.co.in");
		
		Sleeper.sleepTightInSeconds(5);
		
		driver.findElement(By.id("loginbutton")).click();
		
		Sleeper.sleepTightInSeconds(3);
		
		Alert alt=driver.switchTo().alert();
		
		String txt=alt.getText();
		System.out.println(txt);
		
//		alt.sendKeys("Yes");
		
		alt.accept();
//		alt.dismiss();

	}

}
