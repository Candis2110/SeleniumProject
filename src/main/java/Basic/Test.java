package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www..com/");
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("The current URL is : " + driver.getCurrentUrl());
		System.out.println("The Title is : " + driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println("The current URL is : " + driver.getCurrentUrl());
		System.out.println("The Title is : " + driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.close();
	}

}
