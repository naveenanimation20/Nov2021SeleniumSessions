package SauceTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceTestJS {

	@Test
	public void maxPriceStreamTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/inventory.html");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		driver.findElement(By.id("login-button")).click();
		
		//javascript -- inject JS code inside the browser using JSExecutor
		
		String script = "var max = 0;\n"
				+ "document.getElementsByClassName('inventory_item_price')\n"
				+ "        .forEach(e => {newVal = parseFloat(e.innerText.split('$')[1]);\n"
				+ "if(max < newVal){\n"
				+ "    max = newVal;\n"
				+ "}\n"
				+ "                    });\n"
				+ "console.log(max);\n"
				+ "var xpathVal = \"//div[normalize-space()='$\"+max+\"']/following-sibling::button[text()='Add to cart']\";\n"
				+ "var ele = document.evaluate( xpathVal, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null ).singleNodeValue;\n"
				+ "ele.click();";
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript(script);
		
	}

}
