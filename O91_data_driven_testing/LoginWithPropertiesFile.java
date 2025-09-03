package O91_data_driven_testing;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithPropertiesFile {
	public static void main(String[] args) throws IOException, InterruptedException {

		String path = "./data/commondata.properties";
		FileInputStream fin = new FileInputStream(path);
		
		Properties p = new Properties();
		p.load(fin);
		
		String url = p.getProperty("url");
		String un = p.getProperty("un");
		String pwd = p.getProperty("pwd");
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get(url);
		d.findElement(By.id("username")).sendKeys(un);
		d.findElement(By.name("pwd")).sendKeys(pwd);
		d.findElement(By.id("loginButton")).click();
		
		Thread.sleep(1000);
		d.quit();

	}
}
