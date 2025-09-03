package O3_popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarPopup {
	public static void main(String[] args) throws InterruptedException {

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.makemytrip.com");
		d.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		
		// Click and choose from departure drop down
		d.findElement(By.xpath("//div[@class='flt_fsw_inputBox dates inactiveWidget ']")).click();
		d.findElement(By.xpath("(//p[text()='27'])[1]")).click();
		
		// Click and choose from return drop down
		d.findElement(By.xpath("//div[@data-cy='returnArea']")).click();
		d.findElement(By.xpath("(//p[text()='30'])[1]")).click();

		d.close();
		
	}
}
