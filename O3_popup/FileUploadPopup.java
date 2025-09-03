package O3_popup;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
	public static void main(String[] args) throws InterruptedException {

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.west-wind.com/wconnect/wcscripts/fileupload.wwd");
		
		// Getting the file location
		File f = new File("./src/popup/The 5 Minute Discipline icon.png");
		String path = f.getAbsolutePath();
		
		// Passing the file location
		d.findElement(By.id("ajaxUpload")).sendKeys(path);
		Thread.sleep(5000);
		d.close();

	}
}
