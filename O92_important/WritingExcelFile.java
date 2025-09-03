package O0_important_test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import util.Help;

public class WritingExcelFile extends Help {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String path = "./data/testscript.xlsx";
		FileInputStream fin = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fin);
		wb.getSheet("Test Sheet").getRow(3).getCell(2).setCellValue("true");
		
		FileOutputStream fout = new FileOutputStream(path);
		wb.write(fout);
		
	}

}
