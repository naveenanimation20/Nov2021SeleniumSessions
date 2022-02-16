package mytests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrmTest {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	}

	@Test(priority = 1)
	public void logoTest() {
		Assert.assertTrue(driver.findElement(By.className("nav-logo")).isDisplayed());
	}

	@Test(priority = 2)
	public void contactSalesLinkTest() {
		Assert.assertTrue(driver.findElement(By.linkText("CONTACT SALES")).isDisplayed());
	}

	@Test(priority = 4)
	public void pageTitleTest() {
		String title = driver.getTitle();
		System.out.println("page title : " + title);
		Assert.assertEquals(title, "Sign Up for a Free HR Software Trial | OrangeHRM");
	}

	@Test(priority = 3)
	public void headerTest() {
		String header = driver.findElement(By.cssSelector("div.try-it-text h1")).getText();
		Assert.assertTrue(header.contains("free trial"));
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
