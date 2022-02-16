package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PollingTimeConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/login");
		By emailId = By.id("input-email111");
		By password = By.id("input-password");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.pollingEvery(Duration.ofSeconds(2));
		
		WebDriverWait wait = new 
				WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofSeconds(2));
		//AJAX: 
		
		WebElement email_ele = wait.until(ExpectedConditions.visibilityOfElementLocated(emailId));
		email_ele.sendKeys("test@gmail.com");
		
		

	}

}
