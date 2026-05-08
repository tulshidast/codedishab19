package seleniumpractices;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AdvancedActionsInSelenium {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Actions actions = new Actions(driver);

		actions.keyDown(Keys.SHIFT).keyDown("a").keyUp(Keys.SHIFT).keyUp("a").build().perform();

		actions.keyDown(Keys.NUMPAD4).build().perform();

		actions.keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).build().perform();

	}

}
