package Apachepoi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelColumnCount {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream Myfile = new FileInputStream("C:\\Users\\User\\Documents\\MyData.xlsx");

		  short Totalcolumn = WorkbookFactory.create(Myfile).getSheet("Sheet2").getRow(0).getLastCellNum();

		  System.out.println(Totalcolumn);
	}

}
