package seleniumpractices;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToHandleAlert {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		// it will throw unhandled alert exception if we try to perform any action
		// without handling alert
		// driver.switchTo().alert();

		driver.findElement(By.cssSelector("#prompt")).click();

		Alert alt = driver.switchTo().alert();

		String alertMsg = alt.getText();

		System.out.println(alertMsg);

		alt.sendKeys("Codedisha");

		// This method will use to perform positive action as like ok,yes and allow
		alt.accept();

		// This method will use to perform negative action as like cancel,no and deny
		// alt.dismiss();

	}

}
