package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.launchBrowser("chrome");
		br.enterUrl("https://demo.opencart.com/index.php?route=account/login");

		System.out.println(br.getPageTitle());

		By emaiId = By.id("input-email");
		By password = By.id("input-password");
		ElementUtil el = new ElementUtil(driver);
		el.doSendKeys(emaiId, "test@gmail.com");
		el.doSendKeys(password, "test123");

		br.closeBrowser();
	}

}
