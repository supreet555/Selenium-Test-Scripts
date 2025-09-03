package assignment;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintDuplicateOptions2 {
	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
        d.get("file:///D:/QSPIDERS/Selenium/Practice%20place/Dropdown.html");
        WebElement dropdownElement = d.findElement(By.tagName("select"));
        Select select = new Select(dropdownElement);
        List<WebElement> options = select.getOptions();

        Set<String> uniqueOptions = new HashSet<>();
        Set<String> duplicateOptions = new HashSet<>();

        for (WebElement option : options) {
            String optionText = option.getText();
            if (!uniqueOptions.add(optionText)) {
                duplicateOptions.add(optionText);
            }
        }

        if (duplicateOptions.isEmpty()) {
            System.out.println("No duplicate options found.");
        } else {
            System.out.println("Duplicate options:");
            for (String duplicate : duplicateOptions) {
                System.out.println(duplicate);
            }
        }

        d.quit();

	}
}
