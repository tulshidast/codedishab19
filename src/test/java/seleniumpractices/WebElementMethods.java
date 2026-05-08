package seleniumpractices;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		WebElement textAreaField = driver.findElement(By.xpath("//textarea[@id='ta1']"));

		// sendKeys() method is used to enter the value in the text area field
		textAreaField.sendKeys("Hello World");

		Thread.sleep(2000);

		// clear() method is used to clear the value from the text area field
		textAreaField.clear();
		Thread.sleep(2000);

		textAreaField.sendKeys("Welcome to codedisha");

		// getAttribute() method is used to get the value of the attribute of the web
		// element
		String attributeValue = textAreaField.getAttribute("contenteditable");
		System.out.println("The value of the attribute is: " + attributeValue);

		// getLocation() method is used to get the location of the web element
		Point point = textAreaField.getLocation();
		System.out.println("The x coordinate of the text area field is: " + point.getX());
		System.out.println("The y coordinate of the text area field is: " + point.getY());

		// getRect() method is used to get the rectangle of the web element
		Rectangle raRectangle = textAreaField.getRect();
		System.out.println("The height of webelement: " + raRectangle.getHeight());
		System.out.println("The width of webelement: " + raRectangle.getWidth());

		// getScreenshotAs() method is used to take the screenshot of the web element
		File file = textAreaField.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("src/test/resources/screenshots/textAreaField.png"));

		// getSize() method is used to get the size of the web element
		Dimension dimension = textAreaField.getSize();
		System.out.println("The height of the text area field is: " + dimension.getHeight());
		System.out.println("The height of the text area field is: " + dimension.getWidth());

		// getTagName() method is used to get the tag name of the web element
		String tagName = textAreaField.getTagName();
		System.out.println("The tag name of the text area field is: " + tagName);

		// getCssValue() method is used to get the value of the CSS property of the web
		String backGroundColor = driver.findElement(By.xpath("//button[text()='Dropdown']"))
				.getCssValue("background-color");

		System.out.println("The background color of the dropdown button is: " + backGroundColor);

		Thread.sleep(3000);

		driver.quit();

	}

}
