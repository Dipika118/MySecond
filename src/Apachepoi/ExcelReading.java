package Apachepoi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream Myfile = new FileInputStream("C:\\Users\\User\\Documents\\MyData.xlsx");

//		String firstdata = WorkbookFactory.create(Myfile).getSheet("MYINFO").getRow(0).getCell(0).getStringCellValue();

//		System.out.println(firstdata);

		Workbook file = WorkbookFactory.create(Myfile);
		Sheet Sheetinfo = file.getSheet("MYINFO");
		Row rr = Sheetinfo.getRow(0);
		Cell cc = rr.getCell(0);
		String value = cc.getStringCellValue();
		System.out.println(value);



	}
}
