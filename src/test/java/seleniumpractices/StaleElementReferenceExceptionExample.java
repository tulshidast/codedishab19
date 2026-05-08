package seleniumpractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class StaleElementReferenceExceptionExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		Actions actions = new Actions(driver);

		actions.moveToElement(driver.findElement(By.cssSelector("#blogsmenu"))).build().perform();

		WebElement seleniumByArunLink = driver.findElement(By.xpath("//span[text()='SeleniumByArun']/.."));

		actions.moveToElement(driver.findElement(By.xpath("//span[text()='Home']/.."))).build().perform();

		seleniumByArunLink.click();

	}

}
