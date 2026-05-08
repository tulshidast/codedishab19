package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdwonNotCommingUnderSelectTag {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://www.tutorialspoint.com/selenium/practice/select-menu.php");

		driver.manage().window().maximize();
		// selectOptionFromDropdown("Home, Garden &amp; Tools");
		String optionToSelect[] = { "Home, Garden &amp; Tools", "Books" };
		selectOptionFromDropdown(optionToSelect);

	}

	public static void selectOptionFromDropdown(String optionToSelect) throws InterruptedException {

		driver.findElement(By.xpath("//span[text()='Please select...']")).click();

		Thread.sleep(2000);

		List<WebElement> dropdownOptions = driver.findElements(By
				.xpath("//div[contains(@class,'mbsc-scroller-wheel-item') and @role='option' and not(@aria-hidden)]"));

		for (WebElement option : dropdownOptions) {
			String arr = option.getAttribute("innerHTML");
			String array[] = arr.split(">");
			String optionText = array[array.length - 1].trim();

			if (optionText.equals(optionToSelect)) {
				option.click();
				break;
			}
		}
	}

	public static void selectOptionFromDropdown(String optionToSelect[]) throws InterruptedException {

		driver.findElement(By.xpath("//span[text()='Please select...']")).click();

		Thread.sleep(2000);

		List<WebElement> dropdownOptions = driver.findElements(By
				.xpath("//div[contains(@class,'mbsc-scroller-wheel-item') and @role='option' and not(@aria-hidden)]"));

		for (WebElement option : dropdownOptions) {
			String arr = option.getAttribute("innerHTML");
			String array[] = arr.split(">");
			String optionText = array[array.length - 1].trim();

			for (String optionToSelectFromChoice : optionToSelect) {
				if (optionText.equals(optionToSelectFromChoice)) {
					option.click();
				}
			}

		}
	}

}
