package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class AutoFillersEg {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://redbus.in");
		
		driver.findElement(By.xpath(".//input[@tabindex='1']")).sendKeys("H");
		Sleeper.sleepTightInSeconds(3);
		
		List<WebElement> auto=driver.findElements(By.xpath(".//*[@id='search']/div/div[1]/div/ul/li"));
		
		System.out.println(auto.size());
		
		for (int i = 0; i < auto.size(); i++) 
		{
			String city=auto.get(i).getText();
			System.out.println(city);
			if (city.equalsIgnoreCase("hosur"))
			{
				auto.get(i).click();
				break;
			}
		}

	}

}
