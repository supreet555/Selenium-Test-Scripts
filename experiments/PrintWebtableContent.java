package assignment;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintWebtableContent {
	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
		d.get("file:///D:/QSPIDERS/Selenium/Practice%20place/SeleniumWebPage.html");
		List<WebElement> tableContent = d.findElements(By.xpath("//td"));
		for(WebElement ele : tableContent) {
			String text = ele.getText();
			System.out.println(text);
		}
		d.close();
		
	}
}
