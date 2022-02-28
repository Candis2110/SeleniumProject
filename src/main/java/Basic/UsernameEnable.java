package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsernameEnable {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://google.com/");
		
		WebElement UN = driver.findElement(By.id("username"));
		
		if(UN.isEnabled())
		{
			System.out.println("User text box is enabled");
		}
		else
		{
			System.out.println("User text box is disabled");
		}

	}

}
