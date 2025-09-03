package assignment;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsScenario {
	public static void main(String[] args) throws InterruptedException {

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("http://localhost/login.do");
		d.findElement(By.id("username")).sendKeys("admin");
		d.findElement(By.name("pwd")).sendKeys("manager");
		d.findElement(By.id("loginButton")).click();
		
		d.findElement(By.xpath("//div[contains(text(), 'Help') and @class='popup_menu_label']")).click();
		d.findElement(By.linkText("About your actiTIME")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//a[text()='Read License Agreement']")).click();
		
		Set<String> tabs = d.getWindowHandles();
		Iterator<String> i = tabs.iterator();
		String parentTab = i.next();
		String nextTab = i.next();
		d.switchTo().window(nextTab);
		List<WebElement> headings = d.findElements(By.xpath("//h2"));
		Iterator<WebElement> j = headings.iterator();
		while(j.hasNext()) {
			String text = j.next().getText();
			System.out.println(text);
		}

		Thread.sleep(1000);
		d.switchTo().window(parentTab);
		d.close();
		d.switchTo().window(nextTab);
		Thread.sleep(1000);
		d.close();

	}
}
// forever evergreen.