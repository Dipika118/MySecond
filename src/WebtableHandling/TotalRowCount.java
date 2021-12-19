package WebtableHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalRowCount {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/User/Desktop/automation%20notes/table.html");

		List<WebElement> FirstRow = driver.findElements(By.tagName("tr"));
		System.out.println( FirstRow.size());

		for(WebElement w :FirstRow)
		{
			System.out.println(w.getText());
		}

	}

}
