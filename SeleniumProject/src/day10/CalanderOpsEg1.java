package day10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class CalanderOpsEg1 {

	public static void main(String[] args) 
	{
		String expdate="18/November/2019";
		String[] x=expdate.split("/");
		String day=x[0];
		String month=x[1];
		String year=x[2];
		System.out.println(day+"----"+month+"-----"+year);
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");

		driver.findElement(By.id("DepartDate")).click();
		Sleeper.sleepTightInSeconds(3);
		
		//Year Selection
		String calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		
		while (!calyear.equals(year))
		{
			driver.findElement(By.className("nextMonth ")).click();
			calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		
		//Month selection
		String calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		
		while (!calmonth.equalsIgnoreCase(month))
		{
			driver.findElement(By.className("nextMonth ")).click();
			calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		
		//Day Selection
		List<WebElement> daylist=driver.findElements(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr/td"));
		
		for (int i = 0; i < daylist.size(); i++) 
		{
			String calday=daylist.get(i).getText();
			if (calday.equals(day))
			{
				daylist.get(i).click();
				break;
			}
		}
	}

}

