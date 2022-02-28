package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.GoogleSearchObject;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchNG {
	static WebDriver driver = null;
	
	@BeforeTest
	public void setuptest()
	{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		
	}
	@Test
	private static void googleSearch() throws InterruptedException 
	{
		GoogleSearchObject Googlepage = new GoogleSearchObject(driver);
		driver.navigate().to("http://google.com/");
		Googlepage.setTextInSearchbox("Automation");
		Thread.sleep(2000);
		Googlepage.clickSearch();
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		driver.quit();
		System.out.println("Test Completed");
	}

}
