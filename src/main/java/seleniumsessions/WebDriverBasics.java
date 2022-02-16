package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		//win:
		//System.setProperty("webdriver.chrome.driver", "c:\\uses\\bhumika\\drivers\\chromedriver.exe");
		
		//mac:
		System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver");
		//automation steps:
		//top casting:
		WebDriver driver = new ChromeDriver();//launch chrome
		
		driver.get("www.google.com");//enter the url
		String title = driver.getTitle();//get the title of the page
		System.out.println("title is: " + title);
		
		//+
		
		//verification point/checkpoint/act vs exp result:
		if(title.equals("Google")) {
			System.out.println("correct title");
		}else {
			System.out.println("incorrect title");
		}
		//=Autmation Testing
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		if(driver.getPageSource().contains("Copyright The Closure Library Authors")) {
			System.out.println("is present...");
		}
		
		driver.quit();//close the browser
		
		
	}

}
