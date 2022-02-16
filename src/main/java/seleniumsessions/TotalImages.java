package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {

	static WebDriver driver;

	public static void main(String[] args) {

		// WAP:
		// 1. total images
		// 2. print the src
		// 3. print the alt

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		List<WebElement> imagesList = driver.findElements(By.tagName("img"));
		System.out.println("total images:" + imagesList.size());
		
		for(WebElement e : imagesList) {
			String altVal = e.getAttribute("alt");
			String srcVal = e.getAttribute("src");

			System.out.println(altVal + ":" + srcVal);
		}
		
		
	}

}
