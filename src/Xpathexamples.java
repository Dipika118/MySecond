import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathexamples {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://twitter.com/?lang=en");

		driver.findElement(By.xpath("//span[text()='Sign up with phone or email']")).click();

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Dipika");

		driver.findElement(By.xpath("//select[@id='SELECTOR_1']")).click();




	}

}
