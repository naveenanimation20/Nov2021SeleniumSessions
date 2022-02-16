package SauceTests;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceTestStream {
	
	@Test
	public void maxPriceStreamTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/inventory.html");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		driver.findElement(By.id("login-button")).click();

		List<WebElement> pirceList = driver.findElements(By.className("inventory_item_price"));
		
		double maxPrice = pirceList
								.stream()
									.mapToDouble(e -> Double.parseDouble(e.getText().trim().replace("$", "")))
										.max()
											.getAsDouble();
		System.out.println(maxPrice);
		String xpath_max = "//div[normalize-space()='$"+maxPrice+"']/following-sibling::button[text()='Add to cart']";
		driver.findElement(By.xpath(xpath_max)).click();
		
//		System.out.println("--------------");
//		double minPrice = pirceList
//				.stream()
//					.mapToDouble(e -> Double.parseDouble(e.getText().trim().replace("$", "")))
//						.min()
//							.getAsDouble();
//		System.out.println(minPrice);
//		String xpath_min = "//div[normalize-space()='$"+minPrice+"']/following-sibling::button[text()='Add to cart']";
//		driver.findElement(By.xpath(xpath_min)).click();

	}

}
