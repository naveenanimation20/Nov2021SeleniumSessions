package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariLaunch {

	public static void main(String[] args) {

		
		WebDriver driver = new SafariDriver();
		driver.get("https://www.google.com");//enter the url
		String title = driver.getTitle();//get the title of the page
		System.out.println("title is: " + title);
		
		driver.quit();
		
		
		
	}

}
