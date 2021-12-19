package Apachepoi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetalldataFromColumn {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream Myfile = new FileInputStream("C:\\Users\\User\\Documents\\MyData.xlsx");

        Sheet Sh1 = WorkbookFactory.create(Myfile).getSheet("Sheet2");
       int Count= Sh1.getLastRowNum();
       System.out.println(Count);
        for(int i=0;i<=Count;i++)
        {
        	String value1 = Sh1.getRow(i).getCell(0).getStringCellValue();
        	System.out.println(value1);
        }

	}

}