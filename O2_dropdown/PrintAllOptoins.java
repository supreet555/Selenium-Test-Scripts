package O2_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptoins {
	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
		d.get("file:///D:/QSPIDERS/Selenium/Practice%20place/Dropdown.html");
		WebElement dropdown = d.findElement(By.tagName("select"));
		Select s = new Select(dropdown);
		List<WebElement> options = s.getOptions();
		for(WebElement ele : options) {
			System.out.println(ele.getText());
		}
		d.close();

	}
}
