package GenericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ExcelSheet implements FrameworkConstraints {

	static File f =  new File(excel_path);
	@DataProvider(name = "data")
	public static Object[][] excelData() throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream(f);
		Workbook w = WorkbookFactory.create(fis);
		 Sheet s = w.getSheet("sheet1");
		 int rowsize = s.getPhysicalNumberOfRows();
		 int coloumsize = s.getRow(0).getPhysicalNumberOfCells();
		 Object[][] d = new Object[rowsize][coloumsize];
		 for(int i=0;i<rowsize;i++) {
			 for(int j=0;j<coloumsize;j++) {
				d[i][j] =  s.getRow(i).getCell(j).toString();
			 }
		 }
		 return d;
		
	}
}
