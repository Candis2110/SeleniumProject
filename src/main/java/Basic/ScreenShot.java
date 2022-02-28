package Basic;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		Date d = new Date(0);
		String date1 = d.toString();
		System.out.println(date1);
		
		String date2 = date1.replace(":", "_");
		System.out.println(date2);
		
		driver.get("http://www.goole.com/");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		
		
		File destFile = new File(".\\screenshot\\"+date2+"google.png");
		FileUtils.copyFile(srcFile, destFile);
		
		driver.close();
	
	}
}
