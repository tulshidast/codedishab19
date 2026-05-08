package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdwonNotCommingUnderSelectTag2 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();
		selectOptionFromDropdown("Facebook");

	}

	public static void selectOptionFromDropdown(String optionToSelect) throws InterruptedException {

		driver.findElement(By.cssSelector("button.dropbtn")).click();

		Thread.sleep(7000);

		List<WebElement> dropdownOptions = driver.findElements(By.cssSelector("div#myDropdown a"));

		for (WebElement option : dropdownOptions) {

			if (option.getText().equals(optionToSelect)) {
				option.click();
				break;
			}
		}

	}

}
