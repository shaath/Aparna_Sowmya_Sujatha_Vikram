package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTEstCase extends Constants
{
	@Test
	public void login()
	{
		driver.get(lp.url);
		lp.login(lp.u, lp.p);		
		Sleeper.sleepTightInSeconds(3);
		p.welcomeclick();
		p.logoutclick();
		driver.close();
	}

}
