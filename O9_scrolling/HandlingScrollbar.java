package O9_scrolling;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
We have to use JavaScript commands to scroll to a position.
Use the commands
windows.scrollTo() --> always scrolls to the exact (x, y) coordinates provided, regardless of the current scroll position.
windows.scrollBy() --> always scrolls to the relative (x, y) coordinates provided considering the current scroll position.
*/

public class HandlingScrollbar {
	public static void main(String[] args) throws InterruptedException {

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("file:///D:/QSPIDERS/Selenium/Practice%20place/Scroll.html");
		
		// scroll 100px down from top position
		Thread.sleep(1000);
		((JavascriptExecutor) d).executeScript("window.scrollTo(0, 100)");
		
		// scroll 200px down from top position
		Thread.sleep(1000);
		((JavascriptExecutor) d).executeScript("window.scrollTo(0, 200)");
		
		// scroll 500px down from current position
		Thread.sleep(1000);
		((JavascriptExecutor) d).executeScript("window.scrollBy(0, 500)");
		
		Thread.sleep(1000);
		d.close();

	}
}
