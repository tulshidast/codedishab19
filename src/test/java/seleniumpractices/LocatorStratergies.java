package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStratergies {

	public static void main(String[] args) {

		// initialize the driver

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		WebElement userNameTextField = driver.findElement(By.name("userid"));

		userNameTextField.sendKeys("Codedisha");

		WebElement headerOfPage = driver.findElement(By.className("title"));

		System.out.println("Header of the page " + headerOfPage.getText());

		WebElement textAreaField = driver.findElement(By.id("ta1"));

		textAreaField.sendKeys("Welcome to codedisha");

		WebElement selenium143Link = driver.findElement(By.linkText("http://www.Selenium143.blogspot.com"));
		selenium143Link.click();

		WebElement selenium143Link_2 = driver.findElement(By.partialLinkText("143.blogspot.com"));
		selenium143Link_2.click();

		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (WebElement link : links) {

			System.out.println(link.getAttribute("href"));

		}

	}

}
