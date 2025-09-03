package assignment;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IframeCopyPaste {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapps.qspiders.com");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		WebElement from = driver.findElement(By.xpath("//section[text()='Web Elements']"));
		WebElement to = driver.findElement(By.xpath("//section[text()='Frames']"));
		Actions a = new Actions(driver);
		a.moveToElement(from).perform();
		Thread.sleep(1000);
		a.scrollToElement(to).perform();
		Thread.sleep(1000);
		to.click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Nested iframe")).click();
		Thread.sleep(1000);
		WebElement frame = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(frame);
		
		String email = driver.findElement(By.xpath("(//p[@class='para'])[1]")).getText();
		String password = driver.findElement(By.xpath("(//p[@class='para'])[2]")).getText();
		String confirmPassword = driver.findElement(By.xpath("(//p[@class='para'])[3]")).getText();
		
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='confirm-password']")).sendKeys(confirmPassword);
		driver.findElement(By.id("submitButton")).click();
		
		driver.switchTo().defaultContent();
		boolean messageCheck = driver.findElement(By.xpath("//div[contains(text(), 'Sign up suc')]")).isDisplayed();
		if(messageCheck) {
			System.out.println("/Successful");
		} else {
			System.out.println("Not successful");
		}
		
		Thread.sleep(3000);
		driver.quit();

	}
}
