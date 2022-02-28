package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintVersion {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String xpathForVersion = "//nobr[contains(text()'Facebook')]";
		
		String version = driver.findElement(By.xpath(xpathForVersion)).getText();
		System.out.println("Version of FaceBook on login page is :" +version);

	}

}
