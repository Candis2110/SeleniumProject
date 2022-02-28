package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchObject {
	
	WebDriver driver = null;
	By textbox_search = By.name("q");
	By button_search = By.name("btnK");
	
	public GoogleSearchObject(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void setTextInSearchbox(String text)
	{
		driver.findElement(textbox_search).sendKeys(text);
	}
	
	public void clickSearch()
	{
		driver.findElement(textbox_search).sendKeys(Keys.RETURN);
	}
}
