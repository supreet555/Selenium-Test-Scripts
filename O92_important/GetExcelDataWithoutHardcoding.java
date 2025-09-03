package O0_important_test;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetExcelDataWithoutHardcoding {

	public static void main(String[] args) throws Exception {

		String path = "./data/testscript.xlsx";
		FileInputStream fin = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fin);
		
		int rowCount = wb.getSheet("people").getLastRowNum();
		int cellCount = wb.getSheet("people").getRow(0).getLastCellNum();
		
		for(int i=0; i<=rowCount; i++) {
			for(int j=0; j<cellCount; j++) {
				String data = wb.getSheet("people").getRow(i).getCell(j).getStringCellValue();
				System.out.println(data);
			}
			System.out.println();
		}
		
	}

}
