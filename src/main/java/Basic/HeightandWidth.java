package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeightandWidth {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement unTB = driver.findElement(By.id("username")); //find username field
		int username_height = unTB.getSize().getHeight(); //heigth of username field
		int username_width = unTB.getSize().getWidth(); //width of username field
		System.out.println(username_height);
		System.out.println(username_width);
		
		WebElement pwdTB = driver.findElement(By.name("pwd")); //find password field
		int password_height = pwdTB.getSize().getHeight(); //heigth of password field
		int password_width = pwdTB.getSize().getWidth(); //width of password field
		System.out.println(password_height);
		System.out.println(password_width);
		
		if(username_height==password_height && username_width==password_width)
		{
			System.out.println("Username and Password field are aligned");
		}
		else
		{
			System.out.println("not aligned");
		}
	}
}
