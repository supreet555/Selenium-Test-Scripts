package O9_scrolling;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// command to get total height --> document.body.scrollHeight
public class ScrollTopBotton {
	public static void main(String[] args) throws InterruptedException {

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("file:///D:/QSPIDERS/Selenium/Practice%20place/Scroll.html");
		
		JavascriptExecutor je = (JavascriptExecutor) d;
		Thread.sleep(1000);
		
		// scroll to the bottom
		je.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(1000);
		
		// scroll to the top
		je.executeScript("window.scrollTo(0, 0)");

		d.quit();
	}
}
