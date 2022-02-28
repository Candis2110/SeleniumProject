package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyFB_UNandPWDAligned {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.facebook.com/");
		
		WebElement unTB = driver.findElement(By.id("email"));
		
		int username_Ycordinate = unTB.getLocation().getY();
		System.out.println(username_Ycordinate);
		
		WebElement pwdTB = driver.findElement(By.name("password"));
		
		int password_Ycordinate = pwdTB.getLocation().getY();
		System.out.println(password_Ycordinate);
		
		if(username_Ycordinate == password_Ycordinate)
		{
			System.out.println("Both fields are aligned");
		}
		else
		{
			System.out.println("Both fields are not alignd");
		}
	}

}
