package day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadiobuttonsEg2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		
		List<WebElement> radios=driver.findElements(By.name("group1"));
		System.out.println(radios.size());
		for (int i = 0; i < radios.size(); i++) 
		{
			String txt=radios.get(i).getAttribute("value");
			if (txt.equalsIgnoreCase("cheese"))
			{
				radios.get(i).click();
				break;
			}
		}

	}

}
