package seleniumpractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitInSelenium {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		driver.findElement(By.cssSelector("#ta1")).sendKeys("Welcome to codedisha");

		WebElement delayedText = driver.findElement(By.cssSelector("#delayedText"));

		System.out.println(delayedText.isDisplayed());

		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOf(delayedText));

		System.out.println(delayedText.isDisplayed());

		WebElement btn = driver.findElement(By.xpath("//button[text()='Check this']"));

		btn.click();

		WebElement mrCheckbox = driver.findElement(By.cssSelector("#dte"));

		wait.until(ExpectedConditions.elementToBeClickable(mrCheckbox));

		System.out.println("MR checkbox is enabled = " + mrCheckbox.isEnabled());

	}

}
