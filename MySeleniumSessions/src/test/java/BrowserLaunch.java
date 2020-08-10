import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "../MySeleniumSessions/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement userid = driver.findElementById("email");
		userid.sendKeys("Testing");

	}

}
