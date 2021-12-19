package CollectionUsagestudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOFLinksOnPage {

   	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();

		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println("The no. of links are "+links.size());

		// what is the links

		for(int i = 0;i<=links.size()-1;i++)
		{
			System.out.println("The links are "+links.get(i).getText());
		}

	}

}
