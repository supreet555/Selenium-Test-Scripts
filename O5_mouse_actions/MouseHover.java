package O5_mouse_actions;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//moveToElement()
public class MouseHover {
	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.google.com");
		WebElement target = d.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
		Actions a = new Actions(d);
		a.moveToElement(target).perform();

	}
}
