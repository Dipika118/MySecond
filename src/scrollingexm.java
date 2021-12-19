
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class scrollingexm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.redbus.in/");
		//  (+x,+y)
//		(-x,+y)
//		(-x,-y)
//		(x,-y)

		Thread.sleep(1000);

		JavascriptExecutor j = (JavascriptExecutor)(driver);
		j.executeScript("window.scrollBy(500,900)");
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(-80,200)");
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(-100,-500)");

		Thread.sleep(2000);

		j.executeScript("window.scrollBy(80,-500)");




	}




}


