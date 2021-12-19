package Apachepoi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream Myfile = new FileInputStream("C:\\Users\\User\\Documents\\MyData.xlsx");

//		 CellType seconddata1 = WorkbookFactory.create(Myfile).getSheet("MYINFO").getRow(1).getCell(0).getCellType();
//
//		System.out.println(seconddata1);

		  double seconddata1 = WorkbookFactory.create(Myfile).getSheet("MYINFO").getRow(1).getCell(0).getNumericCellValue();

		 System.out.println(seconddata1);


	}

}
