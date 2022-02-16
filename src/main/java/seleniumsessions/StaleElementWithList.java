package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementWithList {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		//v1
		List<WebElement> footerList = 
					driver.findElements(By.xpath("(//ul[@class='list-unstyled'])[8]//a"));
		
		for(int i=0; i<footerList.size(); i++) {
			footerList.get(i).click();
			Thread.sleep(1000);
			driver.navigate().back();
			//v2 v3 v4
			//v2 v3 v4
			footerList = 
					driver.findElements(By.xpath("(//ul[@class='list-unstyled'])[8]//a"));
		}
	}

}
