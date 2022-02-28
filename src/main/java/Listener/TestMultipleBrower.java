package Listener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMultipleBrower {
	
	WebDriver driver = null;
	
	@Parameters("browerName")
	@BeforeTest
	public void setUp(String browerName)
	{
		System.out.println("Brower is :" +browerName);
		
		if(browerName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browerName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browerName.equalsIgnoreCase("ie"))
		{
			WebDriverManager.iedriver().arch64().setup();
			driver = new InternetExplorerDriver();
		}
	}
	
	@Test
	public void browerTest() throws InterruptedException
	{
		driver.navigate().to("http://google.com/");
		Thread.sleep(3000);
	}
	
	@AfterTest
	public void TearDown()
	{
		driver.close();
		System.out.println("Test Completed");
	}
}


