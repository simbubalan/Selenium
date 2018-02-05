package flipkart;

public class OpenPage extends BaseClass {

	public static void main(String[] args)
	{
		Chrome();
		driver.get("https://www.flipkart.com");
		System.out.println(driver.getTitle());
//		String Webpagename = driver.getTitle();
//		System.out.println(Webpagename.toLowerCase().replaceAll("online", "OFFLINE"));
		driver.quit();
}

}
