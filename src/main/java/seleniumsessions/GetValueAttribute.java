package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetValueAttribute {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		By emaiId = By.id("input-email");
		doSendKeys(emaiId, "naveen@gmail.com");
		
		String att = driver.findElement(emaiId).getAttribute("value");
		System.out.println(att);
		
		String para = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/p[2]")).getText();
		System.out.println(para);
//		String text = doGetText(emaiId);
//		System.out.println(text);
		
		System.out.println(doGetAttribute(emaiId, "value"));
		
	}
	
	public static String doGetAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}
	
	public static String doGetText(By locator) {
		return getElement(locator).getText();
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
