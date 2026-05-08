package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectionDropdownCommingUnderSelectTag {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		WebElement dropdown = driver.findElement(By.xpath("//select[@id='drop1']"));

		Select select = new Select(dropdown);

		// To check whether the dropdown is single selection or multiple selection
		boolean isMultiSelectAllowed = select.isMultiple();
		System.out.println("Is multiple selection allowed: " + isMultiSelectAllowed);

		System.out.println("--------------------------------------------------");

		// this method will return all selected options in the dropdown and return type
		// is List<WebElement>
		List<WebElement> allSelecedOptions = select.getAllSelectedOptions();
		for (WebElement option : allSelecedOptions) {
			System.out.println("Selected option: " + option.getText());
		}

		System.out.println("--------------------------------------------------");

		// It will return list of all options present in the dropdown and return type is
		// List<WebElement>
		List<WebElement> allOptions = select.getOptions();
		for (WebElement option : allOptions) {
			System.out.println("Option: " + option.getText());
		}

		System.out.println("--------------------------------------------------");

		// This method will return the first selected option in the dropdown and return
		// type is WebElement
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		System.out.println("First selected option: " + firstSelectedOption.getText());

		System.out.println("--------------------------------------------------");

		select.selectByVisibleText("doc 4");

		Thread.sleep(2000);

		select.selectByValue("ghi");

		Thread.sleep(2000);

		select.selectByIndex(3);

		Thread.sleep(2000);

		select.selectByContainsVisibleText("1");

		select.deselectAll();

	}

}
