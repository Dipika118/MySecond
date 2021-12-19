package CollectionUsagestudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfImages {

	public static void main(String[] args) throws InterruptedException {
	       System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			Thread.sleep(1000);

			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

			List<WebElement> Images = driver.findElements(By.xpath("//img"));
			System.out.println("No of Images " +Images.size());



	}

}
