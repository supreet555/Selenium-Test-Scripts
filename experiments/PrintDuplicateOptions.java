package assignment;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintDuplicateOptions {
	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
		d.get("file:///D:/QSPIDERS/Selenium/Practice%20place/Dropdown.html");
		WebElement dropdown = d.findElement(By.tagName("select"));
		Select s = new Select(dropdown);
		List<WebElement> options = s.getOptions();
		ArrayList<String> optionsText = new ArrayList<>();
		for(WebElement el : options) {
			optionsText.add(el.getText());
		}
		
		boolean[] b = new boolean[optionsText.size()];
		for(int i=0; i<optionsText.size(); i++) {
			int count = 1;
			if(b[i] == false) {
				for(int j=i+1; j<optionsText.size(); j++) {
					String initial = optionsText.get(i);
					String next = optionsText.get(j);
					if(initial.equals(next)) {
						count++;
						b[j] = true;

					}
				}
			}
			if(count>1) {
				System.out.println(optionsText.get(i));
			}
		}
		
		d.quit();

	}
}
