package FrameWork;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class KiteUSingExcel {

public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
  	System.setProperty("webdriver.chrome.driver","E:\\chrome\\chromedriver.exe");

	    ChromeOptions opt = new ChromeOptions();
	    opt.addArguments("disable_Notification");
		WebDriver driver = new ChromeDriver(opt);

		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();

		Thread.sleep(1000);

		FileInputStream MyFile = new FileInputStream("C:\\Users\\User\\Documents\\ZerodaUserPsw.xlsx");
		Sheet Sh = WorkbookFactory.create(MyFile).getSheet("Sheet1");
		String Userid = Sh.getRow(0).getCell(0).getStringCellValue();
		String PSW = Sh.getRow(0).getCell(1).getStringCellValue();
		String Pin = Sh.getRow(0).getCell(2).getStringCellValue();

		driver.findElement(By.id("userid")).sendKeys(Userid);
		driver.findElement(By.id("password")).sendKeys(PSW);

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("pin")).sendKeys(Pin);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(1000);
		String ActualText = driver.findElement(By.xpath("//span[@class='user-id']")).getText();

		driver.findElement(By.xpath("//span[@class='user-id']")).click();
		Thread.sleep(1000);
		WebElement target = driver.findElement(By.xpath("//a[contains(@href,'/logout')]"));

		Actions act = new Actions(driver);
		act.moveToElement(target).click().build().perform();
		String ExpectedText = Userid;

		if(ActualText.equals(ExpectedText))
		{
			System.out.println("TestCase is passed");
		}
		else
		{
			System.out.println("TestCase is Failed");
		}

	}

}