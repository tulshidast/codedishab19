package seleniumpractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AdvancedActionsInSelenium2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Actions actions = new Actions(driver);
		WebElement pageOneLink = driver.findElement(By.xpath("//a[text()='Page One']"));
		actions.contextClick(pageOneLink).build().perform();

		actions.click(driver.findElement(By.cssSelector("#ta1"))).build().perform();

		Thread.sleep(2000);

		actions.doubleClick(
				driver.findElement(By.xpath("//textarea[normalize-space()='The cat was playing in the garden.']")))
				.build().perform();

		driver.navigate().refresh();

		actions.scrollToElement(driver.findElement(By.xpath("//button[text()='Dropdown']"))).build().perform();

		WebElement menu = driver.findElement(By.cssSelector("#blogsmenu"));

		actions.scrollToElement(menu).build().perform();

		actions.moveToElement(menu).build().perform();

		actions.click(
				driver.findElement(By.xpath("//textarea[normalize-space()='The cat was playing in the garden.']")))
				.click().keyDown(Keys.CONTROL).keyDown("A").pause(Duration.ofSeconds(1)).keyUp("A").keyUp(Keys.CONTROL)
				.dragAndDrop(
						driver.findElement(
								By.xpath("//textarea[normalize-space()='The cat was playing in the garden.']")),
						driver.findElement(By.cssSelector("#ta1")))
				.pause(Duration.ofSeconds(1)).build().perform();

	}

}
