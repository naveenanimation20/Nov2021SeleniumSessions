package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessConcept {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions co = new ChromeOptions();
		//co.addArguments("--headless");
		co.addArguments("--incognito");
		//co.setHeadless(true);
		
		//execution fast
		//its blocking the browser launch
		
		
		WebDriver driver = new ChromeDriver(co);// launch chrome
		driver.get("https://www.google.com");// enter the url
		String title = driver.getTitle();// get the title of the page
		System.out.println("title is: " + title);

		// verification point/checkpoint/act vs exp result:
		if (title.equals("Google")) {
			System.out.println("correct title");
		} else {
			System.out.println("incorrect title");
		}
		// =Autmation Testing

		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());

		if (driver.getPageSource().contains("Copyright The Closure Library Authors")) {
			System.out.println("is present...");
		}

		driver.quit();// close the browser

	}

}
