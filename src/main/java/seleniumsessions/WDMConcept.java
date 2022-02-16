package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WDMConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();//chromer --96.0---download 96.0exe
		//WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.chromedriver().browserVersion("87.0").setup();
		
		WebDriver driver = new ChromeDriver();//launch chrome
		
		driver.get("http://www.google.com");//enter the url
		String title = driver.getTitle();//get the title of the page
		System.out.println("title is: " + title);

		driver.quit();
		
		
		
	}

}
