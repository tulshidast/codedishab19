package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestScript {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver.get("https://www.google.com");

		WebElement userNameTextField = driver.findElement(By.name("userid"));
		
		userNameTextField.sendKeys("Codedisha");

	}

}
