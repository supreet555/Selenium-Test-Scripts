package O91_data_driven_testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class WriteExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String path = "./data/testscript.xlsx";
		FileInputStream fin = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fin);
		
		wb.getSheet("someone").getRow(1).getCell(0).setCellValue("hi");
		FileOutputStream fout = new FileOutputStream(path);
		wb.write(fout);
		
	}
}
