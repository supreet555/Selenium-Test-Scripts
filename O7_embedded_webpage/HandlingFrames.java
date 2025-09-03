package O7_embedded_webpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
		d.get("file:///D:/QSPIDERS/Selenium/Practice%20place/PracticeAll.html");
		
		// switch to the iframe
		WebElement iframe = d.findElement(By.id("embeddedFrame"));
		d.switchTo().frame(iframe);
		
		// type the text
		d.findElement(By.id("iframeInput")).sendKeys("something");
		
		// switch back to parent
		d.switchTo().parentFrame();
		d.switchTo().defaultContent();//switches control to default webapge
		
		// action in parent code
		WebElement e = d.findElement(By.xpath("//p[contains(text(), 'outside the iframe.')]"));
		String text = e.getText();
		System.out.println(text);
		
		d.quit();
	}
}

/*
 Webpage inside another web page is called iframe / embedded webpage.
 It is developed with <iframe> tag. 
 First we need to switch to the <iframe> then perform the tasks.
 To go back, we have to use parentFrame() method.
 */