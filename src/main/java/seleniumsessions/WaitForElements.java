package seleniumsessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForElements {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.freshworks.com/");

		By footers = By.cssSelector("ul.footer-nav > li > a");
		List<WebElement> footerList = waitForElementsVisible(footers, 10);
		for (WebElement e : footerList) {
			System.out.println(e.getText());
		}
	}

	/**
	 * An expectation for checking that all elements present on the web page 
	 * that match the locator are visible. 
	 * Visibility means that the elements are not only displayed but also 
	 * have a height and width that is greater than 0.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public static List<WebElement> waitForElementsVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	public static List<WebElement> waitForElementsPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}
	
	

}
