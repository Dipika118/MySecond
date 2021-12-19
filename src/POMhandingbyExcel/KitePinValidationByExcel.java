package POMhandingbyExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinValidationByExcel {

	@FindBy(id="pin") private WebElement Pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement ClickOnContinue;


	public KitePinValidationByExcel(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void EnterPin(String pin)
	{

	Pin.sendKeys(pin);
	}
	public void ClickOnContinueButton() {
		ClickOnContinue.click();
	}
	}

