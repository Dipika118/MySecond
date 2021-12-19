package POM_Base_Testclasses_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {
	@FindBy(id="userid") private WebElement UserID;
	@FindBy(id="password") private WebElement Password;
	@FindBy(xpath="//button[@type='submit']") private WebElement LoginButton;
	@FindBy(xpath="//span[@class='su-message']") private WebElement Errormsg;
	@FindBy(xpath="(//span[@class='su-message'])") private WebElement ErrormsgOfUserid;

	@FindBy(xpath="(//span[@class='su-message'])[2]") private WebElement ErrormsgOfPassword;

    public KiteLoginPage(WebDriver driver)
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
	public String getErrormsg() {
		String ActualErrormsg = Errormsg.getText();
		return ActualErrormsg;

	}
	public String getUseridmsg() {
		String ActualUSeriderrormsg = ErrormsgOfUserid.getText();
		return ActualUSeriderrormsg;
	}
	public String getErrormsgPsw() {
		String ActualPsweroormsg = ErrormsgOfPassword.getText();
		return ActualPsweroormsg;
	}

}
