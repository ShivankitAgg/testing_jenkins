package Ui_Tests;

import org.testng.annotations.Test;

import com.myproject.utils.*;
import Pages.LandingPage;
import Pages.UdemyPage;

public class landing_page extends BaseWebTest{
	
	
	
	@Test
	public void clickLogin()
	{
		LandingPage landingpage = new LandingPage(getDriver());
		UdemyPage udemyPage = new UdemyPage(getDriver());
		landingpage.ClikAcessAllCources();
		udemyPage.ClickLoginButton();
	}

	
	
	

}
