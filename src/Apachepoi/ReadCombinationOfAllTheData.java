package Apachepoi;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadCombinationOfAllTheData {

	public static void main(String[] args) throws EncryptedDocumentException,IOException {

		FileInputStream Myfile2 = new FileInputStream("C:\\Users\\User\\Documents\\Book123.xlsx");
		   Sheet Sh1 = WorkbookFactory.create(Myfile2).getSheet("Sheet1");

		   int LastRowIndex = Sh1.getLastRowNum();
//		   System.out.println(LastRowIndex);
		    for(int i=0;i<=LastRowIndex;i++)
		    {
		    	int LastCell = Sh1.getRow(i).getLastCellNum()-1;

		    	  for(int j=0;j<=LastCell;j++)
		    	  {
		    	  	Cell CellInfo = Sh1.getRow(i).getCell(j);
		    	  	CellType CellTypedata = CellInfo.getCellType();

		    	  	 if(CellTypedata==CellType.STRING)
		        	 {
		        		 String value = CellInfo.getStringCellValue();
		        		 System.out.print(value +" ");
		        	 }

		        	 else if(CellTypedata==CellType.NUMERIC)
		        	 {
		        		 double value = CellInfo.getNumericCellValue();
		        		 System.out.print(value +" ");
		        	 }
		        	 else if(CellTypedata==CellType.BOOLEAN)
		        	 {
		        		 boolean value = CellInfo.getBooleanCellValue();
		        		 System.out.print(value +" ");
		        	 }
		    	}
		    	  System.out.println();
		    }
	}
}
