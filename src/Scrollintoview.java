import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollintoview {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.redbus.in/");

		driver.manage().window().maximize();

		Thread.sleep(1000);

		WebElement Ref = driver.findElement(By.xpath("//div[text()='Safety+']"));

		JavascriptExecutor js= (JavascriptExecutor)(driver);
		Thread.sleep(1000);

		js.executeScript("arguments[0].scrollIntoView();",Ref);
	}

}
