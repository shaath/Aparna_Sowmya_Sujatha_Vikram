package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webdriverwaitEg {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.24hourfitness.com/");
		WebDriverWait wait=new WebDriverWait(driver, 40);
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//*[@id='page-content']/div[1]/div[2]/div/div[2]/div[1]/div/a"))));
		driver.findElement(By.xpath(".//*[@id='page-content']/div[1]/div[2]/div/div[2]/div[1]/div/a")).click();

	}

}
