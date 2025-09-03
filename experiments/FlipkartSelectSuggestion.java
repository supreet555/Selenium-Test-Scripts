package assignment;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSelectSuggestion {
	public static void main(String[] args) throws InterruptedException {

		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://www.flipkart.com");
		d.findElement(By.name("q")).sendKeys("samsung");
		Thread.sleep(1000);
		List<WebElement> suggs = d.findElements(By.xpath("//div[@class='YGcVZO _2VHNef']"));
		int count = suggs.size();
		System.out.println(count);
		for(WebElement ele : suggs) {
			String text = ele.getText();
			System.out.println(text);
		}
		suggs.get(count-1).click();
		d.close();

	}
}
