import org.openqa.selenium.firefox.FirefoxDriver;


public class Sample {

	public static void main(String[] args) 
	{
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\Downloads\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");

	}

}


