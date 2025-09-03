package O0_important_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.Help;

public class PrintAllLinks extends Help {
	public static void main(String[] args) {

		openBrowserNavigate("http://localhost/login.do");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		for(WebElement link : links) {
			String text = link.getText();
			System.out.println(text);
		}
		
		driver.quit();

	}
}
