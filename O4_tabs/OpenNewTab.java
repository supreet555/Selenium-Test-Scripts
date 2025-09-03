package O4_tabs;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewTab {
	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
		d.get("https://www.google.com");
		((JavascriptExecutor) d).executeScript("window.open();");
		
		Set<String> tabs = d.getWindowHandles();
		Iterator<String> i = tabs.iterator();
		String previousTab = i.next();
		String currentTab = i.next();
		d.switchTo().window(currentTab);
		
		d.get("https://www.facebook.com");
		d.quit();

	}
}
