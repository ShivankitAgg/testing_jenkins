package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

	WebDriver driver;



	public BasePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getElementByXpath(String xpath)
	{
		WebElement webElement= driver.findElement(By.xpath(xpath));
		return webElement;
	}
	}
