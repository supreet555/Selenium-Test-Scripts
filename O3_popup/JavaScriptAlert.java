package O3_popup;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlert {
	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
		d.get("file:///D:/QSPIDERS/Selenium/Knowledge%20-%20read%20often/Alert.html");
		d.findElement(By.tagName("button")).click();
		Alert a = d.switchTo().alert();
		a.dismiss();
		String alertText = a.getText();
		System.out.println(alertText);
		a.accept();
		d.close();

	}
}
