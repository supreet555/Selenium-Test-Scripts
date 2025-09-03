package O0_important_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.Help;

public class SelectDeselectAllOptions extends Help {

	public static void main(String[] args) throws InterruptedException {

		openBrowserNavigate("file:///D:/QSPIDERS/Selenium/Practice%20place/Dropdown.html");
		WebElement listbox = driver.findElement(By.tagName("select"));
		Select s = new Select(listbox);
		List<WebElement> options = s.getOptions();
		int size = options.size();

		for(int i=0; i<size; i++) {
			Thread.sleep(500);
			String text = options.get(i).getText();
			s.selectByVisibleText(text);
		}
		
		for(int i=size-1; i>=0; i--) {
			Thread.sleep(500);
			String text = options.get(i).getText();
			s.deselectByVisibleText(text);
		}
		
		driver.quit();

	}

}
