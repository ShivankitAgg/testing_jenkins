package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends BasePage{


	String AccessAllCourcesButton = "//div[@class='button float-left']/a[contains(text(),'Access all our Courses')]"; 

	public LandingPage(WebDriver driver) {
				super(driver);
		//PageFactory.initElements(driver, this);
	}
	
	public void ClikAcessAllCources()
	{
		getElementByXpath(AccessAllCourcesButton).click();
		
	}
	
	
	
	public void closepopup() {

	}

	public void getlogin() {
		
	}	
	public void clickcourses() {
		
	}

}
