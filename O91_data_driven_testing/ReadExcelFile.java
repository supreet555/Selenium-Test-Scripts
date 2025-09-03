package O91_data_driven_testing;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String path = "./data/testscript.xlsx";
		FileInputStream fin = new FileInputStream(path);
		
		Workbook wb = WorkbookFactory.create(fin);
		String firstData1 = wb.getSheet("something").getRow(0).getCell(0).getStringCellValue();
		String firstData2 = wb.getSheet("something").getRow(0).getCell(0).toString();
		System.out.println(firstData1);
		System.out.println(firstData2);

	}
}
