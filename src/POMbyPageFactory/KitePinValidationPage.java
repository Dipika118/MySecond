package POMbyPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinValidationPage {

	//1. Declaration

	@FindBy(id="pin") private WebElement Pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement ContinueButton;

	//2. Constructor

	public KitePinValidationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//3. Usage for variables

	public void EnterPin() {
		Pin.sendKeys("092016");
		ContinueButton.click();
	}




}

