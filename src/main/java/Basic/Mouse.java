package Basic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();//Brower setup
		WebDriver driver = new ChromeDriver();//creating brower
		
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(5000);
		
		Robot r = new Robot();//creating obj for robot cls
		
		r.mouseMove(300, 500);
		
		/*r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F);
		
		r.keyRelease(KeyEvent.VK_F);
		r.keyRelease(KeyEvent.VK_ALT);
		
		Thread.sleep(3000);*/
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_N);
		
		r.keyRelease(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_CONTROL);
		//r.keyRelease(KeyEvent.VK_W);
		
		Thread.sleep(5000);
		
		//driver.close();
		driver.quit();
	}

}
