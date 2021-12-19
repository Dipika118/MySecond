package KiteZerodhaAppByExcel;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMhandingbyExcel.KiteHomepageByExcel;
import POMhandingbyExcel.KiteLoginPageByExcel;
import POMhandingbyExcel.KitePinValidationByExcel;

public class TestClassByExcel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		FileInputStream MyFile = new FileInputStream("C:\\Users\\User\\Documents\\ZerodaUserPsw.xlsx");
		Sheet sh = WorkbookFactory.create(MyFile).getSheet("Sheet1");
		String UserId = sh.getRow(0).getCell(0).getStringCellValue();
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		String pin = sh.getRow(0).getCell(2).getStringCellValue();
		Thread.sleep(1000);

		//1.POM1
		KiteLoginPageByExcel obj1=new KiteLoginPageByExcel(driver);
		Thread.sleep(1000);
		obj1.EnterUserId(UserId);
		obj1.EnterPassword(password);
        obj1.ClickOnLoginButton();


		//2.POM2
		KitePinValidationByExcel obj2 = new KitePinValidationByExcel(driver);
		Thread.sleep(1000);
	    obj2.EnterPin(pin);
	    obj2.ClickOnContinueButton();


	    //3.POM3
	    KiteHomepageByExcel obj3= new KiteHomepageByExcel(driver);
	    Thread.sleep(1000);
	    obj3.UserIdValidation();



	}

}
