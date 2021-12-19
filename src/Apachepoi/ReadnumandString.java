package Apachepoi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadnumandString {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		  FileInputStream Myfile = new FileInputStream("C:\\Users\\User\\Documents\\MyData.xlsx");

//		  String Stringvalue = WorkbookFactory.create(Myfile).getSheet("Sheet2").getRow(1).getCell(0).getStringCellValue();
//
//		  System.out.println(Stringvalue );

		  String Stringvalue1 = WorkbookFactory.create(Myfile).getSheet("Sheet2").getRow(2).getCell(0).getStringCellValue();

		  System.out.println(Stringvalue1);

	}

}
