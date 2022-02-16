package Workshop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LazyLoading {

	static WebDriver driver;
	static int sleepTime = 1000;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.swiggy.com/restaurants");
		driver.findElement(By.id("location")).sendKeys("Nice Road");
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"//span[text()='NICE Ring Road, Dodda Basti, Sir M Vishweshwaraiah Layout 4th Block, SMV Layout, Bengaluru, Karnataka, India']"))
				.click();
		Thread.sleep(8000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String last_height = js.executeScript("return document.body.scrollHeight").toString();
		List<WebElement> resulistList = null;
		while (true) {
			// 20
			resulistList = driver.findElements(By.xpath("//div[@class='nA6kb']//ancestor::a"));
			resulistList.stream().forEach(e -> System.out.println(e.getText()));
			scrollPageDown();
			Thread.sleep(1500);

			String new_height = js.executeScript("return document.body.scrollHeight").toString();
//			if (new_height.equals(last_height)) {
//				break;
//			}
//			last_height = new_height;

		}

	}

	public static void scrollPageDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

}
