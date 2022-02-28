package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RemoveValue {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//entering element
		driver.findElement(By.id("email")).sendKeys("ajit");
		Thread.sleep(2000);
		
		String value = driver.findElement(By.id("email")).getAttribute("value");
		System.out.println("Value present inside the text box is : " +value);
		
		driver.findElement(By.id("email")).sendKeys("againEnterajit");
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
		
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.id("email")).sendKeys(Keys.DELETE);
		
		Thread.sleep(2000);
		
	}
	

}
