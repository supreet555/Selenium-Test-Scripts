package O5_mouse_actions;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// not working
public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.globalsqa.com/demo-site/draganddrop/");
		Thread.sleep(5000);
		WebElement src = d.findElement(By.xpath("//h5[text()='High Tatras']/../img"));
		WebElement des = d.findElement(By.id("trash"));
		Actions a = new Actions(d);
		a.dragAndDrop(src, des).perform();
		Thread.sleep(5000);
		d.quit();

	}
}
