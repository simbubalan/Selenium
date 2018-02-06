package sample;

import org.testng.Assert;
public class assertions extends browser{

	
	public static void main(String[] args) throws InterruptedException
	{
		Firefox();
		driver.manage().deleteAllCookies();
		driver.manage().window().fullscreen();
		driver.navigate().to("https://www.progressive.com");
		String WebpageName = driver.getTitle();
	//	Assert.assertFalse(WebpageName.equalsIgnoreCase("Progressive: Ranked One Of The Best Insurance Companies"), "Page title doesn't match");
		System.out.println(WebpageName);
		Thread.sleep(1000);
		Closebrowser();
	//	Assert.assertTrue(WebpageName.equalsIgnoreCase("Google"), "Page title is not same");
		Assert.assertEquals(1,1);
		Assert.assertEquals(1, 1, "Not Same");
		Assert.assertFalse(1>10, "Happy meal");
		System.out.println();
		}
}
