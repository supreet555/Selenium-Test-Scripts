package O5_mouse_actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleDragDrop {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToMultiple?sublist=3");
		
		List<WebElement> allItmes = driver.findElements(By.xpath("//div[@class='draggable-container']/div"));
		List<WebElement> sections = driver.findElements(By.xpath("//div[contains(text(),'Accessories')]"));
		String[] sectionWords = {"Laptop", "Mobile"};
		
		Actions a = new Actions(driver);
		
		for(int i=0; i<sectionWords.length; i++) {
			WebElement dummy = driver.findElement(By.tagName("body"));
			for(WebElement item : allItmes) {
				String text = item.getText();
				String sectionWord = sectionWords[i];
				if(text.contains(sectionWord)) {
					item.click();
					dummy = item;
				}
				
			}
			
			a.clickAndHold(dummy).moveToElement(sections.get(i)).release().perform();
		}
		

	}
}

/*

public class MultipleDragDrop {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToMultiple?sublist=3");

        // Find the target sections
        WebElement laptopSection = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
        WebElement mobileSection = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));

        // Get all draggable items
        List<WebElement> allItems = driver.findElements(By.xpath("//div[@class='draggable-container']/div"));

        Actions a = new Actions(driver);

        // --- Dragging Laptop Items ---
        WebElement firstLaptopItem = null; // We'll store the first laptop item to drag
        for (WebElement item : allItems) {
            String text = item.getText();
            if (text.contains("Laptop")) {
                item.click(); // Click to select all laptop items
                if (firstLaptopItem == null) {
                    firstLaptopItem = item; // Store one of the laptop items to use for dragging
                }
            }
        }

        if (firstLaptopItem != null) {
            // Drag any one of the selected laptop items to the laptop section
            a.clickAndHold(firstLaptopItem).moveToElement(laptopSection).release().perform();
            Thread.sleep(1000); // Small pause after dropping
        }

        // Re-get all items as their state/position might have changed after the first drag
        allItems = driver.findElements(By.xpath("//div[@class='draggable-container']/div"));

        // --- Dragging Mobile Items ---
        WebElement firstMobileItem = null; // We'll store the first mobile item to drag
        for (WebElement item : allItems) {
            String text = item.getText();
            if (text.contains("Mobile")) {
                item.click(); // Click to select all mobile items
                if (firstMobileItem == null) {
                    firstMobileItem = item; // Store one of the mobile items to use for dragging
                }
            }
        }

        if (firstMobileItem != null) {
            // Drag any one of the selected mobile items to the mobile section
            a.clickAndHold(firstMobileItem).moveToElement(mobileSection).release().perform();
            Thread.sleep(1000); // Small pause after dropping
        }

        Thread.sleep(2000); // Wait to observe the final result
        driver.quit();
    }
}

*/