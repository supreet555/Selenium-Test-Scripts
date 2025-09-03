package O9_scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToAnElement {
	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("file:///D:/QSPIDERS/Selenium/Practice%20place/Scroll.html");
		
		// get element position
		int y = d.findElement(By.id("target")).getRect().getY();
		
		// scroll to that position
		JavascriptExecutor je = (JavascriptExecutor) d;
		je.executeScript("window.scrollTo(0, "+y+")");
		
	}
}
