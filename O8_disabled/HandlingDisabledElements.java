package O8_disabled;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 To handle disabled elements, there are no methods in Selenium.
 We have to use Javascript commands to handle disabled elements.
 We use executeScript() method of JavascriptExecutor to handled this.
 Convert driver reference to JavascriptExecutor with explicit type casting
 Verify the command that you want to execute in browser console
 Use executeScript() to execute that script
 Common Javascript commands
 - document.getElementById('email').value = 'something';
 - document.getElementById('email').value = '';
 - document.getElementById('loginButton').click();
*/

public class HandlingDisabledElements {
	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("file:///D:/QSPIDERS/Selenium/Practice%20place/DisabledElements.html");
		JavascriptExecutor je = (JavascriptExecutor) d;
		je.executeScript("document.getElementById('email').value = 'admin';");
		je.executeScript("document.getElementById('pwd').value = 'manager';");

	}
}
