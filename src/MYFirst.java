import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MYFirst {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
	String url 	=driver.getCurrentUrl();
	System.out.println("current url is "+url);

	System.out.println( driver.getTitle());

		Thread.sleep(500);

		driver.close();

	}

}
