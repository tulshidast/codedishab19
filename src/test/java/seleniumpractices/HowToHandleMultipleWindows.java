package seleniumpractices;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToHandleMultipleWindows {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		driver.findElement(By.cssSelector("a#selenium143")).click();

		String parentWindow = driver.getWindowHandle();

		Set<String> allOpenWindowsHandles = driver.getWindowHandles();

		for (String handle : allOpenWindowsHandles) {
			if (!(handle.equals(parentWindow))) {
				driver.switchTo().window(handle);
				break;
			}
		}

		driver.findElement(By.xpath("//a[text()='What is Selenium?']")).click();

		System.out.println(driver.getTitle());

		driver.close();

		driver.switchTo().window(parentWindow);

		WebElement textField = driver.findElement(By.cssSelector("#ta1"));
		textField.sendKeys("Welcome to codedisha");

		driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();

		parentWindow = driver.getWindowHandle();

		allOpenWindowsHandles = driver.getWindowHandles();

		for (String handle : allOpenWindowsHandles) {
			if (!(handle.equals(parentWindow))) {
				driver.switchTo().window(handle);
				break;
			}
		}

		String newWindowTitle = driver.findElement(By.xpath("//h3[text()='New Window']")).getText();
		System.out.println(newWindowTitle);

		driver.close();

		driver.switchTo().window(parentWindow);
		textField.clear();

		driver.quit();

	}

}
