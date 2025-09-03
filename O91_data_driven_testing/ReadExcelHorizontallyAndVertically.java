package O91_data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelHorizontallyAndVertically {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String path = "./data/testscript.xlsx";
		FileInputStream fin = new FileInputStream(path);
		
		Workbook wb = WorkbookFactory.create(fin);
		int lastRowNum = wb.getSheet("somebody").getLastRowNum();
		int lastCellNum = wb.getSheet("somebody").getRow(0).getLastCellNum();
		
		for(int i=0; i<=lastRowNum; i++) {
			
			for(int j=0; j<lastCellNum; j++) {
				String data = wb.getSheet("somebody").getRow(i).getCell(j).toString();
				System.out.println(data);
			}
		}

	}
}
