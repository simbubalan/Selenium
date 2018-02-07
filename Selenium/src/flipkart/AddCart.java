package flipkart;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AddCart extends BaseClass
{
	public static void main(String[] args)
	{
		Chrome();
		try {
			driver.get("https://www.flipkart.com");
			driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
			driver.findElement(By.xpath("//a[@href='/viewcart?otracker=Cart_Icon_Click']")).click();
			String Actual = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div[2]/span")).getText();
			String Expected = "Your Shopping Cart is empty";
			Assert.assertEquals(Actual,Expected);
			driver.quit();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}