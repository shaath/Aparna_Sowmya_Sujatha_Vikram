import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class ChromeLaunch {

	public static void main(String[] args)
	{
//		System.setProperty("webdriver.chrome.driver", "F:\\Cdownloads/chromedriver.exe");
//		ChromeDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.ie.driver", "F:\\Cdownloads\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
	}

}
