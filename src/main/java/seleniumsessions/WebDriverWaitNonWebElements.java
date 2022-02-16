package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitNonWebElements {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		String title = doGetPageTitle("Amazon", 5);
		System.out.println(title);
	}
	
	public static boolean waitForPageTitle(String titleVal, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.titleContains(titleVal));
	}
	
	public static String doGetPageTitle(String titleVal, int timeOut) {
		if(waitForPageTitle(titleVal, timeOut)) {
			return driver.getTitle();
		}
		return null;
	}

}
