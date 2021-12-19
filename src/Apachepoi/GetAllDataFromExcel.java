package Apachepoi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetAllDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream Myfile2 = new FileInputStream("C:\\Users\\User\\Documents\\Data2.xlsx");

        Sheet Sh1 = WorkbookFactory.create(Myfile2).getSheet("Sheet1");

        int LastrowIndex = Sh1.getLastRowNum();


//        System.out.println(LastrowIndex);
        //1. for getting row from strting to end

        for(int i=0;i<=LastrowIndex;i++)
        {
        	int LastCellIndex = Sh1.getRow(i).getLastCellNum()-1;

        	    for(int j=0;j<=LastCellIndex;j++)
        	    {
        	    	 String Value = Sh1.getRow(i).getCell(j).getStringCellValue();
        	    	 System.out.print(Value + " ");
        	    }
        	    System.out.println();

        }

	}

}
