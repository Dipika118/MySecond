import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample {

	public static void main(String[] args) throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("https://login.yahoo.com/?.intl=us");

			driver.findElement(By.id("login-username")).sendKeys("dipsnewareyahoo.com"); // by id

			Thread.sleep(1000);

			driver.findElement(By.name("username")).clear();// by name
			Thread.sleep(500);

			driver.findElement(By.xpath("//input[@id='login-signin']")).click(); //by xpath

			System.out.println(driver.findElement(By.linkText("Forgot username?")).getText()); //by linktext

			Thread.sleep(500);



			System.out.println(driver.findElement(By.partialLinkText("Create")).getText());//by partial linktext





	}

}
