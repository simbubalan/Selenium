package flipkart;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass 
{
	public static WebDriver driver;

	public static void IE()
	{
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Cigniti_1931\\Downloads\\Selenium\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	public static void Chrome()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Cigniti_1931\\Downloads\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("disable-infobars"); 
		driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public static void Firefox()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Cigniti_1931\\Downloads\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@SuppressWarnings("resource")
	public static void BrowserSelect()
	{
		System.out.println("Choose Browser - PRESS 1 for IE, PRESS 2 for FireFox, PRESS Enter for Chrome");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		switch (input)
		{
		case "1":
			Firefox();
			break;
		case "2":
			IE();
			break;
		default:
			Chrome();
			break;
		}
	}
	
	public static void Closebrowser()
	{
		driver.close();
	}
}