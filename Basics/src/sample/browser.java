package sample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class browser 
{
	public static WebDriver driver;
	
	public static void IE()
	{
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Cigniti_1931\\Downloads\\Selenium\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
	}

	public static void Chrome()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cigniti_1931\\Downloads\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-infobars"); 
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
	}
	
	public static void Firefox()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Cigniti_1931\\Downloads\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	public static void Closebrowser()
	{
		driver.close();
	}
}
