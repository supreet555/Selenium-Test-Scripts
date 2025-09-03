package assignment;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DateOfBirth {
	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://www.facebook.com");
		d.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		WebElement day = d.findElement(By.id("day"));
		WebElement month = d.findElement(By.id("month"));
		WebElement year = d.findElement(By.id("year"));
		
		Select s1 = new Select(day);
		s1.selectByIndex(13);
		
		Select s2 = new Select(month);
		s2.selectByValue("10");
		
		Select s3 = new Select(year);
		s3.selectByVisibleText("2000");

	}
}
