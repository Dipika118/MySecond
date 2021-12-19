import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;


public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.redbus.in/");

		driver.manage().window().maximize();
		Thread.sleep(1000);

		String Random= RandomString.make(4);

		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File Dest = new File("D:\\Screenshot by eclipse\\Myfirst "+Random+".png");

		org.openqa.selenium.io.FileHandler.copy(src, Dest);

	}

}
