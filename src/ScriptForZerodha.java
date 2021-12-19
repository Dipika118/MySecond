import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScriptForZerodha {

public static void main(String[] args) throws InterruptedException
  {
	System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		driver.findElement(By.id("userid")).sendKeys("DV1510");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Pass@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("pin")).sendKeys("959594");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='user-id']")).click();
		WebElement target = driver.findElement(By.xpath("//a[@target='_self']"));
		Actions act = new Actions(driver);
		act.moveToElement(target).click().build().perform();
		String ActualText = driver.findElement(By.xpath("//span[@class='user-id']")).getText();

//		System.out.println(ActualText);

		String ExpectedText = "DV1510";

		if(ActualText.equals(ExpectedText))
		{
			System.out.println("TestCase is passed");
		}
		else
		{
			System.out.println("TestCase is Failed");
		}

 }

}

