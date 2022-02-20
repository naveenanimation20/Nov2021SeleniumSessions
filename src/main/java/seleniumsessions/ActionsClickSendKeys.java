package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClickSendKeys {

	static WebDriver driver;
	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		By fn = By.id("input-firstname");
		By ln = By.id("input-lastname");
		By login = By.xpath("//input[@value='Continue']");
		
//		Actions act = new Actions(driver);
//		
//		act.sendKeys(driver.findElement(fn), "naveen").perform();;
//		act.sendKeys(driver.findElement(ln), "automation").perform();
//		act.click(driver.findElement(login)).perform();
		doSendKeys(fn, "naveen");
		doSendKeys(ln, "automation");
		doClick(login);

	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
	}
	
	/**
	 * Clicks in the middle of the given element. 
	 * Equivalent to: Actions.moveToElement(onElement).click()
	 * @param locator
	 */
	public static void doClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}
	
	
	
	
	
	

}
