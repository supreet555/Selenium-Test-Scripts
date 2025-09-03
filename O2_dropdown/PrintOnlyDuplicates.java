package O2_dropdown;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOnlyDuplicates {
	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
		d.get("file:///D:/QSPIDERS/Selenium/Practice%20place/Dropdown.html");
		WebElement dropdown = d.findElement(By.tagName("select"));
		Select s = new Select(dropdown);
		List<WebElement> options = s.getOptions();
		ArrayList<String> optionsArray = new ArrayList<>();
		
		for(int i=0; i<options.size(); i++) {
			for(int j=i+1; j<options.size(); j++) {
				String initial = options.get(i).getText();
				String next = options.get(j).getText();
				if(initial.equals(next)) {
					optionsArray.add(initial);
				}
			}
		}
		
		for(String str : optionsArray) {
			System.out.println(str);
		}
		
		d.close();

	}
}
