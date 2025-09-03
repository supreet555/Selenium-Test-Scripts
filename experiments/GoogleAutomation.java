package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutomation {
	public static void main(String[] args) throws InterruptedException {

		WebDriver d = new ChromeDriver();
		d.get("https://www.google.com");
		d.findElement(By.id("APjFqb")).sendKeys("qspiders");
		Thread.sleep(2000);
		List<WebElement> suggestions = d.findElements(By.xpath("//span[contains(text(), 'qspiders')]"));
		int count = suggestions.size();
		System.out.println(count);
		for(WebElement ele : suggestions) {
			String text = ele.getText();
			System.out.println(text);
		}
		suggestions.get(0).click();
		Thread.sleep(5000);
		d.close();

	}
}
