package O4_tabs;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise {
	public static void main(String[] args) {

		String[] links = {
				"https://www.google.com",
				"https://www.facebook.com",
				"https://www.twitter.com",
				"https://www.ola.com",
				"https://www.instagram.com"
		};
		
		WebDriver d = new ChromeDriver();
		d.get(links[0]);
		Set<String> tabs = d.getWindowHandles();
		for(int i=0; i<links.length-1; i++) {
			((JavascriptExecutor) d).executeAsyncScript("window.open();");
			tabs = d.getWindowHandles();
			Iterator<String> it = tabs.iterator();
			String lastTab = "";
			while(it.hasNext()) {
				lastTab = it.next();
			}
			d.switchTo().window(lastTab);
			d.get(links[i+1]);
		}

	}
}
