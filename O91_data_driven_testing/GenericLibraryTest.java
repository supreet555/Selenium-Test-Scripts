package O91_data_driven_testing;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.generic.FileLib;

public class GenericLibraryTest {
	public static void main(String[] args) throws IOException {
	
		FileLib f = new FileLib();
		String url = f.getPropertyData("url");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get(url);
		
		String un = f.getExcelData("invalidLogin", 0, 0);
		String pwd = f.getExcelData("invalidLogin", 0, 1);
		d.findElement(By.id("username")).sendKeys(un);
		d.findElement(By.name("pwd")).sendKeys(pwd);
		d.findElement(By.id("loginButton")).click();
		
		d.quit();

	}
}
