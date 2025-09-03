package O0_important_test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.Help;

public class PrintOptionsWithoutDuplicate extends Help {

	public static void main(String[] args) {

		openBrowserNavigate("file:///D:/QSPIDERS/Selenium/Practice%20place/Dropdown.html");
		WebElement listbox = driver.findElement(By.tagName("select"));
		Select s = new Select(listbox);
		List<WebElement> options = s.getOptions();
		Set<String> uniques = new HashSet<>();
		
		for(WebElement option : options) {
			uniques.add(option.getText());
		}
		
		for(String item : uniques) {
			System.out.println(item);
		}
		
		driver.quit();
		
	}

}
