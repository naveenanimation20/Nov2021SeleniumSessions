package seleniumsessions;

public class AmazonTest {

	public static void main(String[] args) {

		String browser = "chrome";
		BrowserUtil br = new BrowserUtil();
		br.launchBrowser(browser);
		br.enterUrl("https://www.amazon.com");
		String pageTile = br.getPageTitle();
		
		if(pageTile.contains("Amazon")) {
			System.out.println("title is correct");
		}
		
		if(br.getPageUrl().contains("amazon")) {
			System.out.println("url is correct");

		}
		
		br.quitBrowser();
		
	}

}
