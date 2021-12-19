package WebtableHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ReadSingleColumn {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
		ChromeOptions Opt = new ChromeOptions();
		Opt.addArguments("headless");
		WebDriver driver = new ChromeDriver(Opt);

		driver.get("file:///C:/Users/User/Desktop/automation%20notes/table.html");


		for(int i =2;i<=5;i++) {
	    WebElement Column = driver.findElement(By.xpath("//table[@id='1234']//tr["+i+"]/td[2]"));
	    System.out.println(Column.getText());


	}

}
}
