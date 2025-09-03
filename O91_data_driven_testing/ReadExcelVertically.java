package O91_data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelVertically {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String path = "./data/testscript.xlsx";
		FileInputStream fin = new FileInputStream(path);
		
		Workbook wb = WorkbookFactory.create(fin);
		// this method returns zero-based indexing integer, if 75 rows are there, below method return 74
		int lastRowNum = wb.getSheet("someone").getLastRowNum(); 
		System.out.println(lastRowNum);
		
		// it is necessary to iterate including the lastRowNum
		for(int i=0; i<=lastRowNum; i++) {
			
			// getRow() method also works based zero=based indexing
			String data = wb.getSheet("someone").getRow(i).getCell(0).getStringCellValue();
			System.out.println(data);
		}

	}
}
