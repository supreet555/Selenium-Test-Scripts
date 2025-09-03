package O91_data_driven_testing;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLogin {
	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		// getting URL from property file and opening the link
		String commonDataPath = "./data/commondata.properties";
		FileInputStream fin = new FileInputStream(commonDataPath);
		Properties p = new Properties();
		p.load(fin);
		String url = p.getProperty("url");
		driver.get(url);
		
		// validating excel data
		String testScriptDataPath = "./data/testscript.xlsx";
		FileInputStream fin1 = new FileInputStream(testScriptDataPath);
		Workbook wb = WorkbookFactory.create(fin1);
		Sheet sht = wb.getSheet("invalidLogin");
		int lastRowNum = sht.getLastRowNum();
		
		for(int i=0; i<=lastRowNum; i++) {
			String un = wb.getSheet("invalidLogin").getRow(i).getCell(0).getStringCellValue();
			String pwd = wb.getSheet("invalidLogin").getRow(i).getCell(1).getStringCellValue();
			
			driver.findElement(By.id("username")).sendKeys(un);
			driver.findElement(By.name("pwd")).sendKeys(pwd);
			driver.findElement(By.id("loginButton")).click();
			
			try {
				driver.findElement(By.id("logoutLink")).click();
				wb.getSheet("invalidLogin").getRow(i).getCell(2).setCellValue("Pass");
			} catch (NoSuchElementException te) {
				wb.getSheet("invalidLogin").getRow(i).getCell(2).setCellValue("Fail");
				driver.findElement(By.id("username")).clear();
				driver.findElement(By.name("pwd")).clear();
			}
		}
		
		FileOutputStream fout = new FileOutputStream(testScriptDataPath);
		wb.write(fout);
		driver.quit();
	}
}
