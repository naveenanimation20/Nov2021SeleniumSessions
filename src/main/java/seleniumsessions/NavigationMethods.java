package seleniumsessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethods {

	public static void main(String[] args) throws MalformedURLException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();// launch chrome
		driver.get("https://www.google.com");// enter the url
		System.out.println(driver.getTitle());

		//driver.navigate().to("https://www.amazon.com");
		driver.navigate().to(new URL("https://www.amazon.com"));
		//driver.get("https://www.amazon.com");

		System.out.println(driver.getTitle());

		driver.navigate().back();
		System.out.println(driver.getTitle());

		driver.navigate().forward();
		System.out.println(driver.getTitle());

		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();//refresh the page

	}

}
