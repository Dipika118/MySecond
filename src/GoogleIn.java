import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleIn {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("https://www.google.co.in/");

			driver.manage().window().maximize();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Nagpur");
			List<WebElement> Numofele = driver.findElements(By.xpath("//ul[@role='listbox']"));
			
			Numofele.get(2).click();

	}

}