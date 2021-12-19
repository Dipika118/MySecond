import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeysmethod {

	public static void main(String[] args) throws InterruptedException {


      System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/?hl=en");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("(//input[@class='_2hvTZ pexuQ zyHYP'])[1]")).sendKeys("dipikaw1234");

		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");

		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[text()='Log In']")).click();
	}

}
