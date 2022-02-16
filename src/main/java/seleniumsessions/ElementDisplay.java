package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.Location;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementDisplay {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		By emaiId = By.id("input-email");
		
		if (doIsDisplayed(emaiId)) {
			doSendKeys(emaiId, "test@gmail.com");
		}
		
		driver.findElement(emaiId).isEnabled();
		//visible--but disabled---false
		
		
	}
	
	
	public static boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}


}
