package O2_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {

		WebDriver d = new ChromeDriver();
		d.get("file:///D:/QSPIDERS/Selenium/Practice%20place/Dropdown.html");
		d.manage().window().maximize();
		WebElement e = d.findElement(By.tagName("select"));
		
		Select s = new Select(e);
		Thread.sleep(1500);
		
		// selecting options (11 methods)
		s.selectByIndex(6); // starts from 0
		Thread.sleep(1500);
		s.selectByVisibleText("Chapathi");
		Thread.sleep(1500);
		s.selectByContainsVisibleText("Pani");
		Thread.sleep(1500);
//		s.selectByValue("a"); --- not understanding
		List<WebElement> selectedOptions = s.getAllSelectedOptions();
		s.deSelectByContainsVisibleText("Pani");
		Thread.sleep(1500);
		s.deselectAll();

		// printing all options
		List<WebElement> options = s.getOptions();
		for(WebElement ele : options) {
			System.out.println(ele.getText());
		}
		
		System.out.println("");
		
		// printing selected options
		for(WebElement ele : selectedOptions) {
			System.out.println(ele.getText());
		}
		d.close();

	}
}
