package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		WebElement Double_click = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));

		Actions act= new Actions(driver);
//		act.moveToElement(Double_click).doubleClick().build().perform();
		act.doubleClick(Double_click).perform();
	}

}
