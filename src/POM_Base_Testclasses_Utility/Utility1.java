package POM_Base_Testclasses_Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility1 {
	public static String getDataFromExcel(int rowNo,int ColNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream MyFile = new FileInputStream("C:\\Users\\User\\Documents\\ZerodaUserPsw.xlsx");
		Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet2");
		String value = MySheet.getRow(rowNo).getCell(ColNum).getStringCellValue();
		return value;
	}

	public static void CaptureScreenshot(WebDriver driver,int TCID) throws IOException // tc id no for particular tc screenshot
	{
		int TCID1=10;
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("D:\\Screenshot by eclipse\\ "+TCID1+".png");
		org.openqa.selenium.io.FileHandler.copy(src, dest);
	}

}
