package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	
	static WebElement element = null;
	
	public static WebElement textbox_search(WebDriver driver) 
	{
		element = driver.findElement(By.name("q"));
		return element;
	}
	

	public static WebElement button_search(WebDriver driver) 
	{
		element = driver.findElement(By.name("btnK"));
		return element;
	}

	public static WebElement language(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(),'മലയാളം')]"));
		return element;
	}
}
