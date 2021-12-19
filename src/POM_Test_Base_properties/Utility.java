package POM_Test_Base_properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {


public static String gettingdatafromProperties(String key) throws IOException
{
	Properties obj = new Properties();
	FileInputStream MyFile = new FileInputStream("‪C:\\Users\\Neware\\User\\eclipse-new\\Selenium_Study\\21_aug.properties");
	obj.load(MyFile);
	String value = obj.getProperty(key);
	return value;
	
}


	public static void CaptureScreenshot(WebDriver driver,int TCID) throws IOException // tc id no for particular tc screenshot
	{
		int TCID1=10;
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("D:\\Screenshot by eclipse\\Myfirst\\ "+TCID1+".png");
	  org.openqa.selenium.io.FileHandler.copy(src, dest);
	}
	
}

