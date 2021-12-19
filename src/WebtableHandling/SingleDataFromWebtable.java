package WebtableHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SingleDataFromWebtable
{
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("file:///C:/Users/User/Desktop/automation%20notes/table.html");
	System.out.println(driver.findElement(By.xpath("//td[text()=' java ']")).getText());


}

}
