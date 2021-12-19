import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listboxcheckboxexamples {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

		Thread.sleep(1000);

		//SELECETBYINDEX

		//step1
		WebElement Day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Thread.sleep(2000);
		//step2
		Select s1 = new Select(Day);
		//ste3
	     s1.selectByIndex(3);
	     Thread.sleep(1000);

	     //By days
	     List<WebElement> Days = s1.getOptions();
	     Thread.sleep(1000);

	     for(int i=0;i<=Days.size()-1;i++)
	     {
	     System.out.println(Days.get(i).getText());
	     }
	     System.out.println("=============================================");

	     //SELECTBYVALUE

	     //1
	    WebElement Month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		//2
	    Select s2 = new Select(Month);
	    //3
	    s2.selectByValue("3");
	    Thread.sleep(1000);

	    //by Months
	    List<WebElement> Months = s2.getOptions();

	    Thread.sleep(1000);
	    for(int i=0;i<=Months.size()-1;i++)
	     {
	     System.out.println(Months.get(i).getText());

	     }
	    System.out.println("=============================================");

	    //SELECTBYVISIBLETEXT

	    //1
	      WebElement Year = driver.findElement(By.xpath("//select[@title='Year']"));
	      //2
	      Select s3 = new Select(Year);
	      //3
	      s3.selectByVisibleText("1995");
	      Thread.sleep(1000);

	      //by Year
	     List<WebElement> Years = s3.getOptions();
	     Thread.sleep(1000);
	     for(int i=0;i<Years.size()-1;i++)
	     {
	    	 System.out.println(Years.get(i).getText());

	     }
	     System.out.println("=============================================");




	}

}
