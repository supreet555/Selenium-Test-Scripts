package O2_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDeselect {
	public static void main(String[] args) throws InterruptedException {

		WebDriver d = new ChromeDriver();
		d.get("file:///D:/QSPIDERS/Selenium/Practice%20place/Dropdown.html");
		WebElement dropdown = d.findElement(By.tagName("select"));
		Select s = new Select(dropdown);
		List<WebElement> allOptions = s.getOptions();
		
		// selecting in forward direction
		for(int i=0; i<allOptions.size(); i++) {
			String text = allOptions.get(i).getText();
			s.selectByVisibleText(text);
			Thread.sleep(1000);
		}
		
		// selecting in reverse direction
		for(int i=allOptions.size()-1; i>=0; i--) {
			String text = allOptions.get(i).getText();
			s.deselectByVisibleText(text);
			Thread.sleep(1000);
		}
		
		d.close();

	}
}
