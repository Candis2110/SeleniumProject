package Test;

import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GoogleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		
		googleSearch();
	}

	private static void googleSearch() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://google.com/");
		
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation");
		Thread.sleep(2000);
		
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		GoogleSearchPage.language(driver).click();
	}

	public void clickSearch() {
		// TODO Auto-generated method stub
		
	}

	public void setTextInSearchbox(String string) {
		// TODO Auto-generated method stub
		
	}


}
