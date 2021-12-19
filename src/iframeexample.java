import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class iframeexample {

	public static void main(String[] args) throws InterruptedException {

		   System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("https://demoqa.com/frames");
			   Thread.sleep(1000);

			   //1. first we have to focused on iframe hence frame2 is id of iframe
			  driver.switchTo().frame("frame2");
			  Thread.sleep(2000);

			  //2. apply any operation in iframe
			  String iframetext = driver.findElement(By.id("sampleHeading")).getText();
			   System.out.println(iframetext);

		     //3. foucs on mainpage for mainpage actions

			   driver.switchTo().defaultContent();

			   //4. performing action on mainpage

			   System.out.println(driver.findElement(By.xpath("//div[text()='Frames']")).getText());













	}

}
