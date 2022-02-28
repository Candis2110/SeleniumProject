package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GoogleSearchObject;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://google.com/");
		
		GoogleSearchObject Googlepage = new GoogleSearchObject(driver);
		
		Googlepage.setTextInSearchbox("Automation");
		Thread.sleep(2000);
		
		Googlepage.clickSearch();
		
	}

}
