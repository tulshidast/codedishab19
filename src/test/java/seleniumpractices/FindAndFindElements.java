package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAndFindElements {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		// driver.findElement(By.name("abc")).sendKeys("Codedisha");

		List<WebElement> elements = driver.findElements(By.name("abc"));

		System.out.println("Size of list = " + elements.size());

	}

}
