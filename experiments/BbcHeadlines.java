package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BbcHeadlines {
	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://www.bbc.com");
		List<WebElement> headlines = d.findElements(By.xpath("//h2[@data-testid='texas-title'][1]/../../../../div[2]//h2"));
		for(WebElement ele : headlines) {
			String text = ele.getText();
			System.out.println(text);
		}
		d.close();

	}
}
