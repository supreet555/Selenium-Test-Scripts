package O7_embedded_webpage;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {
	public static void main(String[] args) {
	
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://demo.automationtesting.in/Frames.html");
		d.findElement(By.linkText("Iframe with in an Iframe")).click();
		
		// switch to parent
		WebElement e1 = d.findElement(By.xpath("//div[@id='Multiple']/iframe"));
		d.switchTo().frame(e1);
		
		// switch to child
		d.switchTo().frame(0);
		
		// perform action
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("something");
		
		d.quit();

	}
}
