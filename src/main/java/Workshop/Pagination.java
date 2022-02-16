package Workshop;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pagination {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		int pageCount = 1;
		while (true) {
			if (driver.findElements(By.xpath("//td[text()='Warsaw11']")).size() > 0) {
				selectCity1("Warsaw11");
				System.out.println("page Count " + pageCount);
				break;
			} else {
				WebElement next = driver.findElement(By.linkText("Next"));
				if (next.getAttribute("class").contains("disabled")) {
					System.out.println("pagination is over...record is not found....");
					break;
				}
				next.click();
				Thread.sleep(500);
				pageCount++;
			}
		}

	}

	public static void selectCity(String cityName) {
		driver.findElement(
				By.xpath("//td[text()='" + cityName + "']//preceding-sibling::td/child::input[@type='checkbox']"))
				.click();

	}
	public static void selectCity1(String cityName) {
		WebElement ele = driver.findElement(By.xpath("//td[text()='"+cityName+"']"));
		driver.findElement(with(By.xpath("//input[@type='checkbox']")).toLeftOf(ele)).click();
	}
	

}
