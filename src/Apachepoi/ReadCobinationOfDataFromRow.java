package Apachepoi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadCobinationOfDataFromRow {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream Myfile2 = new FileInputStream("C:\\Users\\User\\Documents\\Book123.xlsx");

        Sheet Sh1 = WorkbookFactory.create(Myfile2).getSheet("Sheet1");


//        1. for counting index
         int CellInfo = Sh1.getRow(0).getLastCellNum()-1;
        System.out.println(CellInfo);
//

        for(int i=0;i<=CellInfo;i++)
        {
        	 CellType CellTypedata = Sh1.getRow(0).getCell(i).getCellType();
//        	 System.out.println(CellTypedata);

        	 if(CellTypedata==CellTypedata.STRING)
        	 {
        		String value = Sh1.getRow(0).getCell(i).getStringCellValue();
        		 System.out.println(value);

        	 }
        	 else if(CellTypedata==CellTypedata.NUMERIC)
        	 {
        		 double value = Sh1.getRow(0).getCell(i).getNumericCellValue();
        		 System.out.println(value);
        	 }
        	 else if(CellTypedata==CellTypedata.BOOLEAN)
        	 {
        		 boolean value = Sh1.getRow(0).getCell(i).getBooleanCellValue();
        		 System.out.println(value);
        	 }
        }







	}

}
