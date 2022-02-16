package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExConcept {

	public static void main(String[] args) throws InterruptedException {

//		WebDriverManager.chromedriver().setup();
//		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.amazon.com/");
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		String title = js.executeScript("return document.title;").toString();
//		System.out.println(title);
		
		//JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
//		String title = jsUtil.getTitleByJS();
//		System.out.println(title);
//		
//		String pageText = jsUtil.getPageInnerText();
//		if(pageText.contains("Alex Bookless")) {
//			System.out.println("pass");
//		}
		
		//jsUtil.generateAlert("hi this is selenium alert");
		
		//jsUtil.refreshBrowserByJS();
		//WebElement ele = driver.findElement(By.xpath("//h1[text()='Delight made easy']"));
		//WebElement ele = driver.findElement(By.cssSelector("div#content form"));
//		jsUtil.drawBorder(ele);
		
//		WebElement ele = driver.findElement(By.id("input-email"));
//		WebElement eleP = driver.findElement(By.id("input-password"));

//		jsUtil.flash(ele);
//		ele.sendKeys("test@gmail.com");
//		jsUtil.flash(eleP);
//		eleP.sendKeys("test@123");

//		jsUtil.scrollPageDown();
//		Thread.sleep(5000);
//		jsUtil.scrollPageUp();
//		jsUtil.scrollPageDown("700");
		
//		WebElement ele = driver.findElement(By.xpath("//span[text()='Popular products in Wireless internationally']"));
//		jsUtil.scrollIntoView(ele);
//		jsUtil.flash(ele);
//		jsUtil.drawBorder(ele);
		
//		WebElement custLink = driver.findElement(By.linkText("Customer Service"));
//		jsUtil.clickElementByJS(custLink);
		//ElementNotInterceptedException
		//ele --> DOM --> not present on --Page
		
		
		
	}

}
