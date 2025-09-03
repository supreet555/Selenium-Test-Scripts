package O91_data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelHorizontally {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String path = "./data/testscript.xlsx";
		FileInputStream fin = new FileInputStream(path);
		
		Workbook wb = WorkbookFactory.create(fin);
		// this method returns non-zero-based indexing integer, if 75 cells are there, below method return 75
		int lastCellNum = wb.getSheet("someone").getRow(0).getLastCellNum(); 
		System.out.println(lastCellNum);
		
		// you should iterate less than the lastRowNum
		for(int i=0; i<lastCellNum; i++) {
			
			// getRow() method also works based zero=based indexing
			String data = wb.getSheet("someone").getRow(0).getCell(i).getStringCellValue();
			System.out.println(data);
		}

	}
}
