import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenabledexam {

	public static void main(String[] args) throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

			WebDriver 	driver = new ChromeDriver();

			driver.get("https://www.jio.com/selfcare/lost-login/");


			Thread.sleep(1000);
		WebElement Submit_Button = driver.findElement(By.xpath("//button[text()='Proceed']"));
		Boolean Result=Submit_Button.isEnabled();
//		Thread.sleep(1000);
//		System.out.println("The procced button is enabled " +Result);
//		Thread.sleep(1000);
//		driver.findElement(By.name("jioNrInputName")).sendKeys("8974563789");
//		Boolean Result1=Submit_Button.isEnabled();
//		Thread.sleep(1000);
//		System.out.println("The proceed button is enabled " +Result1);

		if(Submit_Button.isEnabled())
		{

			System.out.println("The proceed button is enabled" +Result);
		}
		else
		{
			driver.findElement(By.name("jioNrInputName")).sendKeys("8974563789");
			System.out.println("The proceed button is enabled" +Result);
		}



	}

}
