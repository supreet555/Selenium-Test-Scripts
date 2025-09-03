package O91_data_driven_testing;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelCommonExceptions {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String path = "./data/testscript.xlsx";
		FileInputStream fin = new FileInputStream(path); // passing invalid path gives "FileNotFoundException"
		
		Workbook wb = WorkbookFactory.create(fin);
		
		// trying to read from an empty cell gives "NullPointerException"
		String data1 = wb.getSheet("something").getRow(1).getCell(0).getStringCellValue();
		
		// trying to read String data from numeric type, and vice-versa, gives "IllegalStateException"
		String data2 = wb.getSheet("something").getRow(0).getCell(0).getStringCellValue();
		
		// we will get "FileNotFoundException" if we trying to write data while file is open in the background
		// we will get "NullPointerException" if we trying to write data to a cell that was never populated before

	}
}
