package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);

	    WebElement RightClick_BUtton = driver.findElement(By.xpath("//span[contains(text(),'right ')]"));

	    Actions a = new Actions(driver);

//	    a.moveToElement(RightClick_BUtton).contextClick().build().perform();
        a.contextClick(RightClick_BUtton).perform();
	}

}