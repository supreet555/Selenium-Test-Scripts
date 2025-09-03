package O2_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintWithWrappedText {
	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
		d.get("file:///D:/QSPIDERS/Selenium/Practice%20place/Dropdown.html");
		WebElement dropdown = d.findElement(By.tagName("select"));
		Select s = new Select(dropdown);
		String text = s.getWrappedElement().getText();
		System.out.println(text);
		d.close();

	}
}
