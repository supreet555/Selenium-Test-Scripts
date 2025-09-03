package O0_important_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.Help;

public class PrintAllOptions extends Help {
	public static void main(String[] args) {

		openBrowserNavigate("file:///D:/QSPIDERS/Selenium/Practice%20place/Dropdown.html");
		WebElement listBox = driver.findElement(By.tagName("select"));
		Select s = new Select(listBox);
		List<WebElement> options = s.getOptions();
		for(WebElement option : options) {
			String text = option.getText();
			System.out.println(text);
		}
		
		driver.quit();

	}
}
