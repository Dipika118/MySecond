package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);

	    driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	    Thread.sleep(1000);
	    WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
//		WebElement Month = driver.findElement(By.name("birthday_month"));
//		WebElement Year = driver.findElement(By.xpath("//select[@title='Year']"));
		Thread.sleep(1000);
        Actions act= new Actions(driver);
        act.moveToElement(day).perform();
//        Thread.sleep(1000);
//
//        for(int i=0;i<=11;i++)
//        {
//        	act.sendKeys(Keys.ARROW_UP).perform();
//        	Thread.sleep(1000);
//
//        }
//        act.sendKeys(Keys.ENTER).perform();


	}

}
