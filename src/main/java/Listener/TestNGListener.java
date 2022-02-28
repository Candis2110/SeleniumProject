package Listener;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;


import io.github.bonigarcia.wdm.WebDriverManager;


public class TestNGListener {
	
	@Test
	public void test1()
	{
		System.out.println("This is Test1");
	}
	@Test
	public void test2()
	{
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://google.com/");
		WebElement textbox = driver.findElement(By.name("q"));
		textbox.sendKeys("Automation");
	}
	@Test
	public void test3()
	{
		System.out.println("This is Test3");
		throw new SkipException("This is skipped");
	}
	@Test
	public void test4()
	{
		System.out.println("This is Test4");
		AssertJUnit.assertTrue(false);
	}
	
	
}
