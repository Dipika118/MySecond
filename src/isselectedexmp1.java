import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselectedexmp1 {

	public static void main(String[] args) throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

					WebDriver 	driver = new ChromeDriver();
					driver.get("https://www.discoveryplus.in/?gclid=EAIaIQobChMIrtPwsdTj8wIVExwrCh0o8Q1pEAAYASAAEgJmVfD_BwE");

					Thread.sleep(1000);
					driver.findElement(By.xpath("(//div[@id='#signIn'])[1]")).click();
	}

}
