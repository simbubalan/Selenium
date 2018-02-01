package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Class1 
{
	public static WebDriver driver;
	public static void main(String[] args)
	{
		Firefox();Chrome();
		driver.get("https://www.flipkart.com");
		System.out.println(driver.getTitle());
		String S = driver.getTitle();
		System.out.println(S.toLowerCase().replaceAll("online", "OFFLINE"));
		driver.quit();
}
	
	public static void IE()
	{
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Cigniti_1931\\Downloads\\Selenium\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}

	public static void Chrome()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cigniti_1931\\Downloads\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-infobars"); 
		driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	
	public static void Firefox()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Cigniti_1931\\Downloads\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	
	public static void Closebrowser()
	{
		driver.close();
	}
}