package mytests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {

	// Global Pre conditions
	// pre condition
	// test steps + assertions (act vs exp result)
	// post steps
	
	/**
	 * BS -- create user
	   BT -- connect With DB
	   BC -- launchBrowser
	   
				BM -- login to app
				homePageTest
				AM -- logout

				BM -- login to app
				priceTest
				AM -- logout

				BM -- login to app
				searchTest
				AM -- logout

		AC -- closeBrowser
		AT -- disconnectWithDB
		AS -- deleteUser
	 */

	@BeforeSuite
	public void createUser() {
		System.out.println("BS -- create user");
	}

	@BeforeTest
	public void connectWithDB() {
		System.out.println("BT -- connect With DB");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC -- launchBrowser");
	}

	@BeforeMethod
	public void login() {
		System.out.println("BM -- login to app");
	}

	@Test
	public void homePageTest() {
		System.out.println("homePageTest");
	}

	@Test
	public void searchTest() {
		System.out.println("searchTest");
	}

	@Test
	public void priceTest() {
		System.out.println("priceTest");
	}

	@AfterMethod
	public void logout() {
		System.out.println("AM -- logout");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("AC -- closeBrowser");
	}

	@AfterTest
	public void disconnectWithDB() {
		System.out.println("AT -- disconnectWithDB");
	}

	@AfterSuite
	public void deleteUser() {
		System.out.println("AS -- deleteUser");
	}

}
