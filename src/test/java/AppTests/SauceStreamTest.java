package AppTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceStreamTest {

	@Test
	public void maxPriceStreamTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/inventory.html");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		driver.findElement(By.id("login-button")).click();

		List<WebElement> items = driver.findElements(By.className("inventory_item_price"));

		double max = items.stream().mapToDouble(e -> Double.parseDouble(e.getText().replace("$", ""))).max().getAsDouble();

		System.out.println(max);

		driver.findElement(By.xpath("//div[normalize-space()='$" + max + "']/following-sibling::button")).click();

	}

}
