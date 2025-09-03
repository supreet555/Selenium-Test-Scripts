package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartProductTitles {
	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://www.flipkart.com");
		d.findElement(By.name("q")).sendKeys("samsung s21 ultra");
		d.findElement(By.name("q")).sendKeys(Keys.ENTER);
		List<WebElement> titles = d.findElements(By.xpath("(//div[contains(text(), 'Samsung Galaxy')])[position()<25]"));
		List<WebElement> prices = d.findElements(By.xpath("(//div[contains(text(), 'Samsung Galaxy')])[position()<25]/../..//div[contains(text(), '₹')]"));
		for(int i=0; i<titles.size(); i++) {
			String title = titles.get(i).getText();
			String price = prices.get(i).getText();
			System.out.println(title + " --> " + price);
		}
		d.close();

	}
}
