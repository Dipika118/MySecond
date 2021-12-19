package DyanamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dyanmiclist {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("T20 final Match");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//ul[@class='G43f7e'])[1]//li[3]")).click();

	}

}
