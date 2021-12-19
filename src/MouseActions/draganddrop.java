package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement Src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement Desti = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));

		Actions ac = new Actions(driver);
		Thread.sleep(1000);

//		ac.moveToElement(Src).clickAndHold().release(Desti).build().perform();
//		ac.moveToElement(Src).clickAndHold(Src).build().perform();
//		ac.release(Desti).perform();
		ac.dragAndDrop(Src, Desti).perform();


	}

}
