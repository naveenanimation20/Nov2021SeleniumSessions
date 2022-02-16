package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterLinks {

	public static void main(String[] args) {

		//div[contains(@class,'navFooterCopyright')]//a
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");
		
		List<WebElement> footerList = driver.findElements(By.xpath("//div[contains(@class,'navFooterCopyright')]//a"));
		
		for(WebElement e : footerList) {
			System.out.println(e.getText());
		}
		
		
	}

}
