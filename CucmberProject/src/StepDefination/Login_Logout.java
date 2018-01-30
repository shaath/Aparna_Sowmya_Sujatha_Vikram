package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_Logout 
{
	public static WebDriver driver;
	@Given("^The Browser Invoked and Navigated to OrangeHRM$")
	public void the_Browser_Invoked_and_Navigated_to_OrangeHRM() throws Throwable
	{
	    driver=new FirefoxDriver();
	    driver.get("http://opensource.demo.orangehrmlive.com");
	}

	@When("^Tester Enter Username, Password$")
	public void tester_Enter_Username_Password() throws Throwable {
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin");
	}

	@When("^Tester Login button$")
	public void tester_Login_button() throws Throwable {
	    driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^Home page displyed with welcome admin link$")
	public void home_page_displyed_with_welcome_admin_link() throws Throwable 
	{
		String expval="welcome";
	    Sleeper.sleepTightInSeconds(3);
	    String actval=driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
	    
	    Assert.assertEquals(expval, actval);
	}

	@When("^Tester click on WelcomeAdmin link$")
	public void tester_click_on_WelcomeAdmin_link() throws Throwable {
		driver.findElement(By.partialLinkText("Welcome")).click();
	}

	@When("^Tester clicks on Logout link$")
	public void tester_clicks_on_Logout_link() throws Throwable {
	   driver.findElement(By.linkText("Logout")).click();
	}

	@Then("^Login page display$")
	public void login_page_display() throws Throwable 
	{
	   String expval="LOGIN";
	   Sleeper.sleepTightInSeconds(3);
	   String actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
	   Assert.assertEquals(expval, actval);
	}


}
