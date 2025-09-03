package assignment;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseTabsQuitIterator {
	public static void main(String[] args) throws InterruptedException {

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("http://localhost/login.do");
		d.findElement(By.linkText("actiTIME Inc.")).click();
		
		Set<String> tabs = d.getWindowHandles();
		Iterator<String> i = tabs.iterator();
		while(i.hasNext()) {
			d.switchTo().window(i.next());
			Thread.sleep(1000);
			d.close();
		}

	}
}
