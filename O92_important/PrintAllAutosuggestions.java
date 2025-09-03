package O0_important_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.Help;

public class PrintAllAutosuggestions extends Help {
	public static void main(String[] args) {
		
		openBrowserNavigate("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("software");
		List<WebElement> autosuggestions = driver.findElements(By.xpath("//span[contains(text(), 'software')]"));
		for(WebElement suggestion : autosuggestions) {
			String text = suggestion.getText();
			System.out.println(text);
		}
		
		driver.quit();
		
	}
}
