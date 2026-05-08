package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		System.out.println("Byke radio button is selected = "
				+ driver.findElement(By.cssSelector("input[value='Bike']")).isSelected());

		System.out.println("Bicycle radio button is selected = "
				+ driver.findElement(By.cssSelector("input[value='Bicycle']")).isSelected());

		System.out.println(
				"Pen checkbox is selected = " + driver.findElement(By.cssSelector("input[value='Pen']")).isSelected());

		System.out.println("Book checkbox is selected = "
				+ driver.findElement(By.cssSelector("input[value='Book']")).isSelected());

		driver.findElement(By.cssSelector("input[value='Bike']")).click();

		System.out.println("Byke radio button is selected = "
				+ driver.findElement(By.cssSelector("input[value='Bike']")).isSelected());

		driver.findElement(By.cssSelector("input[value='Pen']")).click();

		System.out.println(
				"Pen checkbox is selected = " + driver.findElement(By.cssSelector("input[value='Pen']")).isSelected());

		System.out.println(
				"Delayed test is displayed = " + driver.findElement(By.cssSelector("#delayedText")).isDisplayed());

		Thread.sleep(10000);

		System.out.println(
				"Delayed test is displayed = " + driver.findElement(By.cssSelector("#delayedText")).isDisplayed());

		System.out.println("Button1 is enabled = " + driver.findElement(By.cssSelector("#but1")).isEnabled());

		System.out.println("Button2 is enabled = " + driver.findElement(By.cssSelector("#but2")).isEnabled());

		driver.quit();

	}

}
