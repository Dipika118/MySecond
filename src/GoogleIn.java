import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class GoogleIn {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("https://www.google.co.in/");

			driver.manage().window().maximize();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Nagpur");
			
//			Actions act = new Actions(driver);
//			act.moveToElement(null)
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul/li[7]/div/div[2]")).click();
			
//			List<WebElement> NoOFEle = driver.findElements(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul"));
//			System.out.println(NoOFEle.size());
//			
//			for(int i=1;i<=NoOF)
			
			
			

	}

}