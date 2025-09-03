package O5_mouse_actions;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//contextClick()
public class RightClick {
	public static void main(String[] args) throws AWTException {

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("http://localhost/login.do");
		WebElement target = d.findElement(By.linkText("actiTIME Inc."));
		Actions a = new Actions(d);
		a.contextClick(target).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_W);

	}
}
