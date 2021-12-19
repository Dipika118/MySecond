package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clickexample {

	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
//		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1000);

		WebElement Login_Bttn = driver.findElement(By.xpath("//a[text()='Login']"));
		Thread.sleep(1000);

		Actions ac = new Actions(driver);

//		ac.moveToElement(Login_Bttn).perform();
//		Thread.sleep(1000);
//		ac.click().perform();

//		ac.moveToElement(Login_Bttn).click().build().perform();

		ac.click(Login_Bttn).perform();



	}

}
