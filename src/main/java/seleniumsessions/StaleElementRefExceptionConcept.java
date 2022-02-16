package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementRefExceptionConcept {

	public static void main(String[] args) {

		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//DOM --v1
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		//DOM --v1
		WebElement fn = driver.findElement(By.id("Form_submitForm_Name"));
		//DOM --v1
		fn.sendKeys("naveen");
		
		driver.navigate().refresh();
		//back//forward
		
		//DOM --v2
		//fn = driver.findElement(By.id("Form_submitForm_Name"));
		//DOM --v1
		
		FluentWait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10))
						.pollingEvery(Duration.ofSeconds(1))
						.ignoring(StaleElementReferenceException.class);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Form_submitForm_Name")))
				.sendKeys("Harshini");
								
		//fn.sendKeys("Harshini");//StaleElementReferenceException: stale element reference:
		//element is not attached to the page document

		
	}

}
