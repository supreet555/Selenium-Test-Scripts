package O0_important_test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String path = "./data/testscript.xlsx";
		FileInputStream fin = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fin);
		String text = wb.getSheet("Test Sheet").getRow(1).getCell(0).getStringCellValue();
		System.out.println(text);
		
	}

}
