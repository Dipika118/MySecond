package Pophandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_browserpopup {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("http://demo.guru99.com/popup.php");
			   Thread.sleep(1000);

			   driver.findElement(By.xpath("//a[text()='Click Here']")).click();

			   //1.

//			  String mainpageid = driver.getWindowHandle();
//			  System.out.println(mainpageid);
			   Thread.sleep(1000);
			   Set<String> allpageid = driver.getWindowHandles();

			   System.out.println(allpageid);
			  //2.

			   Iterator <String> it = allpageid.iterator();
			  String Mainpage = it.next();
			  String child = it.next();

			  driver.switchTo().window(child);
			  Thread.sleep(1000);

			   driver.findElement(By.xpath("//input[@value='Submit']")).click();

			   // back to mainpage
			   Thread.sleep(1000);
			   driver.switchTo().window(Mainpage);



	}

}
