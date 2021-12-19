package DyanamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_child {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("Redmi 10 pro");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		WebElement Actualresult = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//div)[13]"));
	   String  Result=Actualresult.getText();

	   String Expectedresult = "Review";

	   if(Result.equalsIgnoreCase(Expectedresult))
	   {
		   System.out.println("Testcase is passed");
	   }
	   else
	   System.out.println("Testcase is failed");


	}

}
