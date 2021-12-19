import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		String actual = driver.getTitle();
		String expected = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";

		driver.manage().window().minimize();

		if(actual.equals(expected))
		{
			System.out.println("Testcases is passed");
		}
		else
		{
			System.out.println("Testcases is Failed");
		}

	}

}
