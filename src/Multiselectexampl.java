import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselectexampl {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("https://techcanvass.com/examples/multi-select.html");

			WebElement Multiple_Option = driver.findElement(By.id("multiselect"));

			Select s=new Select(Multiple_Option);

			s.isMultiple();

			s.selectByIndex(0);
			Thread.sleep(1000);
			s.selectByIndex(1);
			Thread.sleep(1000);
			s.selectByIndex(2);
			Thread.sleep(1000);
			s.selectByIndex(3);
			Thread.sleep(1000);

			s.deselectByValue("opel");
			s.deselectByVisibleText("Maruti Suzuki");

	}

}
