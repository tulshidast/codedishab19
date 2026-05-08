package seleniumpractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDynamicWebElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		WebElement delayedText = driver.findElement(By.cssSelector("#delayedText"));
		
		System.out.println(delayedText.isDisplayed());
		
		Thread.sleep(10000);

		System.out.println(delayedText.isDisplayed());
		
	}

}
