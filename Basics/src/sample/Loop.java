package sample;

import org.openqa.selenium.By;

public class Loop extends browser{

	
	public static void main(String[] args) throws InterruptedException
	{
		Firefox();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com");
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[3]/div/div/a[2]")).click();
		System.out.println("END");
		driver.quit();
	}
	
}