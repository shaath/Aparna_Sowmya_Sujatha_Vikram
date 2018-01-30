package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg1 {

	public static void main(String[] args) 
	{
		int count=0;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println("The number of links available in this page are "+links.size());

		for (int i = 0; i < links.size(); i++) 
		{
			
			if (!links.get(i).getText().equals("")) 
			{
				System.out.println(links.get(i).getText());
				count++; // count=count+1;
			}
		}
		System.out.println("The number of visible links are "+count);
	}

}
