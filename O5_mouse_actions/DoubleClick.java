package O5_mouse_actions;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("file:///D:/QSPIDERS/Selenium/Practice%20place/PracticeAll.html");
		WebElement target = d.findElement(By.id("doubleClickArea"));
		Actions a = new Actions(d);
		a.doubleClick(target).perform();
		String status = d.findElement(By.id("mouseActionStatus")).getText();
		System.out.println(status);
		d.quit();

	}
}
