package Pages;

import org.openqa.selenium.WebDriver;

public class UdemyPage extends BasePage{

	public UdemyPage(WebDriver driver) {
		super(driver);
	}
	
	String LoginButton="//span[contains(text(),'Log in')]";
	
	public void ClickLoginButton()
	{
		getElementByXpath(LoginButton).click();
	}

}
