package Apachepoi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RowCountinexcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream Myfile = new FileInputStream("C:\\Users\\User\\Documents\\MyData.xlsx");

	 int TotalRows = WorkbookFactory.create(Myfile).getSheet("MYINFO").getLastRowNum()+1;

		 System.out.println(TotalRows);


	}

}
