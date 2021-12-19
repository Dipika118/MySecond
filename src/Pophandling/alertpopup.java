package Pophandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

		    	driver.get("http://demo.guru99.com/test/delete_customer.php");
			   Thread.sleep(1000);
			   driver.findElement(By.name("submit")).click();

			   Alert alt = driver.switchTo().alert();
			   Thread.sleep(1000);
			   alt.getText();
			   alt.accept();
			   Thread.sleep(1000);
			   alt.accept();

	}
}
