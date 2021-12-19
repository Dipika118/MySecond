package Apachepoi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetalldatafromRow {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream Myfile = new FileInputStream("C:\\Users\\User\\Documents\\MyData.xlsx");

        Sheet Sh = WorkbookFactory.create(Myfile).getSheet("Sheet2");
		  //1.static way
//            for (int i = 0; i <4; i++) {
//            	String Value = Sh.getRow(0).getCell(i).getStringCellValue();
//            	System.out.println(Value);
//			}
        //2.dyanamic way
     int rowbyindex = Sh.getLastRowNum()-1;
     System.out.println(rowbyindex);
        for(int i =0;i<=rowbyindex-1;i++)
        {
        	String value1 = Sh.getRow(0).getCell(i).getStringCellValue();
        	System.out.println(value1);
        }
	}

}
