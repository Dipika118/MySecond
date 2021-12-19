package CollectionUsagestudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfCheckboxes {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("The no of checkboxes " +checkboxes.size());

//		for(int i =0;i<=checkboxes.size()-1;i++)
//		{
//			Thread.sleep(1000);
//			checkboxes.get(i).click();
//		}
		for(int i=checkboxes.size()-1;i>=0;i--)
		{
			Thread.sleep(1000);
			checkboxes.get(i).click();
		}


	}

}
