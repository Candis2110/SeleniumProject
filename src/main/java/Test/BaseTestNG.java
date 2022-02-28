package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.GoogleSearchObject;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestNG {
WebDriver driver = null;
	
	@BeforeMethod
	public void beforeMethod() { 
	Reporter.log("beforeMethod", true);
	}
	 
	@AfterMethod
	public void afterMethod() { 
	Reporter.log("afterMethod", true);
	}
	 
	@BeforeClass
	public void beforeClass() { 
	Reporter.log("beforeClass", true);
	}
	 
	@AfterClass
	public void afterClass() { 
	Reporter.log("afterClass", true);
	}
	
	@Test
	private void googleSearch() throws InterruptedException {
		
		GoogleSearchObject searchPage = new GoogleSearchObject(driver);
		
		driver.get("http://google.com");
		
		searchPage.setTextInSearchbox("Automation");
		
		Thread.sleep(2000);
		
		searchPage.clickSearch();
		
	}
	
	@BeforeTest
	public void beforeTest() { 
	Reporter.log("beforeTest", true);
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	}
	 
	@AfterTest
	public void afterTest() { 
	Reporter.log("afterTest", true);
	}
	 
	@BeforeSuite
	public void beforeSuite() { 
	Reporter.log("beforeSuite", true);
	}
	 
	@AfterSuite
	public void afterSuite() { 
	Reporter.log("afterSuite", true);
	}
}


