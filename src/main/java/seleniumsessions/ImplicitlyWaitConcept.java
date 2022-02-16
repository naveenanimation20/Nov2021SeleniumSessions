package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) {

		//Implicitly Wait
		//dynamic wait
		//its only applicable for web elements: FE, FEs
		//not applicable for non web elements: title, url, alert
		//global wait: once its applied, it will be applicable for all the
		//upcoming web elements
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//login page: 10 secs
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		//10 secs
		WebElement emailId = driver.findElement(By.id("input-email11"));
		emailId.sendKeys("test@gmail.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//5 secs
		WebElement pwd = driver.findElement(By.id("test"));
		pwd.sendKeys("test123");
		
		//e3 -- 5
		//e4 -- 5
		
		//home page: 20 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//HE1 -- 20 secs
		//HE2
		//HE3
		//click on logout--landing on login page:
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click on reg page: 0 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		//RE1
		//RE2
		
		
		
	}

}
