package WebtableHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleRowUsingParentchild {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/User/Desktop/automation%20notes/table.html");

		List<WebElement> header = driver.findElements(By.xpath("//table[@id='1234']//tr[1]"));
		 for(WebElement w : header)
		 {
			 System.out.println(w.getText());
		 }

	}

}
