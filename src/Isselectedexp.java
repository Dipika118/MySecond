import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselectedexp {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

		WebDriver 	driver = new ChromeDriver();

		driver.get("https://www.nobroker.in/");
		 Thread.sleep(1000);

		WebElement PG_Button = driver.findElement(By.xpath("//input[@id='PG']"));

		Boolean Result=PG_Button.isSelected();

	    System.out.println("The Button is Selected "+Result);
	    Thread.sleep(2000);

	    PG_Button.click();
	    Thread.sleep(2000);
	    Boolean Result1=PG_Button.isSelected();
		System.out.println("The Button is Selected "+Result1);




	}

}
