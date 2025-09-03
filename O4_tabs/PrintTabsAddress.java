package O4_tabs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTabsAddress {
	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
		d.get("http://localhost/login.do");
		d.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
		Set<String> something = d.getWindowHandles();
		for(String s : something) {
			System.out.println(s);
		};
		d.quit();

	}
}
