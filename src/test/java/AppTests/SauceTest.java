package AppTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceTest {

	@Test
	public void priceClickTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/inventory.html");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		driver.findElement(By.id("login-button")).click();
				
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		
//		String script = "largest = 0;"
//				+ "document.getElementsByClassName('inventory_item_price')"
//				+ ".forEach(function(value){\n"
//				+ "    newVal = parseFloat(value.innerText.split('$')[1])\n"
//				+ "    if (largest < newVal) "
//				+ "           largest = newVal;\n"
//				+ "}); return largest;";
//		
//		//document.getElementsByClassName('inventory_item_price').forEach((value)=> {newVal = parseFloat(value.innerText.split('$')[1]); if(largest<newVal) largest = newVal;})
//		
//		String mx = js.executeScript(script).toString();	
//		System.out.println(mx);
//		driver.findElement(By.xpath("//div[normalize-space()='$"+mx+"']/following-sibling::button")).click();
		
		
		String sc = "largest = 0;\n"
				+ "		document.getElementsByClassName('inventory_item_price')\n"
				+ "		.forEach((value)=> {newVal = parseFloat(value.innerText.split('$')[1]); \n"
				+ "		if(largest<newVal) largest = newVal;\n"
				+ "		});\n"
				+ "		console.log(largest)\n"
				+ "		var xp = \"//div[normalize-space()='$\"+largest+\"']/following-sibling::button\";\n"
				+ "		var ele = document.evaluate(xp, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;\n"
				+ "		ele.click()";
		
		js.executeScript(sc);
		
		
		
	}

}
