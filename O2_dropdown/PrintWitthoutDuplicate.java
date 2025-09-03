package O2_dropdown;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintWitthoutDuplicate {
	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
		d.get("file:///D:/QSPIDERS/Selenium/Practice%20place/Dropdown.html");
		WebElement dropdown = d.findElement(By.tagName("select"));
		Select s = new Select(dropdown);
		List<WebElement> options = s.getOptions();
		HashSet<String> optionsArray = new HashSet<>();
		
		for(WebElement ele : options) {
			String text = ele.getText();
			optionsArray.add(text);
		}
		
		for(String str : optionsArray) {
			System.out.println(str);
		}
		
		d.close();

	}
}
