package seleniumpractices;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		// to open the url in the browser
		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		// to get the current URL open in the page
		String url = driver.getCurrentUrl();

		System.out.println("Current url = " + url);

		// to get the title of the page
		String title = driver.getTitle();
		System.out.println("Title of the page = " + title);

		// to get the page source code
		String pageSource = driver.getPageSource();

		// System.out.println("Page source code = " + pageSource);

		String currentlyFocusedWindowHandle = driver.getWindowHandle();
		System.out.println("Currently focused window handle = " + currentlyFocusedWindowHandle);

		driver.switchTo().newWindow(org.openqa.selenium.WindowType.TAB).get("https://www.google.com/");

		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("All window handles = " + windowHandles);

		driver.close();

		driver.switchTo().window(currentlyFocusedWindowHandle);

		driver.navigate().to("https://www.amazon.in/");

		Thread.sleep(2000);

		driver.navigate().back();

		Thread.sleep(2000);

		driver.navigate().forward();

		Thread.sleep(2000);

		driver.navigate().refresh();
		
		driver.quit();

	}

}
