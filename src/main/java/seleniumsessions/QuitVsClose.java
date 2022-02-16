package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuitVsClose {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();//launch chrome
		//123
		driver.get("https://www.google.com");//enter the url
		String title = driver.getTitle();//get the title of the page
		System.out.println("title is: " + title);
		
		if(title.equals("Google")) {
			System.out.println("correct title");
		}else {
			System.out.println("incorrect title");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		//1.
		//driver.quit();
		
		//2.
		driver.close();//NoSuchSessionException: invalid session id
		
		//System.out.println(driver.getTitle());
		//NoSuchSessionException: invalid session id
		
		driver = new ChromeDriver();//456
		
		System.out.println(driver.getTitle()); 

	}

}
