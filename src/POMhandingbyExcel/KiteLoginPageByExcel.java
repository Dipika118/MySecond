package POMhandingbyExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPageByExcel{

	@FindBy(id="userid") private WebElement UserID;
	@FindBy(id="password") private WebElement Password;
	@FindBy(xpath="//button[@type='submit']") private WebElement LoginButton;

    public KiteLoginPageByExcel(WebDriver driver)
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