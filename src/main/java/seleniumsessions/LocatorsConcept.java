package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");

		// create a web element
		// WE = By locator
		// Create web element + action (Click, sendKeys, isDisplayed....)

		//1st: ID
		
		// 1.
//		driver.findElement(By.id("input-email")).sendKeys("nav@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");
//		driver.findElement(By.id("input-email")).sendKeys("tom@gmail.com");

		// 2.
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		
//		emailId.sendKeys("nav@gmail.com");
//		password.sendKeys("test@123");
//		
//		emailId.sendKeys("tom@gmail.com");

		// 3. by locator:
//		By emaiId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		WebElement emailID = driver.findElement(emaiId);
//		WebElement pwd = driver.findElement(password);
//
//		emailID.sendKeys("nave@gmail.com");
//		pwd.sendKeys("nave@123");

		// 4. by locator with generic method
//		By emaiId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		getElement(emaiId).sendKeys("nav@gmail.com");
//		getElement(password).sendKeys("nav@123");

		// 5. by locator with getElement and actions generic method:
//		By emaiId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		doSendKeys(emaiId, "nave@gmail.com");
//		doSendKeys(password, "nav@123");

		// 6.by locator with getElement and actions generic method in util class
//		By emaiId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(emaiId, "nave@gmail.com");
//		eleUtil.doSendKeys(password, "test@123");

		// 7. String locator with By, getElement and actions generic method in util
		// class
		String eId = "input-email";
		String pwd = "input-password";

//		doSendKeys("id", eId, "nav@gmail.com");
//		doSendKeys("id", pwd, "test@123");
		
		//8.
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys("id", eId, "nave@gmail.com");
		eleUtil.doSendKeys("id", pwd, "nave@123");

	}

	public static By getBy(String locatorType, String locatorValue) {
		By locator = null;

		switch (locatorType.toLowerCase()) {
		case "id":
			locator = By.id(locatorValue);
			break;

		default:
			break;
		}
		return locator;
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static void doSendKeys(String locatorType, String locatorValue, String value) {
		getElement(getBy(locatorType, locatorValue)).sendKeys(value);
	}

}
