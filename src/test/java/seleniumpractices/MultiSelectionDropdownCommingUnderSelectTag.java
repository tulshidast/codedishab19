package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectionDropdownCommingUnderSelectTag {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		WebElement dropdown = driver.findElement(By.xpath("//select[@id='multiselect1']"));

		Select select = new Select(dropdown);

		select.selectByIndex(3);

		Thread.sleep(2000);

		select.selectByValue("Hyundaix");

		Thread.sleep(2000);

		select.selectByVisibleText("Swift");

		Thread.sleep(2000);

		select.selectByContainsVisibleText("lvo");

		boolean isMutiple = select.isMultiple();
		System.out.println("Is multiple selection allowed: " + isMutiple);

		System.out.println("--------------------------------------------------");

		WebElement firsSelectedOption = select.getFirstSelectedOption();

		System.out.println("First selected option: " + firsSelectedOption.getText());

		System.out.println("--------------------------------------------------");

		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();

		for (WebElement option : allSelectedOptions) {
			System.out.println("Selected option: " + option.getText());
		}

		System.out.println("--------------------------------------------------");

		List<WebElement> allOptions = select.getOptions();

		for (WebElement option : allOptions) {
			System.out.println("Option: " + option.getText());
		}

		System.out.println("--------------------------------------------------");

		select.deselectByIndex(3);

		Thread.sleep(2000);

		select.deselectByValue("Hyundaix");

		Thread.sleep(2000);

		select.deselectByVisibleText("Swift");

		Thread.sleep(2000);

		select.deSelectByContainsVisibleText("lvo");

		select.selectByIndex(3);

		Thread.sleep(2000);

		select.selectByValue("Hyundaix");

		Thread.sleep(2000);

		select.selectByVisibleText("Swift");

		Thread.sleep(2000);

		select.selectByContainsVisibleText("lvo");

		Thread.sleep(2000);

		select.deselectAll();

	}

}
