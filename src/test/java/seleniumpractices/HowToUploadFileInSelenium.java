package seleniumpractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToUploadFileInSelenium {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		JavascriptExecutor javaScriptExecutor = (JavascriptExecutor) driver;

		WebElement element = driver.findElement(By.cssSelector("#uploadfile"));

		javaScriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);

		Thread.sleep(2000);

		element.sendKeys("C:\\Users\\Admin\\Desktop\\TestTest.java");

	}

}
