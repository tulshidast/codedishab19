package seleniumpractices;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToHandleFramesInSelenium {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		List<WebElement> listOfWebElements = driver.findElements(By.xpath("//input[@name='q']"));

		System.out.println(listOfWebElements.size());

		listOfWebElements.get(0).sendKeys("Codedisha");

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='navbar-iframe']")));

		// driver.switchTo().frame("navbar-iframe");

		// driver.switchTo().frame(0);

		listOfWebElements.clear();

		listOfWebElements = driver.findElements(By.xpath("//input[@name='q']"));

		System.out.println(listOfWebElements.size());

		listOfWebElements.get(0).sendKeys("Codedisha");

		driver.switchTo().defaultContent();
		
		// driver.switchTo().parentFrame();

		driver.findElement(By.cssSelector("#ta1")).sendKeys("Welcome to Codedisha");

	}

}
