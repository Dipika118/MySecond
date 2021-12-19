package POMwith_TestNG_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {
	@FindBy(id="userid") private WebElement UserID;
	@FindBy(id="password") private WebElement Password;
	@FindBy(xpath="//button[@type='submit']") private WebElement LoginButton;

    public  KiteLoginPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    public void EnterUserId(String Userid)
    {
    	UserID.sendKeys(Userid);
    }
    public void EnterPassword(String password)
    {
    	Password.sendKeys(password);
    }
    public void ClickOnLoginButton()
    {
    	LoginButton.click();
    }

}
