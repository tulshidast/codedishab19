package seleniumpractices;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabularData {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		List<WebElement> tableHeaders = driver.findElements(By.cssSelector("table#table1 thead tr th"));

		for (WebElement header : tableHeaders) {
			System.out.println(header.getText());
		}

		System.out.println("==============================================");

		WebElement header = driver.findElement(By.cssSelector("table#table1 thead tr th:nth-child(3)"));
		System.out.println(header.getText());

		System.out.println("==============================================");

		List<WebElement> tableData = driver.findElements(By.cssSelector("table#table1 tbody tr:nth-child(3) td"));
		for (WebElement data : tableData) {
			System.out.println(data.getText());
		}

		System.out.println("==============================================");

		WebElement data = driver.findElement(By.cssSelector("table#table1 tbody tr:nth-of-type(4) td:nth-child(2)"));

		System.out.println(data.getText());

		System.out.println("==============================================");

		List<WebElement> columnData = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[3]"));

		for (WebElement column : columnData) {
			System.out.println(column.getText());
		}

		System.out.println("==============================================");

		List<WebElement> rowData = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td"));

		for (WebElement row : rowData) {
			System.out.println(row.getText());
		}

	}

}
