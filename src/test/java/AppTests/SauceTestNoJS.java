package AppTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceTestNoJS {

	@Test
	public void priceClickTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/inventory.html");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		driver.findElement(By.id("login-button")).click();

		List<WebElement> items = driver.findElements(By.className("inventory_item_price"));
		double largest = 0;
		for (WebElement e : items) {
			double price = Double.parseDouble(e.getText().replace("$", ""));
			if (largest < price) {
				largest = price;
			}
		}
		driver.findElement(By.xpath("//div[normalize-space()='$" + largest + "']/following-sibling::button")).click();

	}

}
