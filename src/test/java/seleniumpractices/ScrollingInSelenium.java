package seleniumpractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingInSelenium {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		Thread.sleep(4000);

		JavascriptExecutor javaScriptExecutor = (JavascriptExecutor) driver;

		javaScriptExecutor.executeScript("window.scrollBy(0,500)");

		Thread.sleep(2000);

		javaScriptExecutor.executeScript("window.scrollBy(0,-300)");

		Thread.sleep(2000);

		javaScriptExecutor.executeScript("window.scrollBy(200,0)");

		Thread.sleep(2000);

		javaScriptExecutor.executeScript("window.scrollBy(-100,0)");

		Thread.sleep(2000);

		WebElement element = driver.findElement(By.cssSelector("button.dropbtn"));

		javaScriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);

		Thread.sleep(2000);

		javaScriptExecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");

		Thread.sleep(2000);

		javaScriptExecutor.executeScript("window.scrollTo(document.body.scrollWidth,0)");

		Thread.sleep(2000);

		javaScriptExecutor.executeScript("window.scrollTo(document.body.scrollWidth,document.body.scrollHeight)");

		// driver.findElement(By.cssSelector("button.dropbtn")).click();

		Thread.sleep(4000);

		// driver.findElement(By.xpath("//a[text()='Flipkart']")).click();
		
		driver.quit();

	}

}
