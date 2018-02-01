package flipkart;

public class OpenPage extends BaseClass {

	public static void main(String[] args)
	{
		BrowserSelect();
		driver.get("https://www.flipkart.com");
		System.out.println(driver.getTitle());
		String S = driver.getTitle();
		System.out.println(S.toLowerCase().replaceAll("online", "OFFLINE"));
		driver.quit();
}

}
