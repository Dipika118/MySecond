import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://twitter.com/?lang=en");



		String Actuallink = driver.findElement(By.linkText("Twitter for Business")).getText();

		String Expectedlink = "Twitter";

		if(Actuallink.equals(Expectedlink))
		{
			System.out.println("Testcase is Passed");
		}
		else
		{
			System.out.println("Testcase is Failed");
		}
	}

}
